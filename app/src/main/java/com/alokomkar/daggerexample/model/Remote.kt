package com.alokomkar.daggerexample.model

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG = "Remote"

    fun setListener( car : Car ) {
        Log.d(TAG, "Remote connected")
    }
}