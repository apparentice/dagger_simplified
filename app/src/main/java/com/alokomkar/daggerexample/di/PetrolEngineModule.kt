package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.model.Engine
import com.alokomkar.daggerexample.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine( petrolEngine: PetrolEngine ) : Engine
}