package collections_loops.tasks

import kotlin.random.Random

/*
Task1: Сумма элементов списка

Задание: Создай список из пяти чисел. Вычисли и выведи сумму всех элементов списка.
*/
fun task1() {
    val list: List<Int> = listOf(13, 15, 22, 94, 52)
    var summa = 0

    list.forEach { number ->
        summa += number
    }

    println("Сумма равна: ${summa}")
}

/*
Task2: Поиск максимального числа в списке

Задание: Создай список из десяти случайных чисел от 1 до 100. Найди и выведи на экран максимальное число из списка.
*/
fun task2() {
    val list: MutableList<Int> = mutableListOf()

    repeat(10) {
        val num = Random.nextInt(1, 100)
        list.add(num)
    }

    list.sort()
    println(list)
    println("Наибольшее число: ${list.max()}")
}

/*
Task3: Подсчёт чётных чисел в списке

Задание: Создай список чисел от 1 до 20. Подсчитай и выведи количество чётных чисел в списке.
*/
fun task3() {
    val list: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    val evenNumbers = list.filter { it % 2 == 0 }

    println("Чётные числа: $evenNumbers")
}

/*
Task4: Обратный вывод списка

Задание: Попроси пользователя ввести пять слов и сохрани их в список. Выведи слова в обратном порядке.
*/
fun task4() {
    val mutable: MutableList<Int> = mutableListOf()
    repeat(5) {
        val number = readLine()!!.toInt()
        mutable.add(number)
    }
    mutable.reverse()
    println("Слова в обратом порядке: ${mutable}")
}

/*
Task5: Фильтрация списка

Задание: Создай список чисел от 1 до 50. Создай новый список, содержащий только числа, которые делятся на 5 без остатка, и выведи его.
*/
fun task5() {
    val list: MutableList<Int> = mutableListOf(1)
    repeat(49) {
        list.add(list.last() + 1)
    }

    val numbers = list.filter { it % 5 == 0 }

    println("Чётные числа: ${numbers}")
}

/*
Task6: Таблица умножения

Задание: Выведи на экран таблицу умножения числа 7 с помощью цикла.
*/
fun task6() {
    val list: MutableList<String> = mutableListOf()
    var v1 = 1

    while (v1 < 10) {
        list.add("7 * ${v1} = ${v1 * 7}")
        v1 += 1
    }

    println("Таблица умножения: ${list}")
}

/*
Task7: Проверка наличия элемента в списке

Задание: Создай список любимых фруктов. Попроси пользователя ввести название фрукта. Если этот фрукт есть в списке, выведи "Да, я люблю [фрукт]", иначе выведи "Нет, я не люблю [фрукт]".
*/
fun task7() {
    print("Попробуйте угадать мои любимые фрукты: ")
    val favoriteFruits: List<String> = listOf("Яблоко", "Банан", "Апельсин")
    val fruit = readLine()!!.toString()

    val contains = favoriteFruits.contains(fruit)
    if (contains) {
        println("Да, я люблю $fruit")
    }
    else {
        println("Нет, я не люблю $fruit")
    }
}

/*
Task8: Подсчёт гласных в слове

Задание: Попроси пользователя ввести слово. Подсчитай и выведи количество гласных букв в этом слове.
*/
fun task8() {
    print("Введите любое слово: ")
    val word = readLine()!!.toString()

    fun countVowels(word: String): Int {
        var count = 0
        for (char in word) {
            when (char.lowercaseChar()) {
                'a', 'e', 'i', 'o', 'u', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё' -> count++
            }
        }
        return count
    }

    println("В вашем слове ${countVowels(word)} гласных")
}

/*
Task9: Простые числа в диапазоне

Задание: Найди и выведи все простые числа от 2 до 30.
*/
fun task9() {
    val list: MutableList<Int> = mutableListOf()

    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }

    for (i in 2..30) {
        if (isPrime(i)) {
            list.add(i)
        }
    }
    println("Простые числа: ${list}")
}

/*
Task10: Реверс числа

Задание: Попроси пользователя ввести число. Выведи это число в обратном порядке цифр.
*/
fun task10() {
    print("Введите любое число: ")
    val input = readLine()!!.toInt()

    println("Ваше число в обратном порядке цифр: ${input.toString().reversed().toInt()}")
}

fun main() {
    task1()
    println()
    task2()
    println()
    task3()
    println()
    task4()
    println()
    task5()
    println()
    task6()
    println()
    task7()
    println()
    task8()
    println()
    task9()
    println()
    task10()
    println()
}