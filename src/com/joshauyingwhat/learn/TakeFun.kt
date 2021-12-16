package com.joshauyingwhat.learn

import kotlin.random.Random

/**
 * takeif 和 takeUnless 函数
 *
 */
fun main() {

    var number = Random.nextInt(100)

    var takeIf = number.takeIf {
        it % 2 == 0
    }

    println(takeIf)

    var takeUnless = number.takeUnless {
        it % 2 == 0
    }

    println(takeUnless)

    var s = "hello".takeUnless { it.isNullOrBlank() } ?: "xxx"

    println(s)
}