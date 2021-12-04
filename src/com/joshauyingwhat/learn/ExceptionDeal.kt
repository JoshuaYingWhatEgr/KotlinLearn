package com.joshauyingwhat.learn

import java.lang.Exception

/**
 * exceptions deal
 */
fun main() {

      try {

          var msg :String? = null

          checkException(msg)
          println(msg!!.length)

      }  catch (e:Exception) {
          println(e)
      }
}

fun checkException(msg: String?) {
    //if msg is null throw CustomException
    msg ?: throw CustomException()
}

class CustomException :Exception("anr")
