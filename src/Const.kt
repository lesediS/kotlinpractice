//MUST be defined outside function. Cannot be inside a function
//const val -> known before execution
const val PI = 3.14 //Java equivalent : static final

fun main() {
    //const -> values never change
    val name = "Bob" //Java equivalent : final
    var age = 4

    println("My name is $name and I am $age years old. I like the number $PI")
}