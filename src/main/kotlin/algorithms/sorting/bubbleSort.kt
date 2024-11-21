package org.example.algorithms.sorting

/*
    Сортировка пузырьком (Bubble Sort) — это простой алгоритм сортировки,
    который многократно проходит через список, сравнивая соседние элементы и меняя их местами,
    если они находятся в неправильном порядке.
    Этот процесс продолжается до тех пор, пока список не будет полностью отсортирован.
 */

fun main(){
    val list = mutableListOf(4, 2, 6, 8, 8, 2, 5, 3, 1, 3)
    println(list)
    bubbleSort(list)
    println(list)
}
/*
    Установить swapped = true.
    Запустить цикл while, который выполняется, пока swapped == true.
    Установить swapped = false.
    Запустить цикл for от i = 1 до array.size - 1.
    Сравнить array[i] и array[i - 1].
    Если array[i] < array[i - 1], вызвать swap(array, i, i - 1) и установить swapped = true.
    Повторить шаги 4-6, пока весь массив не будет проверен.
    Завершить сортировку, когда цикл while завершится.
 */
fun bubbleSort(array: MutableList<Int>){
    var swapped = true
    while (swapped) {
        swapped = false
        for (i in 1..array.size-1) {
            if (array[i] < array[i -1]){
                swap(array, i, i-1)
                swapped = true
            }

        }
    }
}
/*
    Создать переменную temp и присвоить ей значение array[index1].
    Присвоить array[index1] значение array[index2].
    Присвоить array[index2] значение temp.
 */
fun swap(array: MutableList<Int>, index1: Int, index2: Int) {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}