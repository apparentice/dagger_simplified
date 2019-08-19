package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.model.DieselEngine
import com.alokomkar.daggerexample.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun provideEngine( dieselEngine : DieselEngine ) : Engine = dieselEngine
}