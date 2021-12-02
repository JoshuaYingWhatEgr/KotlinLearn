package com.joshauyingwhat.learn

/**
 * 函数有参数，参数是函数
 */
val USER_NAME = "joshuayingwhat"
val USER_PWD = "123456"
fun main() {
    //第一种方式
    loginApi(USER_NAME, USER_PWD, { msg: String, code: Int ->

        println("msg:$msg,code:$code")
    })

    //第二种方式
    loginApi(USER_NAME, USER_PWD, Response = { msg: String, code: Int ->

        println("msg:$msg,code:$code")
    })

    //第三种方式
    loginApi(USER_NAME, USER_PWD) { msg: String, code: Int ->

        println("msg:$msg,code:$code")
    }
}

fun loginApi(userName: String, userPwd: String,
             Response: (String, Int) -> Unit) {

    if (userName.equals("joshuayingwhat") && userPwd.equals("123456")) {

        Response("登录成功", 200)
    } else {

        Response("登录失败", 400)
    }
}