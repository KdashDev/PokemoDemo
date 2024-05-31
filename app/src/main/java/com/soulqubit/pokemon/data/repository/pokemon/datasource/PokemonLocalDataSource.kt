package com.soulqubit.pokemon.data.repository.pokemon.datasource

import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk

interface PokemonLocalDataSource {
  suspend fun getPokemonDetailFromDB(): PokemonDetailOk
  suspend fun savePokemonDetailToDB(pokemonDetails:PokemonDetailOk)
  suspend fun clearAll()
}