package com.joshauyingwhat.learn

/**
 * 匿名函数的类型推断
 */
fun main() {

    val methodAction = { v1: Int, v2: String, v3: Double ->
        "$v1,$v2,$v3"
    }

    println(methodAction(1, "2", 3.0))

    val methodAction2 = {
        3.14
    }

    println(methodAction2())

    //入参是Int,那么返回值也就是Int
    val methodAction3 = { number: Int ->
        number
    }

    println(methodAction3(9))
}