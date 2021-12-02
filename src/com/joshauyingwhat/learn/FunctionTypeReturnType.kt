package com.joshauyingwhat.learn

/**
 * 函数类型作为返回类型
 * return 一个匿名函数
 */
fun main() {

    val show = show()

    println(show("info", 200))
}

//返回一个匿名函数
fun show(): (String, Int) -> String {
    return { info: String, code: Int ->
        "匿名函数:info:$info,code:$code"
    }
}