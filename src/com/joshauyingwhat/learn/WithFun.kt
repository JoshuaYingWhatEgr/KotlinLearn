package com.joshauyingwhat.learn

/**
 * with函数
 */
fun main() {

    var str = "李元霸"

    with(str, ::println)

    var listOf = listOf(1, 2, 3)

    var with = with(listOf) {

        this.first()
    }

    println(with)
}