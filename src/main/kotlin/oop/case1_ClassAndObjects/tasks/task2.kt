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

// Класс, представляющий книгу
class Book(val title: String, val author: String, val yearPublished: Int) {

    // Метод для отображения информации о книге
    // Удобно для вывода в читаемом формате
    fun displayInfo() {
        println("Название: \"$title\", Автор: $author, Год издания: $yearPublished")
    }
}

// Класс, представляющий библиотеку
// Содержит список книг и предоставляет методы для работы с ними
class Library {

    // Хранилище книг в виде списка
    private val books = mutableListOf<Book>()

    // Метод для добавления книги в библиотеку
    fun addBook(book: Book) {
        books.add(book)
        println("Книга \"${book.title}\" добавлена в библиотеку.")
    }

    // Метод для вывода списка всех книг
    // Перебирает каждую книгу в списке и отображает её информацию
    fun listBooks() {
        if (books.isEmpty()) {
            println("Библиотека пуста.")
        } else {
            println("Список книг в библиотеке:")
            books.forEach { it.displayInfo() }
        }
    }

    // Метод для поиска книг по автору
    // Фильтрует книги из списка, автор которых совпадает с указанным
    fun findBooksByAuthor(author: String): List<Book> {
        val booksByAuthor = books.filter { it.author.equals(author, ignoreCase = true) }
        return booksByAuthor
    }
}

// Точка входа в приложение
fun main() {
    // Создаем экземпляр библиотеки
    val library = Library()

    // Создаем несколько экземпляров книг
    val book1 = Book("Мастер и Маргарита", "Михаил Булгаков", 1967)
    val book2 = Book("Война и мир", "Лев Толстой", 1869)
    val book3 = Book("Преступление и наказание", "Фёдор Достоевский", 1866)
    val book4 = Book("Анна Каренина", "Лев Толстой", 1877)

    // Добавляем книги в библиотеку
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)
    library.addBook(book4)

    // Выводим список всех книг
    library.listBooks()

    // Ищем книги определенного автора
    val authorToSearch = "Лев Толстой"
    println("\nКниги автора $authorToSearch:")
    val booksByAuthor = library.findBooksByAuthor(authorToSearch)
    if (booksByAuthor.isEmpty()) {
        println("Книг автора $authorToSearch не найдено.")
    } else {
        booksByAuthor.forEach { it.displayInfo() }
    }
}
