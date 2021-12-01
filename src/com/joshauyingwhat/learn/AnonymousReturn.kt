package com.joshauyingwhat.learn

/**
 * 隐式返回
 */
fun main() {

    //第一步:函数输入输出的声明
    val methodAction: () -> String

    //第二步:对函数实现
    methodAction = {
        val i = 9999
        //函数的最后语句就是返回值
        "${i}"
    }

    println(methodAction())
}