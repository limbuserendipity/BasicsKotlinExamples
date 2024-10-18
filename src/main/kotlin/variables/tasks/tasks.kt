package variables.tasks

import kotlin.random.Random

/*
    Для заданий можете использовать readLine и Random
 */
fun main(){
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

/*
Task1: Приветствие по имени

Задание: Создай переменную, в которую запишешь своё имя. Затем выведи на экран сообщение: "Привет, [твоё имя]!"
Подсказка: Используй функцию println() для вывода текста.
*/
fun task1() {
    print("Введите ваше имя: ")
    val name = readLine()!!.toString()
    println("Привет, $name")
}

/*
Task2: Сумма двух чисел

Задание: Объяви две переменные с любыми числами. Найди их сумму и выведи результат на экран.
Подсказка: Используй оператор + для сложения чисел.
*/
fun task2() {
    val num1 = Random.nextInt(100)
    val num2 = Random.nextInt(100)

    println("Сумма чисел: ${num1 + num2}")
}

/*
Task3: Площадь прямоугольника

Задание: Создай две переменные для длины и ширины прямоугольника. Вычисли его площадь и выведи результат.
Подсказка: Площадь = длина * ширина.
*/
fun task3() {
    val dlina = Random.nextInt(100)
    val shirina = Random.nextInt(100)

    println("Площадь = ${dlina * shirina}")
}

/*
Task4: Обмен значениями переменных

Задание: Создай две переменные a и b с разными значениями. Поменяй их значения местами и выведи новые значения на экран.
Подсказка:
*/
fun task4() {
//    val list: MutableList<Int> = mutableListOf(Random.nextInt(100), Random.nextInt(100))
//    list.reverse()
//    println(list)

    val a = 4
    val b = 1
    val c: Int

    c = (b.toString() + a.toString()).toInt()

    println(c)
}
/*
Task5: Вычисление возраста

Задание: Создай переменную с текущим годом и переменную с годом своего рождения. Вычисли свой возраст и выведи его на экран.
Подсказка: Возраст = текущий год - год рождения.
*/
fun task5() {
    print("Введите ваш возрат:")
    val year = 2024
    val birthday = readLine()!!.toInt()
    println("Вам ${year - birthday} лет")
}

/*
Task6: Конвертация валют

Задание: Создай переменную с суммой в евро. Вычисли и выведи эквивалентную сумму в долларах, если курс обмена 1 евро = 1.1 доллара.
Подсказка: Используй умножение для конвертации.
*/
fun task6() {
    print("Введите ваш баланс в евро (число): ")
    val balance = readLine()!!.toInt()
    println("Ваш баланс в долларах: ${balance * 1.1}")
}

/*
Task7: Длина окружности

Задание: Создай переменную с радиусом круга. Вычисли длину окружности и выведи результат.
Подсказка: Длина окружности = 2 * π * радиус. Используй значение π = 3.14.
*/
fun task7() {
    print("Введите радиус окружности: ")
    val radius = readLine()!!.toInt()
    val pi = Math.PI * 3.14
    println("Длина окружности: ${2 * pi * radius}")
}

/*
Task8: Среднее арифметическое трех чисел

Задание: Объяви три переменные с любыми числами. Найди их среднее арифметическое и выведи результат.
Подсказка: Среднее = (число1 + число2 + число3) / 3.
*/
fun task8() {
    val num1 = Random.nextInt(10)
    val num2 = Random.nextInt(10)
    val num3 = Random.nextInt(10)

    println("Среднее арифметическое чисел ${num1}, ${num2} и ${num3}: ${(num1 + num2 + num3) / 3}")
}

/*
Task9: Количество минут в заданных часах

Задание: Создай переменную с количеством часов. Вычисли, сколько это минут, и выведи результат.
Подсказка: В 1 часе 60 минут.
*/
fun task9() {
    print("Введите сколько в день вы работаете (в часах): ")
    val hours = readLine()!!.toInt()
    println("Вы работаете ${hours * 60} минут в день.")
}

/*
Task10: Формирование предложения

Задание: Создай переменные с названием любимого цвета, животного и еды. Составь и выведи на экран предложение, используя эти переменные, например: "Мой любимый цвет - ..., я люблю ..., и моя любимая еда - ..."
Подсказка: Используй конкатенацию строк для формирования предложения.
*/
fun task10() {
    print("Ваш любимый цвет: ")
    val color = readLine()!!.toString()
    print("Ваша любимая еда: ")
    val food = readLine()!!.toString()
    print("Ваше любимое животное: ")
    val animal = readLine()!!.toString()

    println("Мой любимый цвет - $color, я люблю $animal, и моя любимая еда - $food")
}


