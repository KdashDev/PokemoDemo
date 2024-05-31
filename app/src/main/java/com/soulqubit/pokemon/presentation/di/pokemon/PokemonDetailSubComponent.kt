package com.soulqubit.pokemon.presentation.di.pokemon

import com.soulqubit.pokemon.presentation.pokemon.PokemonActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface PokemonDetailSubComponent {
    fun inject(pokemonActivity: PokemonActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():PokemonDetailSubComponent
    }

}

