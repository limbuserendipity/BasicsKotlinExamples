package org.example.oop.case1_ClassAndObjects.tasks

import kotlin.random.Random

/*

    Классы "Игрок", "Монстр" и "Игра"
    Описание:

    Класс Player:
    Свойства: имя (name), здоровье (health), урон (damage).
    Методы: attack(monster: Monster){
         атакует монстра, уменьшает его здоровье на величину урона игрока.
    }
    Класс Monster:
    Свойства: тип (type), здоровье (health), урон (damage).
    Методы:
    attack(player: Player){
         атакует игрока, уменьшает его здоровье.
    }
    Класс Game:
    Свойства: игрок (player), монстры (monsters — список объектов Monster).
    Методы:
    start(){
        запускает бой игрока с монстрами до победы одной из сторон.
    }
    Задание: Создайте игру, где игрок сражается с несколькими монстрами, и определите победителя.

    Пример сообщений в консоль после запуска:

        Добро пожаловать в игру!
        Герой отправляется в опасное приключение!
        На пути стоят зловещие монстры:
        - Гоблин с 50 здоровья и 10 урона
        - Орк с 75 здоровья и 15 урона
        - Дракон с 150 здоровья и 30 урона

        В бою появился Гоблин!
        Герой атакует Гоблин и наносит 25 урона!
        У Гоблин осталось 25 здоровья.
        Гоблин атакует Герой и наносит 10 урона!
        У Герой осталось 90 здоровья.
        Герой атакует Гоблин и наносит 25 урона!
        Гоблин побежден!

        В бою появился Орк!
        Герой атакует Орк и наносит 25 урона!
        У Орк осталось 50 здоровья.
        Орк атакует Герой и наносит 15 урона!
        У Герой осталось 75 здоровья.
        ...

        Герой одержал победу! Все монстры повержены!

 */

class Player(
    val name: String,
    private var health: Int = 100,
    val damage: Int,
    var isDead: Boolean = false
) {
    fun takeDamage(damager: Monster, dmg: Int) {
        if ((health - dmg) <= 0) {
            isDead = true
            println("${damager.type} побеждает $name!")
        } else {
            health -= dmg
            println("${damager.type} атакует $name и наносит $dmg урона!\n" +
                    "        У $name осталось $health здоровья.")
        }
    }
}

class Monster(
    val type: String,
    var health: Int = 100,
    val damage: Int,
    var isDead: Boolean = false
) {
    fun takeDamage(damager: Player, dmg: Int) {
        if ((health - dmg) <= 0) {
            println("${damager.name} побеждает $type!")
            isDead = true
        } else {
            health -= dmg
            println("${damager.name} атакует $type\nа и наносит $dmg урона!\n" +
                    "        У $type осталось $health здоровья.")
        }
    }
    fun appear() {
        println("В бою появился $type!")
    }
}

class Game(
    private val player: Player,
    private val monsters: List<Monster> = listOf()
) {
    private fun attack(monster: Monster): String {
        val random1 = Random.nextInt(1, 4)
        when(random1) {
            1 -> player.takeDamage(monster, Random.nextInt(5, monster.damage))
            2, 3 -> monster.takeDamage(player, Random.nextInt(5, player.damage))
        }
        println()
        if (player.isDead) {
            println("Вы проиграли!")
            println("Вас убил ${monster.type}")
            return "Player Died"
        }
        if (monster.isDead) {
            return "Monster Died"
        }
        return "Both Alive"
    }

    fun start() {
        // Старт
        println("Добро пожаловать в игру!\n" +
                "Герой отправляется в опасное приключение!\n" +
                "На пути стоят зловещие монстры: ")
        for (monster: Monster in monsters) {
            println("- ${monster.type} с ${monster.health} здоровья и ${monster.damage} урона")
        }
        println()
        Thread.sleep(5000)

        // Игра
        for (monster: Monster in monsters) {
            monster.appear()
            while (true) {
                val attackResult = attack(monster)
                when (attackResult) {
                    "Player Died" -> return
                    "Monster Died" -> {
                        Thread.sleep(3000)
                        break
                    }
                    else -> {
                        Thread.sleep(2000)
                    }
                }
            }
            continue
        }
        println("${player.name} одержал победу! Все монстры повержены!")
    }
}

fun main() {
    val player1 = Player(
        name = "Илья",
        damage = 25
    )

    val monster1 = Monster(
        type = "Гоблин",
        damage = 25
    )
    val monster2 = Monster(
        type = "Орк",
        damage = 25
    )
    val monster3 = Monster(
        type = "Дракон",
        damage = 15
    )
    val game = Game(player1, listOf(monster1, monster2, monster3))
    game.start()
}
