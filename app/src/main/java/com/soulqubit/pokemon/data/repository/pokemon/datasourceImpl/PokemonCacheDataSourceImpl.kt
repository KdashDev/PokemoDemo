package com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl

import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonCacheDataSource

class PokemonCacheDataSourceImpl :
    PokemonCacheDataSource {
    private lateinit var pokemonDetailList:PokemonDetailOk

    override suspend fun getPokemonDetailFromCache():PokemonDetailOk {
        return pokemonDetailList
    }

    override suspend fun savePokemonDetailToCache(pokemonDetails:PokemonDetailOk) {
    }
}