package com.joshauyingwhat.learn

/**
 * it 关键字
 */
fun main() {

    //当函数只有一个形参的时候默认会有一个it methodAction:(it:String) -> String
    val methodAction: (String) -> String = {

        "$it"
    }

    println(methodAction("joshuayingwhat"))
}