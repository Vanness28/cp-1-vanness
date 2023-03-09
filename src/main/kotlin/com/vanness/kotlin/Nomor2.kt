package com.vanness.kotlin

import java.io.*

data class Answer(val problemNumber: Int, val answer: Char)

fun main() {
    val br = BufferedReader(FileReader("testdata.in"))
    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val answers = mutableListOf<Answer>()
        repeat(n) {
            val (problemNumber, answer) = br.readLine().split(". ")
            answers.add(Answer(problemNumber.toInt(), answer[0]))
        }
        answers.sortBy { it.problemNumber }
        for (answer in answers) {
            println("${answer.problemNumber}. ${answer.answer}")
        }
    }
    br.close()
}
