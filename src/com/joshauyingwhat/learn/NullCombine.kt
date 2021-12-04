package com.joshauyingwhat.learn

/**
 *  hebing caozuo fu
 */
fun main() {

    var name:String? = "lixiaolong"
    name = null

    //kong hebing caozuo fu ?:  ruguo nameweikong jiu hui zhixing hou mian de yu ju
    println(name?: "name is null")

    //hai keyi pei he let yuju shiyong
    println(name?.let { "[$it]" })
}