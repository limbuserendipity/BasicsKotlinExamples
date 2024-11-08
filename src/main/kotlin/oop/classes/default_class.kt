package org.example.oop.classes

class Person(val name: String, val age: Int, val work: String) {
    constructor(
        name: String
    ) : this(
        name = name,
        age = 0,
        work = "Безработный"
    ) {
        println("Вызвался второй конструктор")
    }

    fun calculateSalaryByWork() {
        when (work) {
            "Дизайнер" -> println("Зарплата для $work = 90.000")
            "Программист" -> println("Зарплата для $work = 130.000")
        }
    }
}

fun main() {

    val person1 = Person("Иван", 20, "Дизайнер")
    val person2 = Person(
        name = "Андрюша",
        age = 25,
        work = "Программист"
    )

    person1.calculateSalaryByWork()
}