package com.example.hangman

import kotlin.random.Random

val words = listOf("february", "kotlin","star", "translate", "athletic", "cowboy", "arcane", "slayer", "predictable", "watching")
var word = ""
val guesses = arrayListOf<Char>()
var remainigGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {

}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex]
    println(word)
}