package com.joshauyingwhat.learn

/**
 * list 集合
 */
fun main() {

    var list: List<String> = listOf("1", "2", "3")

    //普通取值方式
    println(list[0])

    //kt的取值方式 getOrelse getornull
    println(list.getOrElse(3) {
        "越界异常"
    })

    //一般getOrNull和空合并操作符一起使用
    var orNull = list.getOrNull(3) ?: "越界异常了"

    println(orNull)
}