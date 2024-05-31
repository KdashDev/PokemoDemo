package com.soulqubit.pokemon.presentation.di.core


import com.soulqubit.pokemon.data.repository.pokemon.PokemonRepositoryImpl
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonCacheDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonLocalDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonRemoteDatasource
import com.soulqubit.pokemon.domain.repository.PokemonRepository

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providePokemonDetailRepository(
        pokemonRemoteDatasource: PokemonRemoteDatasource,
        pokemonLocalDataSource: PokemonLocalDataSource,
        pokemonCacheDataSource: PokemonCacheDataSource
    ): PokemonRepository {

        return PokemonRepositoryImpl(
            pokemonRemoteDatasource,
            pokemonLocalDataSource,
            pokemonCacheDataSource
        )
    }
}