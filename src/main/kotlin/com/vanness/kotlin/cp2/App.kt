package com.vanness.kotlin.cp2

fun main() {
    println("Masukkan Jumlah Case yang ingin dimasukkan :")
    val T = readLine()!!.toInt()
    for (i in 1..T) {
        println("Masukkan Angka : ")
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        var sum = 0
        for (j in a..b) {
            if (j % 2 != 0) {
                sum += j
            }
        }
        println("Case $i: $sum")
    }
}
