package com.fastcampus.study_kotlin.kotlin

/*
    11. 제어흐름 실습
 */

fun main(args: Array<String>){
    val value : Int? = null

    when (value){
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when (value2){
        true -> println("")
        false -> println("")
        null -> println("")
    }

    // 값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야 한다.
    val value3 = when(value2){
        true -> 1
        false -> 3
        null -> 4 // or else 가능
    }

    val value4: Int = 10
    // when 의 다양한 조건식 (1)
    when (value4) {
        // is 는 타입을 묻는 구문 value4가 Int이면 True 리턴
        is Int -> {
            println("value4 is Int")
        }
        else -> {
            println("value4 is not Int")
        }
    }

    val value5 : Int = 70
    when(value5) {
        // a..b 이면 a < x <= b
        in 60..70 -> {
            println("value is in 60~70")
        }
        in 70..80 -> {
            println("value is in 70~80")
        }
        in 80..90 -> {
            println("value is in 80~90")
        }
    }
}