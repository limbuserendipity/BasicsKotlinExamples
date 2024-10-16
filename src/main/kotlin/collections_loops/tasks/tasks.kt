package collections_loops.tasks

import kotlin.random.Random


/*
Task1: Сумма элементов списка

Задание: Создай список из пяти чисел. Вычисли и выведи сумму всех элементов списка.
*/
fun task1() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
    println("Сумма элементов списка: $sum")
}

/*
Task2: Поиск максимального числа в списке

Задание: Создай список из десяти случайных чисел от 1 до 100. Найди и выведи на экран максимальное число из списка.
*/
fun task2() {
    val numbers = List(10) { Random.nextInt(1, 101) } // Генерируем 10 случайных чисел от 1 до 100
    val maxNumber = numbers.maxOrNull() // Используем maxOrNull() для поиска максимального элемента
    println("Список: $numbers")
    println("Максимальное число: $maxNumber")
}

/*
Task3: Подсчёт чётных чисел в списке

Задание: Создай список чисел от 1 до 20. Подсчитай и выведи количество чётных чисел в списке.

*/
fun task3() {
    val numbers = (1..20).toList()
    val evenCount = numbers.count { it % 2 == 0 } // Используем count() с лямбда-выражением для подсчета четных чисел
    println("Количество чётных чисел в списке: $evenCount")
}

/*
Task4: Обратный вывод списка

Задание: Попроси пользователя ввести пять слов и сохрани их в список. Выведи слова в обратном порядке.
*/
fun task4() {
    println("Введите пять слов:")
    val words = mutableListOf<String>()
    for (i in 1..5) {
        val word = readLine()!!
        words.add(word)
    }
    println("Слова в обратном порядке:")
    words.reversed().forEach { println(it) }
}

/*
Task5: Фильтрация списка

Задание: Создай список чисел от 1 до 50. Создай новый список, содержащий только числа, которые делятся на 5 без остатка, и выведи его.
*/
fun task5() {
    val numbers = (1..50).toList()
    val filteredNumbers = numbers.filter { it % 5 == 0 } // Используем filter() с лямбда-выражением для фильтрации чисел
    println("Новый список, содержащий числа, кратные 5: $filteredNumbers")
}

/*
Task6: Таблица умножения

Задание: Выведи на экран таблицу умножения числа 7 с помощью цикла.
*/
fun task6() {
    println("Таблица умножения числа 7:")
    for (i in 1..10) {
        println("7 * $i = ${7 * i}")
    }
}

/*
Task7: Проверка наличия элемента в списке

Задание: Создай список любимых фруктов. Попроси пользователя ввести название фрукта. Если этот фрукт есть в списке, выведи "Да, я люблю [фрукт]", иначе выведи "Нет, я не люблю [фрукт]".
*/
fun task7() {
    val favoriteFruits = listOf("яблоко", "банан", "груша")

    println("Введите название фрукта:")
    val fruit = readLine()!!

    if (fruit in favoriteFruits) {
        println("Да, я люблю $fruit")
    } else {
        println("Нет, я не люблю $fruit")
    }
}

/*
Task8: Подсчёт гласных в слове

Задание: Попроси пользователя ввести слово. Подсчитай и выведи количество гласных букв в этом слове.
*/
fun task8() {
    println("Введите слово:")
    val word = readLine()!!
    val vowels = "аеёиоуыэюя" // Список гласных букв
    var vowelCount = 0
    for (letter in word.toLowerCase()) {
        if (letter in vowels) {
            vowelCount++
        }
    }
    println("Количество гласных букв в слове: $vowelCount")
}

/*
Task9: Простые числа в диапазоне

Задание: Найди и выведи все простые числа от 2 до 30.
*/
fun task9() {
    println("Простые числа от 2 до 30:")
    for (i in 2..30) {
        var isPrime = true
        for (j in 2 until i) { // Проверяем на делимость числами от 2 до i - 1
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            print("$i ")
        }
    }
    println()
}

/*
Task10: Реверс числа

Задание: Попроси пользователя ввести число. Выведи это число в обратном порядке цифр.
*/
fun task10() {
    println("Введите число:")
    val number = readLine()!!.toInt()
    var reversedNumber = 0
    var tempNumber = number
    while (tempNumber > 0) {
        reversedNumber = reversedNumber * 10 + (tempNumber % 10)
        tempNumber /= 10
    }
    println("Число в обратном порядке: $reversedNumber")
}