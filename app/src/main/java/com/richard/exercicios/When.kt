package com.richard.exercicios

class When {
}

fun main() {
    var parImpar: String
    var numero = 5

    parImpar = when{
        numero % 2 ==0 -> "par" else -> "impar"
    }
    println(parImpar)
}