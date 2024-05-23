fun main() {
    var num = 1

    while (num <= 5){
        println("Loop #$num")
        ++num
    }

    println("\nReversed\n")

    var num1 = 5

    while (num1 >= 1){
        println("Loop #$num1")
        --num1
    }

    println()

    val thing = "chocolate"
/*    var index = thing.length - 1 //Prints in reverse
    while (index >= 0) {
        println("\nLetter: ${thing[index]}")
        --index
    }
 */
    var index = 0

    while (index <= thing.length - 1) {
        println("Letter: ${thing[index]}")
        ++index
    }
}