package org.example.oop.case1_ClassAndObjects.tasks

/*

    Класс "Банковский счёт"
    Создайте класс BankAccount с полями accountNumber, balance и ownerName. Напишите функции:

    deposit(amount: Double) — добавляет указанную сумму к балансу.
    withdraw(amount: Double) — снимает сумму с баланса, если она не превышает текущий баланс.
    displayBalance() — выводит текущий баланс на счёте.

 */

class BankAccount(
    val accountNumber: Int,
    private var balance: Double = 0.0,
    val ownerName: String
) {
    fun displayBalance() {
        println("Баланс вашего кошелька: $balance")
    }
    fun deposit(amount: Double) {
        balance += amount
        println("Деньги успешно занесены на счёт!")
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Деньги успешно выведены!")
        }
        else {
            println("Недостаточно средств.")
        }
    }
}

fun main() {
    val bankAcc = BankAccount(
        ownerName = "Олег",
        balance = 1.0,
        accountNumber = 1,
    )
    bankAcc.deposit(100.0)
    bankAcc.displayBalance()
    bankAcc.withdraw(50.5)
    bankAcc.displayBalance()
}