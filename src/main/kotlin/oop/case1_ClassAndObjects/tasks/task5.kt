package org.example.oop.case1_ClassAndObjects.tasks

/*

    Класс "Электронный билет"
    class ETicket
    Свойства:
    пункт назначения (destination),
    цена (price),
    статус (isUsed) - булево значение.
    Методы:
    use() — отмечает билет как использованный (если он еще не использован).
    showInfo() — выводит всю информацию о билете.
    Задание: Создайте багет, используйте его, и попробуйте использовать второй раз, чтобы проверить логику.
 */

class ETicket(
    val destination: String,
    val price: Double,
    var isUsed: Boolean
) {

    fun use() {
        if (isUsed == false) {
            println("Билет использован.")
            isUsed = true
        } else {
            println("Билет готов к использованию по прямому назначению")
            fun showInfo() {
                println("$destination, $price, $isUsed")
            }
        }
    }
}