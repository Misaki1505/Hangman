package com.example.hangman

import kotlin.random.Random

val words = listOf("february", "kotlin","star", "translate", "athletic", "cowboy", "arcane", "slayer", "predictable", "watching")
var word = ""
val guesses = arrayListOf<Char>()
var remainigGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    words[wordIndex].toUpperCase().also { word = it }
    println(word)

    printOMistakes()
}

fun printOMistakes() {
    println("   |---------|--")
    println("   |         |  ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("   |            ")
    println("  /|\\          ")
    println(" / | \\         ")
}