package com.joshauyingwhat.learn

/**
 * apply内置函数
 */
fun main() {

    var info:String = "swqdwqfg5h4"

    println("info长度:${info.length}")

    //apply返回的是当前info本身
    info.apply {
        length
    }.apply {
        println(this)
    }
}