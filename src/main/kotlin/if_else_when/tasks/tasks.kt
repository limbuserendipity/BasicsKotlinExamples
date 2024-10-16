


package if_else_when.tasks


fun main(){
    task8()
}


/*
Task1: Чётное или нечётное число

Задание: Попроси пользователя ввести число.
Определи, является ли число чётным или нечётным, и выведи соответствующее сообщение.
*/
fun task1() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number - четное число.")
    } else {
        println("$number - нечетное число.")
    }
}


/*
Task2: Определение возраста

Задание: Попроси пользователя ввести свой возраст.
Если ему меньше 18 лет, выведи сообщение "Вы ещё подросток".
Если от 18 до 65, выведи "Вы взрослый". Если больше 65, выведи "Вы пенсионер".
*/
fun task2() {
    println("Введите свой возраст:")
    val age = readLine()!!.toInt()

    if (age < 18) {
        println("Вы ещё подросток")
    } else if (age in 18..65) {
        println("Вы взрослый")
    } else {
        println("Вы пенсионер")
    }
}

/*
Task3: Калькулятор скидки

Задание: Попроси пользователя ввести сумму покупки.
Если сумма больше 1000, предоставь скидку 10% и выведи итоговую сумму.
В противном случае выведи сумму без изменений.
*/
fun task3() {
    println("Введите сумму покупки:")
    val purchaseAmount = readLine()!!.toDouble()

    if (purchaseAmount > 1000) {
        val discount = purchaseAmount * 0.1
        val finalAmount = purchaseAmount - discount
        println("Скидка 10%: $discount")
        println("Итоговая сумма: $finalAmount")
    } else {
        println("Итоговая сумма: $purchaseAmount")
    }
}
/*
Task4: Максимальное из двух чисел

Задание: Попроси пользователя ввести два числа.
Определи и выведи на экран большее из них.
*/
fun task4() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    val maxNumber = if (num1 > num2) num1 else num2
    println("Максимальное число: $maxNumber")
}

/*
Task5: Игра "Угадай число"

Задание: Сгенерируй случайное число от 1 до 5.
Попроси пользователя угадать число. Если он угадал, выведи "Поздравляем, вы угадали!", иначе выведи "Неправильно, попробуйте ещё раз".
*/

fun task5() {
    val secretNumber = (1..5).random() // Генерируем случайное число от 1 до 5
    println("Я загадал число от 1 до 5. Попробуйте угадать:")

    while (true) {
        val guess = readLine()!!.toInt()
        if (guess == secretNumber) {
            println("Поздравляем, вы угадали!")
            break
        } else {
            println("Неправильно, попробуйте ещё раз.")
        }
    }
}


/*
Task6: Проверка пароля

Задание: Установи в программе пароль, например, "1234".
Попроси пользователя ввести пароль. Если введённый пароль совпадает, выведи "Доступ разрешен", иначе "Доступ запрещен".
*/
fun task6() {
    val password = "1234" // Заданный пароль

    println("Введите пароль:")
    val inputPassword = readLine()!!

    if (inputPassword == password) {
        println("Доступ разрешен")
    } else {
        println("Доступ запрещен")
    }
}

/*
Task7: Определение знака числа

Задание: Попроси пользователя ввести число.
Определи, положительное оно, отрицательное или равно нулю, и выведи соответствующее сообщение.
*/
fun task7() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    when {
        number > 0 -> println("Число положительное")
        number < 0 -> println("Число отрицательное")
        else -> println("Число равно нулю")
    }
}

/*
Task8: Калькулятор простых операций

Задание: Попроси пользователя ввести два числа и операцию (+, -, *, /).
Выполни указанную операцию и выведи результат.
*/
fun task8() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    println("Введите операцию (+, -, *, /):")
    val operation = readLine()!!

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 == 0) {
            println("Деление на ноль невозможно!")
            Double.NaN // Возвращаем NaN (Not a Number) в случае деления на ноль
        } else {
            num1 / num2
        }
        else -> {
            println("Некорректная операция!")
            Double.NaN
        }
    }

    println("Результат: $result")
}

/*
Task9: Определение високосного года

Задание: Попроси пользователя ввести год.
Определи, является ли этот год високосным, и выведи результат.
*/
fun task9() {
    println("Введите год:")
    val year = readLine()!!.toInt()

    val isLeapYear = if (year % 4 == 0) {
        if (year % 100 == 0) {
            year % 400 == 0
        } else {
            true
        }
    } else {
        false
    }

    if (isLeapYear) {
        println("$year - високосный год")
    } else {
        println("$year - не високосный год")
    }
}

/*
Task10: Определение буквы

Задание: Попроси пользователя ввести букву.
Определи, является ли она гласной или согласной, и выведи соответствующее сообщение.
*/
fun task10() {
    println("Введите букву:")
    val letter = readLine()!!.toLowerCase()

    if (letter.length != 1) {
        println("Введите одну букву!")
        return
    }

    when (letter) {
        "a", "e", "i", "o", "u","y" -> println("$letter - гласная буква")
        else -> println("$letter - согласная буква")
    }
}