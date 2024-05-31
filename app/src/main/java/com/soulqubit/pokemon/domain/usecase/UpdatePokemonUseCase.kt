package com.soulqubit.pokemon.domain.usecase

import com.soulqubit.pokemon.data.model.pokemon.PokemonDetail
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.domain.repository.PokemonRepository

class UpdatePokemonUseCase(private val pokemonRepository: PokemonRepository) {
    suspend fun execute(): PokemonDetailOk? = pokemonRepository.updatePokemonDetail()
}