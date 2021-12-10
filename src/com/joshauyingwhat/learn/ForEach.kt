package com.joshauyingwhat.learn

/**
 *  foreach 字符串遍历操作
 */
fun main() {

    val str = "adwdwgreegiuyiotbre"
    str.forEach {
        when (it) {
            'a' -> 1
            'd' -> 2
            else -> it
        }
    }

    println(str)

    var r = str.replace(Regex("[adw]")) {
        when (it.value) {
            "a" -> "1"
            "d" -> "2"
            "w" -> "3"
            else -> it.value
        }
    }
    println(r)
}
