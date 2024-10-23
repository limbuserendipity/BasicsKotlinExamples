package functions

fun main() {

    // Вызов простой функции
    greet()

    // Вызов функции с параметром
    greetUser("Алексей")

    // Вызов функции с возвращаемым значением
    val result = add(5, 10)
    println("Результат сложения: $result")

    // Вызов функции с параметром по умолчанию
    greetUserDefault()
    greetUserDefault("Иван")

    greetUserByAge()
    greetUserByAge(age = 35)
    greetUserByAge(name = "Алексей", age = 26)


    // Вызов функции с именованными аргументами
    calculateArea(width = 5, height = 10)
    calculateArea(height = 7, width = 3) // Порядок аргументов не важен благодаря именованию

    // Вызов функций с одинаковыми именами
    size(40)
    size(100, 40)

}


// Простая функция без параметров и возвращаемого значения
fun greet() {
    println("Здравствуйте!")
}

// Функция с параметром
fun greetUser(name: String) {
    println("Здравствуйте, $name!")
}

// Функция с возвращаемым значением
fun add(a: Int, b: Int): Int {
    return a + b
}

// Знак равно в этом случае означает return
fun get42() = 42

fun square(number : Int) = number * number

// Функция с параметром по умолчанию
fun greetUserDefault(name: String = "Гость") {
    println("Здравствуйте, $name!")
}

fun greetUserByAge(
    name: String = "Гость",
    age : Int = 0
){
    val greetMessage = if(age < 18){
        "Привет"
    }else{
        "Здравствуйте"
    }

    println("$greetMessage $name")

}

// Функция с именованными аргументами
fun calculateArea(width: Int, height: Int) {
    val area = width * height
    println("Площадь: $area")
}

/*
    Функции с одинаковым именем, но разными значениями
 */

fun size(size : Int){
    println("Ширина: $size")
    println("Высота $size")
}

fun size(width : Int, height : Int){
    println("Ширина: $width")
    println("Высота $height")
}

