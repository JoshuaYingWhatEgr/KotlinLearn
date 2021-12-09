package com.joshauyingwhat.learn

/**
 * kotlin语言的可空性特点
 */
fun main() {

    var name = "derry"
    //name不能为空
//    name = null
    println(name)

    //带有? 表示age可以为空
    var age: String?
    age = null
    println(age)


    //kt语言的安全调用操作符
    var r: String? = "kotlin"
    r = null

    var rc = r?.capitalize()//r后面追加一个?表示如果r是空的后面的所有逻辑就不用执行
    println(rc)
       //使用带let的安全调用
    var sex: String? = null

//    sex = ""
    sex = "joshuayingwhat"
    var l = sex?.let {
        if (sex.isBlank()) { //如果sex是""没有内容

            "default"
        } else { //如果有内容就返回自身
            it
        }
    }

    println(l)
    //非空断言操作符 !!
    var study:String? = null
    study!!.capitalize() //不管study是不是为null都执行

    println(study)

}