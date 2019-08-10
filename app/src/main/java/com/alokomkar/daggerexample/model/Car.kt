package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor( private val engine : Engine,
                private val wheels : Wheels
) {

    private val TAG = "Car"

    @Inject
    fun enableRemote( remote: Remote ) {
        //Inject called here is automatically executed with no need to call this function explicitly
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "Start driving...")
    }
}