package oop.case2_Inheritance.classes

abstract class Animal(
    val name : String
){
    abstract fun makeSound()
}

class Dog(
    name : String,
    var breed : String = "Бродячая"
) : Animal(name) {
    override fun makeSound() {
        println("Гав")
    }

    fun sitDown(){
        println("$name породы $breed сел")
    }

}

class Cat(
    name : String,
    var color : String
) : Animal(name){
    override fun makeSound() {
        println("Мяу")
    }

    fun catInfo(){
        println("$name цвета $color")
    }

}
