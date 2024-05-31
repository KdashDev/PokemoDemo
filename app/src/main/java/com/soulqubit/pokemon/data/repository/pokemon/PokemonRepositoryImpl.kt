package com.soulqubit.pokemon.data.repository.pokemon

import android.util.Log
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonCacheDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonLocalDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonRemoteDatasource
import com.soulqubit.pokemon.domain.repository.PokemonRepository
import java.lang.Exception

class PokemonRepositoryImpl(
    private val pokemonRemoteDatasource: PokemonRemoteDatasource,
    private val pokemonLocalDataSource: PokemonLocalDataSource,
    private val pokemonCacheDataSource: PokemonCacheDataSource
) : PokemonRepository {
    override suspend fun getPokemonDetail():PokemonDetailOk? {
        //return getMoviesFromCache()
        return getPokemonDetailFromAPI()

    }

    override suspend fun updatePokemonDetail():PokemonDetailOk? {
        val newListOfMovies = getPokemonDetailFromAPI()
        pokemonLocalDataSource.clearAll()
        pokemonLocalDataSource.savePokemonDetailToDB(newListOfMovies)
        pokemonCacheDataSource.savePokemonDetailToCache(newListOfMovies)
        return newListOfMovies
    }

    private suspend fun getPokemonDetailFromAPI():PokemonDetailOk {
        try {
            val response = pokemonRemoteDatasource.getPokemonDetail()
            val body = response.body()
            if (body != null) {

                return body
            }

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return PokemonDetailOk(0,0,0,"",0)
    }

    private suspend fun getPokemonDetailFromDB():PokemonDetailOk {
        lateinit var pokemonDetailList:PokemonDetailOk
        try {
            pokemonDetailList = pokemonLocalDataSource.getPokemonDetailFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (pokemonDetailList != null) {
            return pokemonDetailList
        } else {
            pokemonDetailList = getPokemonDetailFromAPI()
            pokemonLocalDataSource.savePokemonDetailToDB(pokemonDetailList)
        }

        return pokemonDetailList
    }

    private suspend fun getPokemonDetailFromCache():PokemonDetailOk {
        lateinit var pokemonDetailList:PokemonDetailOk
        try {
            pokemonDetailList = pokemonCacheDataSource.getPokemonDetailFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (pokemonDetailList != null) {
            return pokemonDetailList
        } else {
            pokemonDetailList = getPokemonDetailFromDB()
            pokemonCacheDataSource.savePokemonDetailToCache(pokemonDetailList)
        }

        return pokemonDetailList
    }


}