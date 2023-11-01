package com.richard.exercicios

import kotlin.Array

class Array {
}

fun main() {
    var array: IntArray = IntArray(40)

    for (i in array.indices){
        array[i] = i * 1
        println(array[i])
    }
}