package bot

import java.util.Scanner
fun main() {

    val scanner = Scanner(System.`in`)

    println("Hello! My name is Patric.\nI was created in 2023.")
    println("Please, remind me your name.")

    val userName = scanner.nextLine()
    println("What a great name you have, $userName!")

}