package org.example.oop.case1_ClassAndObjects.classes

class Car(
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