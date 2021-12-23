package com.joshauyingwhat.learn

/**
 * mutator 运算符重载
 * += ,-=
 * removeif
 */
fun main() {

    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    list += 100

    list -= 9
    println(list)

    var mutableListOf = mutableListOf<String>("1", "12", "13", "14", "15", "a", "b", "c")

    mutableListOf.removeIf { it.contains("1") }//移除元素中带有"1"的元素

    println(mutableListOf)
}