package org.example.oop.case1_ClassAndObjects.tasks

/*

    Класс "Студент и курс"
    Создайте класс Student с полями name, id и grade (оценка).
    Создайте класс Course с полем students, представляющим список студентов.
    Напишите функции в Course:

    addStudent(student: Student) — добавляет студента в курс.
    averageGrade() — возвращает среднюю оценку по курсу.
    topStudent() — возвращает студента с наивысшей оценкой.

 */
class Student(val name: String, val id: Int, val grade: Double)

class Course {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun averageGrade(): Double {
        return if (students.isEmpty()) {
            0.0
        } else {
            students.map { it.grade }.average()
        }
    }

    fun topStudent(): Student? {
        return students.maxByOrNull { it.grade }
    }
}


fun main() {
    val course = Course()

    val student1 = Student("Олег", 228, 999.9)
    val student2 = Student("Илья", 2, -2.0)
    val student3 = Student("Литвин", 3, 1234567890.0)

    course.addStudent(student1)
    course.addStudent(student2)
    course.addStudent(student3)

    println("Средняя оценка: ${course.averageGrade()}")
    println("Студент с наивысшей оценкой: ${course.topStudent()}")
}

