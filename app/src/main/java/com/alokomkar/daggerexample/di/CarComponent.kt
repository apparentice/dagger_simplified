package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.MainActivity
import com.alokomkar.daggerexample.model.Car
import dagger.BindsInstance
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car
    fun inject( mainActivity: MainActivity )

    //Manual builder generation
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower( horsePower : Int ) : Builder

        fun build() : CarComponent
    }
}