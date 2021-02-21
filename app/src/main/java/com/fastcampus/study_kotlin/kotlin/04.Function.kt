package com.fastcampus.study_kotlin.kotlin

/*
    04.Function
    - 함수란
        - 어떤 input을 넣어주면 어떤 output이 나오는 것
        - y = x + 2

    - 함수를 선언하는 방법
    fun 함수명 (변수명 : 타입, 변수명 : 타입 ...) : 반환형 {
        함수 내용
        return 반환값
    }
 */

fun plus(first: Int, second: Int): Int {
    print("first = $first ,")
    println("second = $second")
    val result: Int = first + second
    println("result = $result \n")
    return result
}

// - default 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기 (Unit이 반환값 없는 함수만들때 사용 생략가능!)
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// - 반환값 생략!
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선언하는 방법 (1개부터 n개 까지 인자를 받을 수 있음..)
fun plusMany(vararg numbers : Int) {
    for (number in numbers) {
        println(number)
    }
}
fun main(array: Array<String>) {
    plus(5, 10)
    plus(first = 20, second = 30)
    plus(second = 100, first = 10)

    // default값을 갖는 함수 호출하기
    val result4 = plusFive(10, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    val result6 = plusShort(50, 50)
    println(result6)
    plusMany(100)
}