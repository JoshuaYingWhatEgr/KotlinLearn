package com.joshauyingwhat.learn

/**
 * 内联函数
 */
fun main() {

    loginApis("joshauyingwhat", "123456") { msg: String, code: Int ->

        println("msg:$msg,code:$code")
    }
}

inline fun loginApis(name: String, pwd: String,
                     ResponseResult: (String, Int) -> Unit) {

    ResponseResult("成功", 200)
}