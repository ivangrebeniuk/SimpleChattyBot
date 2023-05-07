package bot

import java.util.Scanner
fun main() {

    val scanner = Scanner(System.`in`)

    println("Hello! My name is Patric.\nI was created in 2023.")
    println("Please, remind me your name.")
    val name = scanner.nextLine()
    println("What a great name you have, $name!")

    // Guessing the age
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val reminderThree = readln().toInt()
    val reminderFive = readln().toInt()
    val reminderSeven = readln().toInt()

    val yourAge = (reminderThree * 70 + reminderFive * 21 + reminderSeven * 15) % 105
    println("$name, your age is $yourAge, it's a great time to start learning Kotlin!")
}