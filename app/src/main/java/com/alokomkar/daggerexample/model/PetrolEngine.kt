package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    private val TAG = "PetrolEngine"

    override fun startEngine() {
        Log.d(TAG, "Petrol engine started")
    }
}