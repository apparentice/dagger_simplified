package com.alokomkar.daggerexample.di

import com.alokomkar.daggerexample.MainActivity
import com.alokomkar.daggerexample.model.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
    fun inject( mainActivity: MainActivity )
}