package oop.case1_ClassAndObjects

import org.example.oop.case1_ClassAndObjects.classes.Car
import org.example.oop.case1_ClassAndObjects.classes.Dog
import org.example.oop.case1_ClassAndObjects.classes.Person


fun main() {
    val person = Person("Олег")
    person.sayYourName()

    val dog = Dog("Бим", "Золотистый ретривер")
    dog.makeSound()

    val car = Car("Tesla")
    car.drive()
}