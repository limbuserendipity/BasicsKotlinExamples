package org.example.oop.case2_Inheritance

/*

    Наследование — это инструмент,
    позволяющий описать новый класс на основе уже существующего с частично или полностью заимствованной функциональностью.
    Это мощный инструмент пере-использования кода и создания собственных иерархий классов.
    Можно сказать, что на основе одного класса строится новый класс, путем добавления новых полей и методов.

 */

/*
    Чтобы наследоваться от объекта мы ставим двоеточье (:)
    и пишем название класса от которого мы хотим наследоваться
 */

open class Letter(
    var symbol : Char
){
    fun printSymbol(){
        println(symbol)
    }
}

class A(
    symbol : Char = 'a'
) : Letter(symbol)

class B(
    symbol : Char = 'b'
) : Letter(symbol){

    fun toUpperCase(){
        symbol = symbol.uppercaseChar()
    }

}

fun main(){

    val a = A()
    a.printSymbol()

    val b = B()
    b.printSymbol()
    b.toUpperCase()
    b.printSymbol()
}