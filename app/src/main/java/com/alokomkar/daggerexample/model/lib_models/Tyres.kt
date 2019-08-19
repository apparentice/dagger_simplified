package com.alokomkar.daggerexample.model.lib_models

import android.util.Log

//Assume this is a private class available in external library,
//so we don't have a way to directly inject this via constructor
class Tyres {
    private val TAG = "Tyres"

    init {
        Log.d(TAG, "Tyres inflated...")
    }
}