package com.joshauyingwhat.learn

/**
 * 函数引用
 */
fun main() {

    //lambda属于函数类型的对象，需要把普通函数变成函数类型的对象(函数引用)
    loginApi1("joshuayingwhat", "123456", ::Response)
}

fun Response(msg: String, code: Int) {

    println("msg:$msg,code:$code")
}

fun loginApi1(userName: String, userPwd: String, Response: (String, Int) -> Unit) {
    Response("userName:$userName,userPwd:$userPwd", 200)
}