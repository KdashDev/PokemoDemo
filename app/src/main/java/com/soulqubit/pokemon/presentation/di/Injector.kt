package com.soulqubit.pokemon.presentation.di

import com.soulqubit.pokemon.presentation.di.pokemon.PokemonDetailSubComponent


interface Injector {
   fun createMovieSubComponent():PokemonDetailSubComponent
}