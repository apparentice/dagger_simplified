package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    private val TAG = "DieselEngine"

    override fun startEngine() {
        Log.d(TAG, "Diesel engine started")
    }
}