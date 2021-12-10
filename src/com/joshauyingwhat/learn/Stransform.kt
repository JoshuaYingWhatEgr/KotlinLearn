package com.joshauyingwhat.learn

/**
 * kt安全转换
 */
fun main() {

    var number: Int = "666".toInt()

    println(number)

    //解决转换崩溃的问题,当转换不成功后直接返回null
    var number1: Int? = "666.6".toIntOrNull()
    println(number1)

    var number2: Int? = "888.8".toIntOrNull()
    println(number2 ?: "number2 是 null")//空合并操作符 ?:
}