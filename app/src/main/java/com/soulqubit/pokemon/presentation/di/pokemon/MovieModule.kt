package com.soulqubit.pokemon.presentation.di.pokemon

import com.soulqubit.pokemon.domain.usecase.GetPokemonUseCase
import com.soulqubit.pokemon.domain.usecase.UpdatePokemonUseCase
import com.soulqubit.pokemon.presentation.pokemon.PokemonViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getPokemonUseCase: GetPokemonUseCase,
        updatePokemonUseCase: UpdatePokemonUseCase
    ): PokemonViewModelFactory {
        return PokemonViewModelFactory(
            getPokemonUseCase,
            updatePokemonUseCase
        )
    }

}