package com.fastcampus.study_kotlin.kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println(" a is't null")
    }

    if (b + c == 110) {
        println("b plus c equal 110")
    }else{
        println("b plus c is't 110")
    }

    // 엘비스 연산자
    val number : Int? = 100
    val number2 = number ?: 10 // number가 null이면 10을 넣어라 아니면 그대로 number를 넣어라
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2){
        num2
    } else {
        100
    }

}