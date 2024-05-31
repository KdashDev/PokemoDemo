package com.soulqubit.pokemon.presentation.pokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.soulqubit.pokemon.domain.usecase.GetPokemonUseCase
import com.soulqubit.pokemon.domain.usecase.UpdatePokemonUseCase


class PokemonViewModelFactory(
    private val getPokemonUseCase: GetPokemonUseCase,
    private val updatePokemonUseCase: UpdatePokemonUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PokemonViewModel(getPokemonUseCase,updatePokemonUseCase) as T
    }
}

