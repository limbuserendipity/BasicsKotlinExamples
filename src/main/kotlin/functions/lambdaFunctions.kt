package functions

import kotlin.random.Random

/*
    Лямбда-выражения представляют небольшие кусочки кода,
    выполняющие действия. Лямбды — это сокращенная запись функций,
    что делает их удобными и компактными.
    Лямбда-выражения могут передаваться в переменные и параметры функций,
    а также использоваться как аргументы других функций.
 */

fun main() {
    lambdaExample5()
}

/*
    Создание лямбда выражений и присвоение их в переменные
    Когда лямбда выражение находиться внутри переменной её называют лямбда функцией
 */
fun lambdaExample1() {



    val hw = { println("Hello World") }
    hw()

    // если лямбда должна что-то вернуть,
    // то вместо слова return,
    // она вернет последние значение в строке
    val getRandomNumber: () -> Int = {
        // Возвращаем значение
        Random.nextInt()
    }

    // Мы можем обратиться к переменной внутри лямбды с помощью it
    val getRandomNumberByRange: (IntRange) -> Int = { it.random() }

    println(getRandomNumber())
    println(getRandomNumberByRange(0..6))
}

fun lambdaExample2() {
    // Если в лямбде больше одного аргумента
    // мы должны присвоить им имена
    val operationSum: (Int, Int) -> Unit = { n1, n2 ->
        println(n1 + n2)
    }
    operationSum(1, 2)
}

fun lambdaExample3(){

    fun logIn(
        check : (String, Int) -> Boolean,
        userName : String,
        password : Int
    ){
        if(check(userName, password)){
            println("Вход")
        }else{
            println("Не верное имя пользователя или пароль")
        }
    }

    val users = listOf("User1", "User2", "User3")

    logIn(
        check = { user, _ ->
            users.contains(user)
        },
        userName = "User1",
        password = 123,
    )

}

fun lambdaExample4() {

    // С помощью лямбда выражений
    // можно возвращать ответ от функций
    // которые ждут долгой загрузки

    fun fetchData(id: Int, callback: (String) -> Unit) {
        println("Загружаем данные...")
        println("Загружаем данные...")
        println("Загружаем данные...")
        val result = if(id == 1) "Успешно" else "Ошибка"
        callback(result)
    }

    // Если лямбда в качестве параметра функции находиться на последнем месте
    // вызов функции можно сократить до:
    fetchData(id = 1){ result ->
        println(result)
    }

}


fun lambdaExample5() {

    val operation = fun(n1: Int, n2: Int, op: (Int, Int) -> Int) : Int{
        return op(n1, n2)
    }

    var result = operation(3, 7){ n1, n2 ->
        n1 + n2
    }

    println(result)

    result = operation(3, 7){ n1, n2 ->
        n1 - n2
    }

    println(result)

}
