package com.soulqubit.pokemon.presentation.di.core

import android.content.Context

import com.soulqubit.pokemon.presentation.di.pokemon.PokemonDetailSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [PokemonDetailSubComponent::class])
class AppModule(private val context: Context) {

 @Singleton
 @Provides
 fun provideApplicationContext():Context{
     return context.applicationContext
 }





}