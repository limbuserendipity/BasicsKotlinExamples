package collections_loops.tasks


import kotlin.random.Random

fun main() {
    task2()
}


/*
Task1: Сумма элементов списка

Задание: Создай список из пяти чисел. Вычисли и выведи сумму всех элементов списка.
*/
fun task1() {

    val numbers = listOf(1, 2, 3, 4, 5)


    var sum = 0

    for (number in numbers) {
        sum += number
    }

    // Вывод суммы
    println("Сумма элементов списка: $sum")

}

/*
Task2: Поиск максимального числа в списке

Задание: Создай список из десяти случайных чисел от 1 до 100. Найди и выведи на экран максимальное число из списка.
*/
fun task2() {
    val maxNumberList: MutableList<Int> = mutableListOf()

    repeat(10) {
        val num = Random.nextInt(0, 100)
        maxNumberList.add(num)
    }

    var high = 0

    maxNumberList.forEach{ number ->
        if (number > high) {
            high = number
        }
    }
    println(high)
}

/*
Task3: Подсчёт чётных чисел в списке

Задание: Создай список чисел от 1 до 20. Подсчитай и выведи количество чётных чисел в списке.
*/
fun task3() {
    val list: MutableList<Int> = mutableListOf(1)

    repeat(19) {
        list.add(list.last()+1)
    }
    val evenNumber = list.filter { it %2 == 0 }

    println("Чётные числа: ${evenNumber}")
}

/*
Task4: Обратный вывод списка

Задание: Попроси пользователя ввести пять слов и сохрани их в список. Выведи слова в обратном порядке.
*/
fun task4() {
    val list: MutableList<String> = mutableListOf()

    val num = list.add(readLine()!!)
    val num2 = list.add(readLine()!!)
    val num3 = list.add(readLine()!!)
    val num4 = list.add(readLine()!!)
    val num5 = list.add(readLine()!!)

    list.reverse()
    println(list)
}

/*
Task5: Фильтрация списка

Задание: Создай список чисел от 1 до 50. Создай новый список, содержащий только числа, которые делятся на 5 без остатка, и выведи его.
*/
fun task5() {
    val list: MutableList<Int> = mutableListOf(1)

    repeat(49) {
        list.add(list.last()+1)
    }
    val evenNumber = list.filter { it %5 == 0 }

    println("Числа делимые на 5 без остатка: ${evenNumber}")

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

    val fruitsList: MutableList<String> = mutableListOf("яблоко","Яблоко", "груша", "Груша", "банан", "Банан", "киви", "Киви", "арбуз", "Арбуз")
    val fruit = readLine().toString()
    if (fruitsList.contains(fruit)) {
        println("Да, я люблю ${fruit}")
    } else {
        println("Нет, я не люблю ${fruit}")

    }

}

/*
Task8: Подсчёт гласных в слове

Задание: Попроси пользователя ввести слово. Подсчитай и выведи количество гласных букв в этом слове.
*/
fun task8() {
    var count = 0
    val word = readLine()!!.toString()
    for (char in word) {
        when (char.lowercaseChar()) {
            'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я' -> count++
        }
    }
    println(count)
}

/*
Task9: Простые числа в диапазоне

Задание: Найди и выведи все простые числа от 2 до 30.
*/
fun task9() {
    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        if (n == 2) return true
        if (n % 2 == 0) return false
        var i = 3
        while (i * i <= n) {
            if (n % i == 0) return false
            i += 2
        }
        return true
    }

    val list: MutableList<Int> = mutableListOf()

    for (i in 2..30) {
        if (isPrime(i)) {
            list.add(i)
        }
    }

    println(list)
}

/*
Task10: Реверс числа

Задание: Попроси пользователя ввести число. Выведи это число в обратном порядке цифр.
*/
fun task10() {
    print("Введите число: ")
    val input = readLine()!!.toInt()

    val reversedNumber = input.toString().reversed().toInt()

    println("Вот ваше число в обратном порядке цифр: $reversedNumber")
}