package org.example.oop.case1_ClassAndObjects.tasks

/*

    Создайте класс Book с полями title, author и yearPublished. Создайте класс Library, который будет содержать список книг.
    Напишите функции в классе Library:

    addBook(book: Book) — добавляет книгу в библиотеку.
    listBooks() — выводит список всех книг.
    findBooksByAuthor(author: String) — возвращает список книг указанного автора.

 */
fun main() {
    val book = Book(
        title = "растения против зомби",
        author = "мартышка хамстер 1490",
        yearPublished = 1988
    )

    val book2 = Book(
        title = "Растения против хамстеров",
        author = "дима228_хакер",
        yearPublished = -960
    )

    val book3 = Book(
        title = "Scratch vs Roblox",
        author = "Лев Толстый",
        yearPublished = 2025
    )

    val book4 = Book(
        title = "СОЮЗ НЕРУШИМЫЙ 1⃣️⃣8⃣8",
        author = "Лев Толстый",
        yearPublished = 52
    )

    val library = Library()
    library.addBook(book)
    library.addBook(book2)
    library.addBook(book3)
    library.addBook(book4)

//    library.listBooks()
    library.findBookByAuthor("Лев Толстый")
}

class Book(
    val title: String,
    val author: String,
    val yearPublished: Int
)

class Library() {
    val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun listBooks() {
        books.forEach { book_ ->
            println("💫 Название: ${book_.title}")
            println("🎨 Автор: ${book_.author}")
            println("1⃣💀☠  Год: ${book_.yearPublished}")
            println()
        }
    }

    fun findBookByAuthor(author: String) {
        books.forEach { book_ ->
            if (book_.author == author) {
                println("💫 Название: ${book_.title}")
                println("🎨 Автор: ${book_.author}")
                println("1⃣💀☠  Год: ${book_.yearPublished}")
                println()
            }
        }
    }
}