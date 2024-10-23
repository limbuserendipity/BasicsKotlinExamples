package org.example.algorithms

/*

    Алгоритм — это четкая последовательность действий,
    выполнение которой дает какой-то заранее известный результат.

 */

fun main(){

    println(findMax(listOf(1,2,6,3,2,1)))

}

/*
    Нахождение максимального числа в списке
 */

fun findMax(list : List<Int>): Int {

    var max = list[0]

    list.forEach { element ->
        if(element > max) max = element
    }

    return max
}

/*
    Нахождение минимального числа в списке
 */

fun findMin(list : List<Int>): Int {
    return -1
}

/*
    Подсчет суммы всех чисел
 */
fun calculateSum(list : List<Int>): Int {
    return 0
}