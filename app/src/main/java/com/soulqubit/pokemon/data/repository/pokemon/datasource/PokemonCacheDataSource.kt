package com.soulqubit.pokemon.data.repository.pokemon.datasource

import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk

interface PokemonCacheDataSource {
    suspend fun getPokemonDetailFromCache(): PokemonDetailOk
    suspend fun savePokemonDetailToCache(pokemonDetails:PokemonDetailOk)

}