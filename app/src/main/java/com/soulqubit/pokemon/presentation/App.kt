package com.soulqubit.pokemon.presentation

import android.app.Application
import com.soulqubit.pokemon.BuildConfig
import com.soulqubit.pokemon.presentation.di.Injector
import com.soulqubit.pokemon.presentation.di.core.*
import com.soulqubit.pokemon.presentation.di.pokemon.PokemonDetailSubComponent


class App : Application(), Injector {
private lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): PokemonDetailSubComponent {
        return appComponent.pokemonDetailSubComponent().create()
    }


}