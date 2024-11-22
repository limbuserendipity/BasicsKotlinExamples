package org.example.oop.case1_ClassAndObjects.tasks

import java.util.UUID

/*

    Класс "Студент и курс"
    Создайте класс Student с полями name, id и grade (оценка).
    Создайте класс Course с полем students, представляющим список студентов.
    Напишите функции в Course:

    addStudent(student: Student) — добавляет студента в курс.
    averageGrade() — возвращает среднюю оценку по курсу.
    topStudent() — возвращает студента с наивысшей оценкой.

 */

class Student(
    private val id: String = UUID.randomUUID().toString(),
    val name: String,
    val grade: Int,
) {
    fun displayData() {
        println("Информация о студенте:")
        println("ID: $id")
        println("Имя: $name")
        println("Оценка: $grade")
    }
}

class Course(
    private var students: MutableList<Student> = mutableListOf(),
    val item: String
) {
    fun addStudent(student: Student) {
        students.add(student)
        println("Успешно добавлен ${student.name}")
    }
    fun averageGrade(): Int {
        var sum: Int = 0
        students.forEach { student_ ->
            sum += student_.grade
        }
        return sum / students.size
    }
    fun topStudent(): Student {
        var high: Student = Student(
            name = "null",
            grade = -1
        )
        students.forEach { student_ ->
            if (student_.grade >= high.grade) {
                high = student_
            }
        }
        return high
    }
}

fun main() {
    val student1 = Student(
        name = "Вася",
        grade = 5
    )
    val student2 = Student(
        name = "Миша",
        grade = 3
    )
    val student3 = Student(
        name = "Дима",
        grade = 2
    )
    val student4 = Student(
        name = "Витя",
        grade = 2
    )

    student1.displayData()

    val course1 = Course(
        item = "География"
    )
    course1.addStudent(student1)
    course1.addStudent(student2)
    course1.addStudent(student3)
    course1.addStudent(student4)

    println(course1.topStudent().name)
    println(course1.averageGrade())
}