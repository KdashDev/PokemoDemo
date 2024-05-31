package com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl

import com.soulqubit.pokemon.data.db.PokemonDao
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonLocalDataSource

class PokemonLocalDataSourceImpl(private val pokemonDao:PokemonDao):
    PokemonLocalDataSource {
    override suspend fun getPokemonDetailFromDB():PokemonDetailOk {
       return pokemonDao.gePokemonDetail()
    }

    override suspend fun savePokemonDetailToDB(pokemonDetails: PokemonDetailOk) {
    }

    override suspend fun clearAll() {
    }
}