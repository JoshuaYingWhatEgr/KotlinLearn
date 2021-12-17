package com.joshauyingwhat.learn


/**
 * mutable 可变的list集合
 */
fun main() {

    //可变的list
    var list = mutableListOf(1, 2, 3, 4, 5, 6)

    list.add(3)

    list.remove(4)

    println(list)

    //不可变的list
    var list1 = listOf<Int>(1, 2, 3, 4, 5, 6)
        //不可变集合没有add操作
//    list1.add()

    //不可变集合变成可变集合
    var list2 = list1.toMutableList()

    list2.add(7)

    println(list2)

    //可变集合变成不可变集合
    var list3 = mutableListOf<Int>(100,200,300,400,500)

    var list4 = list3.toList() //将list3转换成了不可变的list4

//    list4.add
//    list4.remove()
}