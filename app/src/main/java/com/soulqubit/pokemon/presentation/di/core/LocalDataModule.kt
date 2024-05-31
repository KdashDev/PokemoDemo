package com.soulqubit.pokemon.presentation.di.core

import com.soulqubit.pokemon.data.db.PokemonDao

import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonLocalDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl.PokemonLocalDataSourceImpl

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun providePokemonDetailLocalDataSource(pokemonDao: PokemonDao):PokemonLocalDataSource{
        return PokemonLocalDataSourceImpl(pokemonDao)
    }

}