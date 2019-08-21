package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.model.DieselEngine
import com.alokomkar.daggerexample.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    private var horsePower : Int = 0

    @Provides
    fun provideHorsePower() = horsePower

    @Provides
    fun provideEngine( dieselEngine : DieselEngine ) : Engine = dieselEngine
}