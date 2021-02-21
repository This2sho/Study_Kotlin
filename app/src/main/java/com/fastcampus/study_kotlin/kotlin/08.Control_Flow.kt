package com.fastcampus.study_kotlin.kotlin

/*
    08. 제어 흐름
    - if , else

 */

fun main(args:Array<String>){
    val a :Int = 5
    val b: Int = 10

    // if / else 사용하는 방법 (1)
    if (a > b){
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    // if / else 사용하는 방법 (2)
    if (a > b) {
        println("a 가 b 보다 크다")
    } else if (a < b) {
        println("a 가 b 보다 작다")
    } else if (a == b){
        println("a 와 b는 같다")
    }else {

    }

    // 값을 리턴하는 if 사용방법
    val max1 = if(a>b) a else b
    println(max1)


}