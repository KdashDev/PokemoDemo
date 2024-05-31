package com.soulqubit.pokemon.domain.usecase

import com.soulqubit.pokemon.data.model.pokemon.PokemonDetail
import com.soulqubit.pokemon.data.model.pokemon.PokemonDetailOk
import com.soulqubit.pokemon.domain.repository.PokemonRepository

class GetPokemonUseCase(private val pokemonRepository: PokemonRepository) {
  suspend fun execute():PokemonDetailOk? = pokemonRepository.getPokemonDetail()
}