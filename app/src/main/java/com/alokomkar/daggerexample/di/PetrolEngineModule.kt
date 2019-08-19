package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.model.Engine
import com.alokomkar.daggerexample.model.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule constructor(private var horsePower: Int) {
    @Provides
    fun provideEngine(): Engine = PetrolEngine(horsePower)
}