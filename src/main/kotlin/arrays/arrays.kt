package org.example.arrays

import kotlin.random.Random

fun main(){
    arrayExample5()
}

fun arrayExample(){
    val grades = arrayOf(3, 5, 4)
    println(grades[0])
    println(grades[1])
    println(grades[grades.lastIndex])
    println("размер массива: ${grades.size}" )
}



fun arrayExample2(){
    val text = "hello"
    val arrayChars = arrayOf('h','e','l','l','o')

    text[0]
    text.length
    arrayChars[0]
    arrayChars.size

    text.toCharArray()

    'h' in text
    'e' in arrayChars
    "llo" in text
    '1' !in arrayChars

}



fun arrayExample3(){
    val weeks = arrayOf(
        "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"
    )
    println("repeat:")
    repeat(weeks.size){
        print("${weeks[it]} ")
    }
    println()
    println("while:")
    var i = 0
    while(i <= weeks.lastIndex){
        print("${weeks[i]} ")
        i++
    }


    println()
    println("for: ")
    for(index in 0..weeks.size-1){
        print("${weeks[index]} ")
    }
    println()
    println("forEach:")
    for(week in weeks){
        print("$week ")
    }

}


fun arrayExample4(){

    val arr1 : Array<Int> = arrayOf(1, 2, 3)
    val arr2 : Array<String> = arrayOf("Яблоко", "Груша")
    val arr3 : Array<IntRange> = arrayOf(1..2, 1..4)
    val arr4 : Array<Array<Int>> = arrayOf(arrayOf(1,2,3,4), arrayOf(1,2,3,4) )

    arr1[0] = 2
    arr2[0] = "Слива"
    arr4[0][2]

}

fun arrayExample5(){

    val arr1 = Array(5,{0})
    repeat(arr1.size){
        println(arr1[it])
    }

    val arr2 = Array(3, {"Kotlin"})
    repeat(arr2.size){
        println(arr2[it])
    }
}