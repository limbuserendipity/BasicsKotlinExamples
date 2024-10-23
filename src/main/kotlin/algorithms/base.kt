package org.example.algorithms

/*

    Алгоритм — это четкая последовательность действий,
    выполнение которой дает какой-то заранее известный результат.

 */

fun main(){

    println(findMin( listOf(5, 3, 8, 1, 4)))
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
 var list = listOf(3, 2, 1, 8, 16, 9)
  var min = list[0]
    list.forEach{
        if(it < min ) min = it
    }


    return min
}
fun ew1() {

}
/*
    Подсчет суммы всех чисел
 */
fun calculateSum(list : List<Int>): Int {
    return 0
}