fun main() {
    val num1 = 20
    val num2 = 30
    val num3 = 10

    //If-else to when
    val resIf = when {
        (num1 >= num2 && num1 <= num3) -> "20 is more than 30"
        (num2 >= num3 && num2 <= num3) -> "20 is less than 30"
        else -> ":D"
    }
    println(resIf)

    val age = 5
    val resAge = when (age){
        in 1..10 -> "Less than 10"
        !in 11..20 -> "More than 20"
        else -> "More than 20"
    }
    println(resAge)
}