package com.soulqubit.pokemon.presentation.di.core
import com.soulqubit.pokemon.domain.repository.PokemonRepository
import com.soulqubit.pokemon.domain.usecase.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetPokemonDetailUseCase(pokemonRepository: PokemonRepository):GetPokemonUseCase{
        return GetPokemonUseCase(pokemonRepository)
    }
    @Provides
    fun provideUpdatePokemonDetailUseCase(pokemonRepository: PokemonRepository):UpdatePokemonUseCase{
        return UpdatePokemonUseCase(pokemonRepository)
    }

}