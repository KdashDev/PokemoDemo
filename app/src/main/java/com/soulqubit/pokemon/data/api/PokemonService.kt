package com.soulqubit.pokemon.data.api


import com.soulqubit.pokemon.data.model.pokemon.Pokemon
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {

    @GET("movie/popular")
    suspend fun getPokemonDetail(
        @Query(
            "id"
        ) id: String
    ): Response<PokemonDetailOk>

    @GET("api/v2/pokemon")
    suspend fun getPokemon(
        @Query(
            "limit"
        ) limit: String,
        @Query(
            "offset"
        ) offset: String
    ): Response<Pokemon>
}