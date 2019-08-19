package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.MainActivity
import com.alokomkar.daggerexample.model.Car
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car
    fun inject( mainActivity: MainActivity )
}