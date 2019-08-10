package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.model.lib_models.Rims
import com.alokomkar.daggerexample.model.lib_models.Tyres
import com.alokomkar.daggerexample.model.lib_models.Wheels
import dagger.Module
import dagger.Provides

//To generate objects / instances when we don't own the class - for ex. Retrofit, okhttp builder...
@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims = Rims()

    @Provides
    fun provideTyres() : Tyres = Tyres()

    //Rims and Tyres are taken from above provide methods
    @Provides
    fun provideWheels( rims: Rims, tyres: Tyres ) = Wheels(rims, tyres)
}