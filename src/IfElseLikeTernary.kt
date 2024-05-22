fun main() {
    val num1 = 20
    val num2 = 30

    //Ternary
    val res = if(num1 >= num2) "20 is more than 30" else "20 is less than 10"
    print(res)

    //With +1 if
    val value = if(num1 >= num2) "20 is more than 30"
                else if (num1 <= num2) "20 is less than 10"
                else "sumthing"
}