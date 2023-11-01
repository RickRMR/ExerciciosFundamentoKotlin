package com.richard.exercicios

class Par {
}

fun main() {
    var parImpar: String
    var numero = 6

    parImpar = if (numero % 2==0) "par" else "impar"
    println(parImpar)
}