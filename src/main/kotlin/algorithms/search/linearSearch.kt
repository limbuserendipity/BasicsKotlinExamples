package org.example.algorithms.search

fun main() {

    val list = listOf(4, 6, 2, 6, 8, 5, 3, 2, 1)
    println(linearSearch(list, 1))

}

/*

    1. Создать список чисел.
    2. Задать число, которое нужно найти.
    3. Пройти по каждому элементу списка.
    4. Для каждого элемента проверить, равно ли оно искомому числу.
    5. Если нашли нужный элемент, запомнить его позицию и прекратить поиск.
    6. Если не нашли, сообщить, что число отсутствует в списке.

 */


fun linearSearch(list: List<Int>, target: Int): Int {

    var index = 0
    list.forEach {
        if (it == target) return index
        index++
    }
=======

    return -1
}

