package com.joshauyingwhat.learn

/**
 * run 内置函数
 */
fun main() {

    val str:String? = null

    println(str.run(::isLong))

    println(str.run(::isLong)
            .run(::showText))

    println(str.let(::isLong)
            .let(::showText))
}

fun isLong(str: String?): Boolean {
    return str?.let { it.length > 5 } ?: false
}

fun showText(isLong:Boolean):String {
    return if(isLong) "show text" else "false"
}