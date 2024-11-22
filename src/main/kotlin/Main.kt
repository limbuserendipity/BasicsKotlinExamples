package org.example

/*

   Автор: Паутов Олег
   Группа: ИТУ2

 */

fun main() {
    val numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4"
    println(numbers)
    val list = numbers.split(" ").map {
        it.toInt()
    }
    println(list)
    println("${list.min()} ${list.max()}")
}
