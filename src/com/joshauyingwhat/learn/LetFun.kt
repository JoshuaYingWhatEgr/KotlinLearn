package com.joshauyingwhat.learn

/**
 * let 内置函数
 *
 */
fun main() {
    //普通方式 对集合第一个元素相加
    val list = listOf(1, 2, 3, 4, 5)
    var first = list.first()
    val result = first + first
    println("result:$result")

    //let方式 对集合第一个元素相加
    val letResult = listOf(1, 2, 3, 4, 5, 6).let {

        it.first() + it.first()
    }
    println(letResult)

    val value: String? = null
    println(value ?: "value是空的你在搞什么飞机")
    
    println(getMethod(null))
}

fun getMethod(value: String?): String {

    return value?.let {
        it
    } ?: "value是空的"
}