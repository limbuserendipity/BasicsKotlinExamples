package org.example.other.hotkeys

/*

TODO    Навигация по коду

    Alt + Home — переход к методу/функции в классе.
    Ctrl + F / Cmd + F — поиск по текущему файлу.
    Ctrl + Shift + F — поиск по всему проекту.
    Alt + стрелки вверх/вниз — переход между методами/функциями.
    Ctrl + Tab — переключение между открытыми файлами.

 */

// Задание 1: Используй Alt + Home для быстрого перехода к функции printWelcome().
fun printWelcome() {
    println("Добро пожаловать в программу!")
}

// Задание 2: Найди слово "calculate" в файле с помощью Ctrl + F.
fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

fun calculateDifference(a: Int, b: Int): Int {
    return a - b
}

// Задание 3: Используй Ctrl + Shift + F для поиска слова "Goodbye" во всём проекте.
fun printGoodbye() {
    println("До свидания!")
}

// Задание 4: Перемещайся между функциями с помощью Alt + Стрелка вверх/вниз.
// Начни отсюда.
fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        println("Ошибка: деление на ноль!")
        return 0
    }
    return a / b
}

// Задание 5: Переключись между открытыми файлами с помощью Ctrl + Tab.
fun main() {
    printWelcome()
    println("Сумма: " + calculateSum(10, 5))
    println("Разность: " + calculateDifference(10, 5))
    println("Произведение: " + multiply(10, 5))
    println("Частное: " + divide(10, 5))
    printGoodbye()
}