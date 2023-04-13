package com.vanness.kotlin.cp4

import kotlin.math.sqrt
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun isEmirp(num: Int): Boolean {
    if (isPrime(num)) {
        val reversedNum = num.toString().reversed().toInt()
        if (num != reversedNum && isPrime(reversedNum)) {
            return true
        }
    }
    return false
}

fun main() {
    println("Masukkan Angka : ")
    val nValues = mutableListOf<Int>()
    while (true) {
        val input = readLine()?.toIntOrNull()
        if (input == null) break
        nValues.add(input)
    }

    for (num in nValues) {
        when {
            isEmirp(num) -> println("$num is emirp.")
            isPrime(num) -> println("$num is prime.")
            else -> println("$num is not prime.")
        }
        //setelah selesai memasukkan angka, tekan enter lagi untuk menghentikan inputan
    }
}