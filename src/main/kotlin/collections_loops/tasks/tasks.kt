package collections_loops.tasks

import kotlin.random.Random

fun main(){
    task1()
}

/*
Task1: Сумма элементов списка

Задание: Создай список из пяти чисел. Вычисли и выведи сумму всех элементов списка.
*/

fun task1() {

    val mutablelist = mutableListOf<Int>()

    repeat(5){
        mutablelist.add(Random.nextInt(100))
    }

    println("числа: $mutablelist, сумма: ${mutablelist.sum()}")

}

/*
Task2: Поиск максимального числа в списке

Задание: Создай список из десяти случайных чисел от 1 до 100. Найди и выведи на экран максимальное число из списка.
*/
fun task2() {


    val mutablelist = mutableListOf(0)
    mutablelist.remove(0)
    repeat(10){
        mutablelist.add(Random.nextInt(100))
    }

    println("список: $mutablelist")
    mutablelist.sort()
    println("отсортированный список: $mutablelist")
    println("максимальное число списка: ${mutablelist.max()}")
}


/*
Task3: Подсчёт чётных чисел в списке

Задание: Создай список чисел от 1 до 20. Подсчитай и выведи количество чётных чисел в списке.
*/
fun task3() {
    val mutablelist = mutableListOf(1)

    var odin = 1
    repeat(20){
        mutablelist.add(odin)
        odin++
    }

    println(mutablelist.filter { it % 2 == 0 })
}

/*
Task4: Обратный вывод списка

Задание: Попроси пользователя ввести пять слов и сохрани их в список. Выведи слова в обратном порядке.
*/
fun task4() {
    val mutableSlova: MutableList<String> = mutableListOf()
    mutableSlova.add(readLine().toString())
    mutableSlova.add(readLine().toString())
    mutableSlova.add(readLine().toString())
    mutableSlova.add(readLine().toString())
    mutableSlova.add(readLine().toString())
    println(mutableSlova)
    /*   var slovo2 : String = readLine().toString()
       var slovo3 : String = readLine().toString()
       var slovo4 : String = readLine().toString()
       var slovo5 : String = readLine().toString()
          mutableSlova.add(slovo5)
          mutableSlova.add(slovo4)
          mutableSlova.add(slovo3)
          mutableSlova.add(slovo2)
          mutableSlova.add(slovo1)
       var slovo1 : String = */
}

/*
Task5: Фильтрация списка

Задание: Создай список чисел от 1 до 50. Создай новый список, содержащий только числа, которые делятся на 5 без остатка, и выведи его.
*/
fun task5() {
    val mutablelist = mutableListOf(1)
    var odin = 1
    repeat(50){
        mutablelist.add(odin)
        odin++
    }
    val anotherNUmbers = listOf(mutablelist.filter { it % 5 == 0 })
    println(anotherNUmbers)
}

/*
Task6: Таблица умножения

Задание: Выведи на экран таблицу умножения числа 7 с помощью цикла.
*/
fun task6() {
    var number = 7
    var mnozhitel = 1
    repeat(9){
        println(number * mnozhitel)
        mnozhitel++
    }
}

/*
Task7: Проверка наличия элемента в списке

Задание: Создай список любимых фруктов. Попроси пользователя ввести название фрукта.
Если этот фрукт есть в списке, выведи "Да, я люблю [фрукт]", иначе выведи "Нет, я не люблю [фрукт]".
*/
fun task7() {
    val fruitsMutable : MutableList<String> = mutableListOf("яблоко, банан, арбуз, груша, малина, клубника, фимоз")
    val vibor = readLine()
}

/*
Task8: Подсчёт гласных в слове

Задание: Попроси пользователя ввести слово. Подсчитай и выведи количество гласных букв в этом слове.
*/
fun task8() {
}

/*
Task9: Простые числа в диапазоне

Задание: Найди и выведи все простые числа от 2 до 30.
*/
fun task9() {
}

/*
Task10: Реверс числа

Задание: Попроси пользователя ввести число. Выведи это число в обратном порядке цифр.
*/
fun task10() {
}
