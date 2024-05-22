fun main() {
    val num1 = 20
    val num2 = 30
    val num3 = 10

    //"If" is basically and expression because it returns a value
    val valueRes = if(num1 >= num2 || num1 <= num3){
        "20 is more than 30"
    } else {
        "20 is less than 30"
    }
    println(valueRes)
}