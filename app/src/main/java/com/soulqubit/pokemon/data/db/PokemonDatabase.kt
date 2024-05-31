package com.soulqubit.pokemon.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.data.model.pokemon.PokemonResultList


@Database(entities = [PokemonDetailOk::class,PokemonResultList::class],
version = 1,
exportSchema = false
)
abstract class PokemonDatabase : RoomDatabase(){
abstract fun pokemonDao(): PokemonDao
}