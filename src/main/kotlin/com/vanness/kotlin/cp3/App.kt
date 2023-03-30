package com.vanness.kotlin.cp3

import kotlin.math.abs

fun main() {
    while (true) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break
        val numbers = mutableListOf<Int>()
        repeat(n) {
            numbers.add(readLine()!!.toInt())
        }
        numbers.sortWith(Comparator { num1, num2 ->
            compare(num1, num2, m)
        })
        println("$n $m")
        numbers.forEach { println(it) }
    }
}

fun compare(num1: Int, num2: Int, mod: Int): Int {
    val modx = if (num1 < 0) abs(num1) % mod else num1 % mod
    val mody = if (num2 < 0) abs(num2) % mod else num2 % mod
    if (modx < mody) {
        return -1
    } else if (modx > mody) {
        return 1
    } else {
        if (num1 % 2 == 0 && num2 % 2 == 1) {
            return 1
        } else if (num1 % 2 == 1 && num2 % 2 == 0) {
            return -1
        } else if (num1 % 2 == 1 && num2 % 2 == 1) {
            return if (num1 < num2) 1 else -1
        } else {
            return if (num1 < num2) -1 else 1
        }
    }
}


