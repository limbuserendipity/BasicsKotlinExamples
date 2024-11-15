package oop.case2_Inheritance.classes

open class Person(
    val name: String,
) {
    fun sayYourName() {
        println("Меня зовут $name")
    }
}

class Student(
    name : String,
    var college : String
) : Person(name){
    fun whereYouStudy(){
        println("Я учусь в $college")
    }

    fun deduct(){
        college = ""
    }
}

class Worker(
    name : String,
    var job : String
) : Person(name){

    var balance = 0

    fun whereYouWork(){
        println("Я работаю в $job")
    }

    fun dismiss(){
        job = ""
    }

    fun giveSalary(
        salary : Int
    ){
        balance = balance + salary
    }

}
