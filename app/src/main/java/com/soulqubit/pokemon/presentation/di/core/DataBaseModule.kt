package com.soulqubit.pokemon.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.soulqubit.pokemon.data.db.PokemonDao
import com.soulqubit.pokemon.data.db.PokemonDatabase

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun providePokemonDetailDataBase(context: Context):PokemonDatabase{
     return Room.databaseBuilder(context,PokemonDatabase::class.java,"pokemon")
         .build()
    }
    @Singleton
    @Provides
    fun providePokemonDetailDao(pokemonDatabase: PokemonDatabase):PokemonDao{
        return pokemonDatabase.pokemonDao()
    }

}