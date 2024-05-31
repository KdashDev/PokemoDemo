package com.soulqubit.pokemon.data.model.pokemon
import com.google.gson.annotations.SerializedName


data class Pokemon(
    @SerializedName("next")
    val next: String,
    @SerializedName("results")
    val results: List<PokemonResultList>
)