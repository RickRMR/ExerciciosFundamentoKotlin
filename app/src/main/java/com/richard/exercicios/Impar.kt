package com.richard.exercicios

class Impar {
}

fun main() {
    var parImpar: String
    var numero = 5

    parImpar = if (numero % 2==0) "par" else "impar"
    println(parImpar)
}