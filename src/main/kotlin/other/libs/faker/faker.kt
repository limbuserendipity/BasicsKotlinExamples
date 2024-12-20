package org.example.other.libs.faker

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.FakerConfig
import io.github.serpro69.kfaker.create
import kotlin.random.Random

fun main(){
    example3()
}

fun example1(){
    // Обычное создание экземпляра класса Faker
    val faker = Faker()
    // Создание экземпляра класса Cat
    val cat = faker.cat
    println("Имя случайного кота: ${cat.name()}")
    println("Порода случайного кота: ${cat.breed()}")
    println("Место регистрации кота: ${cat.registry()}")
}

fun example2(){
    // Создание Faker с конфигом
    val faker = Faker(fakerConfig = FakerConfig.builder().create {
        locale = "ru"
        uniqueGeneratorRetryLimit = 100
    })

    val name = faker.name
    println(name.firstName())
}

fun example3(){
    val faker = Faker()
    val name = faker.name.unique
    val address = faker.address.unique
    val set = mutableSetOf<String>()
    repeat(10000){
        println("Уникальное имя: ${name.name()}")
        println("Уникальный адрес: ${address.fullAddress()}")
        set.add(name.name())
    }
}