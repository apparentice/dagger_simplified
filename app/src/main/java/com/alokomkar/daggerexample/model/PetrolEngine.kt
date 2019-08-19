package com.alokomkar.daggerexample.model

import android.util.Log

class PetrolEngine constructor(private val horsePower: Int) : Engine {

    private val TAG = "PetrolEngine"

    override fun startEngine() {
        Log.d(TAG, "Petrol engine started : horse power : $horsePower")
    }
}