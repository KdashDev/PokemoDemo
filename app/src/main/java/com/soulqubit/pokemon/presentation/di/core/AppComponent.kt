package com.soulqubit.pokemon.presentation.di.core

import com.soulqubit.pokemon.presentation.di.pokemon.PokemonDetailSubComponent

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun pokemonDetailSubComponent():PokemonDetailSubComponent.Factory


}