package org.example.algorithms

/*

    Алгоритм — это четкая последовательность действий,
    выполнение которой дает какой-то заранее известный результат.

 */

fun main(){

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

    var min = list[0]

    list.forEach { element ->
        if(element < min) min = element
    }

    return min
}

/*
    Подсчет суммы всех чисел
 */
fun calculateSum(list : List<Int>): Int {
    var sum = 0
    list.forEach { element ->
        sum = sum + element
    }
    return sum
}