package com.joshauyingwhat.learn

import kotlin.math.roundToInt

/**
 * double转int 与类型格式化
 */
fun main() {

    println(65.873.toInt()) //toInt 只会向下取整截取.前面的数值

    println(65.873.roundToInt())//roundToInt 会对数值进行四舍五入

    var r = "%.3f".format(65.8773456)

    println(r)
}