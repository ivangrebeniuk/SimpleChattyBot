package bot

import java.util.Scanner
fun main() {
    // Lesson 1 Introduce bot
    val scanner = Scanner(System.`in`)
    println("Hello! My name is Patric.\nI was created in 2023.")
    println("Please, remind me your name.")

    // Lesson 2. Print username
    val name = scanner.nextLine()
    println("What a great name you have, $name!")

    // Lesson 3 Guessing the age
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val reminderThree = readln().toInt()
    val reminderFive = readln().toInt()
    val reminderSeven = readln().toInt()

    val yourAge = (reminderThree * 70 + reminderFive * 21 + reminderSeven * 15) % 105
    println("$name, your age is $yourAge, it's a great time to start learning Kotlin!")

    // Lesson 4. Count the numbers
    println("Now I will prove to you that I can count to any number you want.")
    val number = readln().toInt()

    for (i in 1..number) {
        println("$i!")
    }

    println("Completed, have a nice day!")
}