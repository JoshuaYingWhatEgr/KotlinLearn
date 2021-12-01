package com.joshauyingwhat.learn

/**
 * 匿名函数
 */
fun main() {

    //匿名函数
    val len = "joshuayingwhat".count {
        it == 'j'
    }
    println(len)
}