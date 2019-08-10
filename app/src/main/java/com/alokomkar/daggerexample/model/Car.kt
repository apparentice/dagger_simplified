package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor( private val engine : Engine,
                private val wheels : Wheels
) {

    private val TAG = "Car"

    fun drive() {
        Log.d(TAG, "Start driving...")
    }
}