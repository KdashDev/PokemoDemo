package com.soulqubit.pokemon.domain.repository


import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk

interface PokemonRepository {

    suspend fun getPokemonDetail(): PokemonDetailOk?
    suspend fun updatePokemonDetail():PokemonDetailOk?

}