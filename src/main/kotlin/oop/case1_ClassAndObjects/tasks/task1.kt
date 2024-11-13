package org.example.oop.case1_ClassAndObjects.tasks

/*

    Создайте класс Car с полями brand (марка), model (модель) и year (год выпуска). Напишите функции:

    startEngine() — выводит сообщение о запуске двигателя.
    displayInfo() — выводит информацию об автомобиле (марка, модель, год выпуска).
    isVintage() — возвращает true, если автомобилю более 25 лет, иначе — false.
 */
fun main() {
    val car = Car()
    car.startEngine()
    car.displayInfo()
    car.isVintage()
}

class Car(
    var brand: String = "Xiaomi",
    var model: String = "SU7",
    var year: Int = 2024,
) {

    fun startEngine() {
        println("HyperOS. Hyper engine V6 запущен")
    }

    fun displayInfo() {
        println("info: $brand + $model + $year")
    }

    fun isVintage() : Boolean {
        val age = 2024 - year
        println("Возраст машины: $age")
        if (age > 25) {
            return true
        } else {
            return false
        }
    }
}