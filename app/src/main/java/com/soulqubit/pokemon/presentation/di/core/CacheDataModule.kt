package com.soulqubit.pokemon.presentation.di.core


import com.soulqubit.pokemon.data.repository.pokemon.datasource.PokemonCacheDataSource
import com.soulqubit.pokemon.data.repository.pokemon.datasourceImpl.PokemonCacheDataSourceImpl

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun providePokemonCacheDataSource(): PokemonCacheDataSource {
        return PokemonCacheDataSourceImpl()
    }
}