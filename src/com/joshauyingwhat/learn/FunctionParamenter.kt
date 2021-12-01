package com.joshauyingwhat.learn

/**
 * 函数参数
 */
fun main() {

    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        "$number1 $number2 ${number3}"
    }

    println(methodAction(100,200,300))
}