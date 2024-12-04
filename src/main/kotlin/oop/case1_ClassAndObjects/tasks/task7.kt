package org.example.oop.case1_ClassAndObjects.tasks

/*

    Класс "Виртуальный питомец" с возможностью смерти
    Свойства:
    name — имя питомца.
    hungerLevel — уровень голода (от 0 до 100).
    happinessLevel — уровень счастья (от 0 до 100).
    isAlive — статус питомца (живет или умер).
    Методы:
    feed(food: Int){
        Уменьшает уровень голода на указанное количество (не ниже 0).
        Если уровень голода достигает 100, питомец умирает.
    }
    play(time: Int){
        Увеличивает уровень счастья на указанное количество (не выше 100).
        Но также увеличивает уровень голода на time / 10.
        Если уровень счастья падает до 0, питомец умирает.
    }
    status(){
        Выводит имя питомца, его текущий уровень голода и счастья, а также статус (жив или мертв).
    }
    checkLife(){
        Проверяет, не достиг ли уровень голода 100 или уровень счастья 0. Если да, питомец умирает.
    }
    Задание:
    Создайте питомца с именем и начальными уровнями сытости и счастья (например, 50).
    Напишите цикл, в котором вы можете кормить и играть с питомцем, пока он жив.
    Если питомец умирает, игра заканчивается, и выводится сообщение о смерти.

 */

class Pet(
    val name: String,
    var hungerLevel: Int = 0,
    var happinessLevel: Int = 100,
    var isAlive: Boolean = true
) {
    fun start() {
        while(true) {
            Thread.sleep(5000)
            hungerLevel += 1
            happinessLevel -= 1
            if (hungerLevel >= 100) {
                println("Ваш питомец умер от голода.")
            }
            if (happinessLevel <= 0) {
                println("Ваш питомец умер от нехватки счастья.")
            }
        }
    }
    fun status() {
        println("Ваш питомец $name: ")
        println("Статус: ${if (isAlive) "Жив" else "Умер"}")
        println("Уровень голода: $hungerLevel")
        println("Уровень счастья: $happinessLevel")
        println()
    }
    fun checkLife() {
        if (hungerLevel == 100) {
            println("Ваш питомец умер от голода.")

        }
    }
    fun play(time: Int) {
        println("Вы играете с вашим питомцем...")
        Thread.sleep((time * 1000).toLong())
    }
    fun feed(foodCount: Int) {
        if (hungerLevel > 0) {
            println("Вы успешно покормили своего питомца.")
            if (hungerLevel - foodCount < 0) {
                hungerLevel = 0
            } else {
                hungerLevel -= foodCount
            }
        } else if (hungerLevel == 0) {
            println("Ваш питомец сыт!")
        }
    }
}

fun main() {
    val pet1 = Pet(
        name = "Илья"
    )
    pet1.start()
    pet1.play(3)
    pet1.feed(8)
    pet1.status()
}