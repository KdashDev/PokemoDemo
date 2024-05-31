package com.soulqubit.pokemon.data.repository.pokemon.datasource

import com.soulqubit.pokemon.data.model.pokemon.Pokemon
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import retrofit2.Response

interface PokemonRemoteDatasource {
   suspend fun getPokemonDetail(): Response<PokemonDetailOk>
   suspend fun getPokemon(offset: String, limit: String): Response<Pokemon>
}