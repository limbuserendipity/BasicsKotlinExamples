package functions

/*

    Функция высшего порядка — это функция,
    которая принимает другую функцию в качестве параметра или возвращает функцию в качестве результата.
    В Kotlin функции являются объектами первого класса, что означает,
    что их можно передавать и использовать как любые другие значения.

 */

fun main(){
    action(::addData)
    action(act = { deleteData() })
    action {
        updateData()
    }
}

var data = 101010101

fun action(act : () -> () -> String){
    println(act()())
}

fun addData() : () -> String{
    data = 101010101
    return { "Данные добавлены" }
}

fun deleteData() : () -> String{
    data = 0
    return { "Данные уделены" }
}

fun updateData() : () -> String{
    data = data
    return { "Данные обновлены" }
}