package com.joshauyingwhat.learn

/**
 * list元素的遍历
 *
 */
fun main() {

    var list1 = listOf<Int>(1, 2, 3, 4, 5)

    //第一种遍历方式
    for (i in list1) {
        println("$i  ")
    }

    //第二种遍历方式
    list1.forEach {
        println("$it  ")
    }

    //第三种遍历方式 每个元素的下标
    list1.forEachIndexed { index, item ->
        println("下标:$index, 元素:$item")
    }
}