package oop.case2_Inheritance.classes

open class Car(
    var brand: String = "Неизвестная марка",
) {

    val speedInfo : String
        get(){
            return when(brand){
                "Bugatti" -> "420 км/ч."
                "Ferrari" -> "330 км/ч."
                "Tesla" -> "322 км/ч."
                else -> "Для $brand скорость неизвестна"
            }
        }

    fun drive(){
        println("Едем $speedInfo")
    }
}

class Bugatti(
    model : String
) : Car("Bugatti"){
    val speed = speedInfo
}

class Ferrari(
    model : String
) : Car("Ferrari"){
    val speed = speedInfo
}

class Tesla(
    model : String
) : Car("Tesla"){
    val speed = speedInfo
}
