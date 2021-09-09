import java.util.*
import kotlin.system.exitProcess

fun main() {
    while (true) {
        println("""CALCULATE""".trimIndent())

        // MENU
        println("""
            chose your operation:
            [1] -  Plus
            [2] - Minus
            [3] - Times
            [4] - Divide
            [5] - Exit
            """".trimIndent())
        print(">")

        when(readLine()!!) {
            "1" -> { toPlus() }
            "2" -> {
                toMinus()
            }
            "3" -> {
                toTimes()
            }
            "4" -> {
                toDiv()
            }
            "5" -> {
                exit()
            }
            else -> {
                println("Invalid Operation, try again")
                break
            }
        }

    }
}

fun toPlus(){
    val plus: (Float, Float) -> Unit = {x, y -> println(x.plus(y))}
    val scanner = Scanner(System.`in`)

    // First Number 'n1'
    print("Enter with the first number: ")
    val n1: Float = scanner.nextFloat()

    print("Enter with the second(2°) number: ")
    val n2: Float = scanner.nextFloat()


    plus(n1, n2)
}
fun toMinus() {
    val minus: (Double, Double) -> Unit = {x, y -> println(x.minus(y)) }
    val scanner = Scanner(System.`in`)

    print("Enter with the first number: ")
    val n1 = scanner.nextDouble()

    print("Enter with the second number: ")
    val n2 = scanner.nextDouble()

    minus(n1, n2)
}

fun toTimes() {
    val times: (Double, Double) -> Unit = {x, y -> println(x.times(y))}
    val scanner = Scanner(System.`in`)

    print("Enter with the first number:  ")
    val n1 = scanner.nextDouble()

    print("Enter with the second number: ")
    val n2 = scanner.nextDouble()

    times(n1, n2)
}

fun toDiv() {
    val div: (Double, Double) -> Unit = {x, y -> println(x.div(y))}
    val scanner = Scanner(System.`in`)

    print("Enter with the first number: ")
    val n1 = scanner.nextDouble()

    print("Enter with the second number: ")
    val n2 = scanner.nextDouble()

    if (n2 > 0f) div(n1, n2) else println("Invalid Operation\n Try again")
}

fun exit() {
    exitProcess(0)
}
