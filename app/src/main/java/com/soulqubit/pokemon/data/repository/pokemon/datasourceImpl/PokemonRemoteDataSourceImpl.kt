package com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl

import com.soulqubit.pokemon.data.api.PokemonService
import com.soulqubit.pokemon.data.model.pokemon.Pokemon
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonRemoteDatasource
import retrofit2.Response

class PokemonRemoteDataSourceImpl(
    private val pokemonService: PokemonService,
    private val id:String
): PokemonRemoteDatasource {
    override suspend fun getPokemonDetail(): Response<PokemonDetailOk> = pokemonService.getPokemonDetail(id)
    override suspend fun getPokemon(offset: String, limit: String): Response<Pokemon>  = pokemonService.getPokemon(offset,limit)

}

