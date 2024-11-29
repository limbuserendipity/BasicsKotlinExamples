package org.example.oop.case1_ClassAndObjects.tasks

/*

    Создайте класс Book с полями title, author и yearPublished. Создайте класс Library,
    который будет содержать список книг.
    Напишите функции в классе Library:

    addBook(book: Book) — добавляет книгу в библиотеку.
    listBooks() — выводит список всех книг.
    findBooksByAuthor(author: String) — возвращает список книг указанного автора.

 */
fun main() {
    val book = Book(
        title = "РастениЯ vs Олег легенда годжо сатору 228фпс💀",
        author = "Олег годжо",
        yearPublished = 1488
    )

    val book2 = Book(
        title = "Убить Олега",
        author = "Олег_хакер",
        yearPublished = 1234567890
    )
    val book3 = Book(
        title = "Клавиатурная мышь 🐭🐁🦇🖱 vs Данил",
        author = "Лев Толстый",
        yearPublished = 52
    )

    val library = Library()
    library.addBook(book)
    library.addBook(book2)
    library.addBook(book3)
    library.listBooks()
    library.findBooksByAuthor("Лев Толстый")
}

class Book (
    val title : String,
    val author : String,
    val yearPublished : Int
)

class Library() {
    val books = mutableListOf<Book>()

    fun addBook (book: Book) {
        books.add(book)
    }

    fun listBooks() {
        books.forEach { book ->
            println("🚻Название: ${book.title}")

            println("🎸Автор: ${book.author}")

            println("💀Год: ${book.yearPublished}")
        }
    }

    fun findBooksByAuthor(author : String) {
        books.forEach { book ->
            if (book.author == author) {
                println("🚻Название: ${book.title}")
                println("🎸Автор: ${book.author}")
                println("💀Год: ${book.yearPublished}")
            }
        }
    }
}