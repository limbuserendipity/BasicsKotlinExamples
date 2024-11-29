package org.example.oop.case1_ClassAndObjects.tasks

/*

    Класс "Банковский счёт"
    Создайте класс BankAccount с полями accountNumber, balance и ownerName. Напишите функции:

    deposit(amount: Double) — добавляет указанную сумму к балансу.
    withdraw(amount: Double) — снимает сумму с баланса, если она не превышает текущий баланс.
    displayBalance() — выводит текущий баланс на счёте.

 */

fun main() {
    val Ivan : BankAccount = BankAccount(balance = 40.000, accountNumber = 403756985, ownerName = "Ivan")
    Ivan.deposit(12.000)
}
class BankAccount(
    var balance : Double,
    var accountNumber : Int = 744573254,
    var ownerName : String = "Неизвестно"
) {
    fun deposit(amount: Double) {
        balance = balance + amount
    }

    fun withdraw(amount: Double) {
        balance = balance - amount
        if (amount > balance) {
            println("Ошибка")
        } else
            println("Успешно")
    }

    fun displayBalance(amount: Double) {
        println("$balance")
    }
}