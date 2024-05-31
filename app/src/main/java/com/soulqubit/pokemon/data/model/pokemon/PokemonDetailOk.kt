package com.soulqubit.pokemon.data.model.pokemon

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "pokemon_detail_table")
data class PokemonDetailOk(
    @PrimaryKey
    @SerializedName("numreg")
    val numreg: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("weight")
    val weight: Int
)