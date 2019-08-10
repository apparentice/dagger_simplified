package com.alokomkar.daggerexample.model.lib_models

//Assume this is a private class available in external library,
//so we don't have a way to directly inject this via constructor anymore
class Wheels constructor( private val rims: Rims, private val tyres: Tyres )
