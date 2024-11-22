package org.example.oop.classes

fun main() {
    val person1: Person = Person(
        "Иван",
        60,
        "Программист",
        "делаю игры в роблосе"
    )

    val person2: Person = Person(
        "Мирон",
        52,
        "Обжора",
        "ем картошку фри"
    )

    person1.calculateSalaryByWork()
}

class Person(
    val name: String,
    val age: Int,
    val work: String,
    val comment: String
) {
    init {
        print("Вызвался первый конструктор")
    }

    constructor(
        name: String
    ) : this(
        name = name,
        0,
        "Обжора",
        ""
    ) {
        println("Вызвался второй конструктор")
    }

    fun calculateSalaryByWork() {
        when(work) {
            "Дизайнер" -> println("Зарплата от 1488 тысяч дублей/месяц")
            "Программист" -> println("Зарплата от 2 рубля/месяц")
            "Обжора" -> println("у абжор нет зарплаты")
        }
    }
}