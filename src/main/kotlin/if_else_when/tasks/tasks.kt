package if_else_when.tasks

fun main(){
    /*  task1()
      task2()
      task3()
      task4()
      task5()
      task6()
      task7()
      task8()*/
    task9()
    //task10()


}


/*
Task1: Чётное или нечётное число

Задание: Попроси пользователя ввести число.
Определи, является ли число чётным или нечётным, и выведи соответствующее сообщение.
*/
fun task1() {
}

/*
Task2: Определение возраста

Задание: Попроси пользователя ввести свой возраст.
Если ему меньше 18 лет, выведи сообщение "Вы ещё подросток".
Если от 18 до 65, выведи "Вы взрослый". Если больше 65, выведи "Вы пенсионер".
*/
fun task2() {
    var age = readLine()!!.toInt()
    if(age < 18){
        println("вы еще подросток")
    }else if(age >= 18 && age <= 65){
        println("вы взрослый")
    }else if(age > 65){
        println("вы пенсионер")
    }
}

/*
Task3: Калькулятор скидки

Задание: Попроси пользователя ввести сумму покупки
Если сумма больше 1000, предоставь скидку 10% и выведи итоговую сумму.
В противном случае выведи сумму ез изменений.
*/
fun task3() {
    val itog = readLine()!!.toDouble()
    val skidka = itog / 10
    if (itog >= 1000){
        println("ваша скидка:10% ($skidka рублйей)")
        println("итого: ${itog - skidka} рублей")
    }else{
        println("у вас нед скидки")
    }

}

/*
Task4: Максимальное из двух чисел

Задание: Попроси пользователя ввести два числа.
Определи и выведи на экран большее из них.
*/
fun task4() {
    val number1 = readLine()!!.toDouble()
    val number2 = readLine()!!.toDouble()
    println(maxOf(number2, number1))
}

/*
Task5: Игра "Угадай число"

Задание: Сгенерируй случайное число от 1 до 5.
Попроси пользователя угадать число. Если он угадал, выведи "Поздравляем, вы угадали!", иначе выведи "Неправильно, попробуйте ещё раз".
*/
fun task5() {
    println("напиши число от 1 до 5")
    var number = (1..5).random()
    var read = readLine()!!.toInt()
    if(number == read){
        println("ты угадал!")
    }else{
        println("ты не угадал, выпало $number")
    }

}

/*
Task6: Проверка пароля

Задание: Установи в программе пароль, например, "1234".
Попроси пользователя ввести пароль. Если введённый пароль совпадает, выведи "Доступ разрешен", иначе "Доступ запрещен".
*/
fun task6() {
    println("введите пароль")
    val password = 1234
    val what = readLine()!!.toInt()
    if(password == what){
        println("вход выполнен")
    }else{
        println("неверный пароль")
    }
}

/*
Task7: Определение знака числа

Задание: Попроси пользователя ввести число.
Определи, положительное оно, отрицательное или равно нулю, и выведи соответствующее сообщение.
*/
fun task7() {
    println("введите число")
    val number = readLine()!!.toInt()
    if(number > 0){
        println("число $number положительное")
    }else if(number == 0){
        println("число $number равно нулю")
    }else if(number < 0){
        println("число $number отрицательное")
    }
}

/*
Task8: Калькулятор простых операций

Задание: Попроси пользователя ввести два числа и операцию (+, -, *, /).
Выполни указанную операцию и выведи результат.
*/
fun task8() {
    println("введите 1 число")
    val num1 = readLine()!!.toInt()
    println("введите 2 число")
    val num2 = readLine()!!.toInt()
    println("введите операцию")
    val operation = readLine()

    if(operation == "+"){
        println("$num1 + $num2 = ${num1 + num2}")
    }

    if(operation == "-"){
        println("$num1 - $num2 = ${num1 - num2}")
    }

    if(operation == "*"){
        println("$num1 * $num2 = ${num1 * num2}")
    }

    if(operation == "/"){
        println("$num1 / $num2 = ${num1 / num2}")
    }

}

/*
Task9: Определение високосного года

Задание: Попроси пользователя ввести год.
Определи, является ли этот год високосным, и выведи результат.
*/
fun task9() {
    println("введите год")
    val year = readLine()!!.toInt()
    if (year % 4 == 0) {
        println("$year високосный")
    }else{
        println("$year не висоскосный")
    }
}

/*
Task10: Определение буквы

Задание: Попроси пользователя ввести букву.
Определи, является ли она гласной или согласной, и выведи соответствующее сообщение.
*/
fun task10() {
    println("введите букву")
    val letter = readLine()!!.toString()
    when(letter) {
        "a" -> println("гласная")
        "e" -> println("гласная")
        "i" -> println("гласная")
        "o" -> println("гласная")
        "u" -> println("гласная")
        "y" -> println("гласная")
        else  -> println("согласная")
    }
}