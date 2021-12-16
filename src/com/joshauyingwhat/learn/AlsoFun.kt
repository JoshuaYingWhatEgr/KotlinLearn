package com.joshauyingwhat.learn


/**
 * also 函数
 */
fun main() {

    var str = "joshua"

    //谁.also 这个also都会返回本身
    var also = str.also {// it == str本身
        true
        3.14
    }
    println(also)

    var also1 = str.also {
        println("str原始数据为:$it")
    }.also {
        println("str转换成小写为:${str.toLowerCase()}")
    }
    println(also1)
}