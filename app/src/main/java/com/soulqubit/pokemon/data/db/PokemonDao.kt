package com.soulqubit.pokemon.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetail
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePokemonDetail(pokemonDetails: PokemonDetailOk)

    @Query("DELETE FROM  pokemon_detail_table")
    suspend fun deleteAllPokemonDetail()

    @Query("SELECT * FROM  pokemon_detail_table")
    suspend fun gePokemonDetail():PokemonDetailOk
}