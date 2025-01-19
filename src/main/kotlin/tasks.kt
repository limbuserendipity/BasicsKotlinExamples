package org.example


fun main(){



}

/*
    Реализуйте линейный поиск по строкам в массиве
 */
fun linearSearchByText(array : Array<String>, target: String) : Int{

    return -1
}

/*
    Реализуйте функцию, которая принимает массив состоящий из строк Yes и No
    arrayOf("Yes", "Yes", "No", "Yes", "No", "No")

    и вернет массив с строками:
    arrayOf("No", "No", "Yes", "No", "Yes", "Yes")

 */

fun yesToNoAndNoToYes(array: Array<String>) : Array<String>{
    return arrayOf()
}


/*

    Напишите функцию, которая принимает массив чисел и
    выводит на экран максимальное и минимальное число в этом массиве

 */
fun minAndMax(array: Array<Int>){

}
/*
    Напишите функцию, которая проверяет находиться ли искомый элемент в массиве
    Если элемент найден функция возвращает true иначе false
    Пример:
    array: 1,5,3,1,5,3
    target 2
    return: false

    Пример 2:
    array: 1,5,3,1,5,3
    target 3
    return: true

 */

fun isContains(array: Array<Int>, target: Int) : Boolean{

    return false
}

/*
    Функция принимает массив чисел и возвращает массив этих чисел без повторяющихся значений
    Пример:
    Ввод: 1,3,7,4,2,3,8,4,2.
    Вывод: 1,3,7,4,2,8
 */
fun deleteDuplicates(array: Array<Int>) : Array<Int>{
    return arrayOf()
}


/*
    На вход подаётся строка, состоящая из нескольких слов, разделённых пробелами.
    Нужно подсчитать, сколько слов содержится в строке, и вывести это число.
    Пример:
    val str = "Алгоритм это четкая последовательность действий"
    Количество слов: 5
 */

fun numberOfWords(text : String) : Int{
    return -1
}

/*
    Функция принимает число,
    от этого числа зависит сколько блюд и по какой цене пользователь в итоге получит
    Пример:
    Число: 2
    Цена: 150
    Вывод: arrayOf("Картофель фри", "Кока-кола")
    Цена пишется до return
 */

fun getComboLunchByNumber(number : Int) : Array<String>{
    val dishes = arrayOf("Картофель фри", "Кока-кола", "Фиш ролл", "Гамбургер", "Наггетс", "Гранд-бургер", "Молочный коктейль")
    val prices = arrayOf(60, 90, 120, 140, 110, 310, 150)
    return arrayOf()
}

