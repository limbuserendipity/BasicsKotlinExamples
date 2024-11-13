package org.example.oop.case1_ClassAndObjects.classes

class Dog() {

    var name : String = "Не известно"
    var breed : String = "Бродячая"

    init {
        println("Осторожно собака может укусить!")
    }

    constructor(name : String, breed: String) : this() {
        this.name = name
        this.breed = breed
    }

    fun makeSound(){
        println("$name породы $breed говорит Гав")
    }

}