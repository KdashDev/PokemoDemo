package com.soulqubit.pokemon.presentation.di.core

import com.soulqubit.pokemon.data.api.PokemonService
import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonRemoteDatasource
import com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl.PokemonRemoteDataSourceImpl

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(
    private val id: String
) {
    @Singleton
    @Provides
    fun providePokemonDetailRemoteDataSource(pokemonService: PokemonService): PokemonRemoteDatasource {
        return PokemonRemoteDataSourceImpl(
            pokemonService, id
        )
    }
}