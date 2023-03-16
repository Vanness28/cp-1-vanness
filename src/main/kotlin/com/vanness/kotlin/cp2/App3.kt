package com.vanness.kotlin.cp2

import java.util.Scanner

fun main() {
    println("Masukkan Kalimat : ")
    val scanner = Scanner(System.`in`)
    var quote = true

    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        var result = ""
        for (c in line) {
            if (c == '"') {
                result += if (quote) "``" else "''"
                quote = !quote
            } else {
                result += c
            }
        }
        println(result)
    }
}