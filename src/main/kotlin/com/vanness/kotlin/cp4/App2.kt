package com.vanness.kotlin.cp4

fun main() {
    println("Masukkan Jumlah Case : ")
    val t = readLine()!!.toInt()
    println("Masukkan Angka : ")
    repeat(t) {
        val n = readLine()!!
        val b1 = n.toInt().toString(2).count { it == '1' }
        val b2 = n.toInt(16).toString(2).count { it == '1' }
        println("$b1 $b2")
    }
}
