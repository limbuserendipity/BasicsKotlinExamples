package org.example.oop.case1_ClassAndObjects.tasks

import java.util.UUID

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
    Задание: Создайте билет, используйте его, и попробуйте использовать второй раз, чтобы проверить логику.

 */

class ETicket(
    private val id: String = UUID.randomUUID().toString(),
    val destination: String,
    val price: Double,
    private var isUsed: Boolean = false
) {
    fun use() {
        if (!isUsed) {
            isUsed = true
            println("✅ Билет успешно использован! Наслаждайтесь поездкой.")
            println()
        } else {
            println("⚠ Билет уже активирован.")
            println()
        }
    }
    fun showInfo() {
        println("🎟 Билет №$id: ")
        println("🚩 Пункт назначения: $destination")
        println("${if (isUsed) "🔴" else "🟢"} Статус: ${if (isUsed) "Использован" else "Не использован"}")
        println()
    }
}

fun main() {
    val ticket1 = ETicket(
        destination = "Москва",
        price = 300.0
    )
    ticket1.showInfo()
    ticket1.use()
    ticket1.showInfo()
}