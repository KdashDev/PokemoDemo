package com.soulqubit.pokemon.presentation.pokemon


import androidx.lifecycle.ViewModel
import com.soulqubit.pokemon.domain.usecase.GetPokemonUseCase
import com.soulqubit.pokemon.domain.usecase.UpdatePokemonUseCase


class PokemonViewModel(
    private val getPokemonUseCase: GetPokemonUseCase,
    private val updatePokemonUseCase: UpdatePokemonUseCase
) : ViewModel() {


}





