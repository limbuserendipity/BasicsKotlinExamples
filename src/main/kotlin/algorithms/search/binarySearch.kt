package org.example.algorithms.search

/*

    Бинарный поиск — это алгоритм, который ищет позицию элемента в отсортированном массиве.
    Алгоритм работает следующим образом:

    Делит массив на две части.
    Сравнивает искомое значение с элементом в середине массива.
    Если значение меньше, то продолжает поиск в левой части массива, если больше — в правой.
    Повторяет процесс, пока не найдет элемент или пока не останется элементов для проверки.

 */


fun main(){
    val list = listOf(2, 4, 52, 69, 1500)
    val target = 1500
    binarySearch(list, target)
    val input = binarySearch(list, target)
    println(input)
}

/*
    Убедись, что массив или список отсортирован по возрастанию.
    Создай две переменные: left (индекс начала, 0) и right (индекс конца, array.size - 1).
    Создай цикл while, который будет выполняться, пока left <= right.
    Внутри цикла вычисли средний индекс: mid = (left + right) / 2.
    Сравни элемент array[mid] с искомым значением target:
    Если array[mid] == target, верни mid.
    Если array[mid] < target, сдвинь left вправо: left = mid + 1.
    Если array[mid] > target, сдвинь right влево: right = mid - 1.
    Если цикл завершился и элемент не найден, верни -1.
 */


fun binarySearch(array: List<Int>, target: Int): Int {
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        if (array[mid] == target) return mid
        if (array[mid] < target) left = mid + 1
        if (array[mid] > target) right = mid - 1
    }
    return -1
}