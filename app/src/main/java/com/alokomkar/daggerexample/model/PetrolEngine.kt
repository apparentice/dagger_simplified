package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(private val horsePower: Int) : Engine {

    private val TAG = "PetrolEngine"

    override fun startEngine() {
        Log.d(TAG, "Petrol engine started : horse power : $horsePower")
    }
}