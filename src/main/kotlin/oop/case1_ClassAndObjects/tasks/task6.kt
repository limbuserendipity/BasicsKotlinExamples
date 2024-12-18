package org.example.oop.case1_ClassAndObjects.tasks

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
    var health: Int = 100,
    val damage: Int
) {
    fun attack (monster: Monster, dmg: Int) {
        println("Игрок нанёс урон монстру!")
        monster.health -= dmg
    }
}

class Monster(
    val type: String,
    var health: Int = 50,
    var damage: Int = 10
) {
    fun attack (player: Player, dmg: Int) {
        println("Монстр нанёс урон игроку!")
        player.health -= dmg
    }
}

class Ork(
    val type: String,
    var health: Int = 75,
    var damage: Int= 15
) {
    fun attack (player: Player, dmg: Int) {
        println("Орк нанёс урон игроку!")
        player.health -= dmg
    }
}

class Dragon(
    val type: String,
    var health: Int = 150,
    var damage: Int = 30
) {
    fun attack (player: Player, dmg: Int) {
        println("Дракон нанёс урон игроку!")
        player.health -= dmg
    }
}

class Game(
    var player: Player,
    val monsters: List<Monster> = mutableListOf()
) {
    fun start() {
        println(" Добро пожаловать в игру!\n" +
                "${player.name} отправляется в опасное приключение!\n" +
                "На пути стоят зловещие монстры:\n")
        for (monster in monsters) {
            println("${monster.type} с ${monster.health} здоровья и ${monster.damage} урона")
        }
        for (ork in monsters) {
            println("${ork.type} с ${ork.health} здоровья и ${ork.damage} урона")
        }
        for (dragon in monsters) {
            println("${dragon.type} с ${dragon.health} здоровья и ${dragon.damage} урона")
        }
        println("В бою появился ${monsters}")

    }
}
