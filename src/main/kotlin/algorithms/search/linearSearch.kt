package org.example.algorithms.search

import kotlin.random.Random

fun main(){
    print("Введите число, которое нужно найти: ")
    val findNum = readLine()!!.toInt()
    val v1 = linearSearch(findNum)
    if (v1) {
        println("Число найдено.")
    }
    else {
        println("Число не найдено.")
    }
}

/*

    1. Создать список чисел.
    2. Задать число, которое нужно найти.
    3. Пройти по каждому элементу списка.
    4. Для каждого элемента проверить, равно ли оно искомому числу.
    5. Если нашли нужный элемент, запомнить его позицию и прекратить поиск.
    6. Если не нашли, сообщить, что число отсутствует в списке.

 */


fun linearSearch(num: Int): Boolean {
    val list = mutableListOf<Int>()
    repeat(3) {
        list.add(Random.nextInt(100))
    }

    list.forEach { number ->
        if (number == num) {
            return true
        }
    }
    return false
}