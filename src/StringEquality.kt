fun main() {
    var name1 = "Mary"
    val name2 = "Betty"
    val name3 = "Mary"

    //val name3 = String("Mary".toCharArray()) //Using string constructor. New object. Avoid creating Strings like this

//    println(name1 == name2) // Not used for Strings, use below
    println(name1.equals(name3)) //Comparing contents, type safe
    println(name1 === name3) //False with toCharArray() because name3 is a whole new object

    var name4 = name1
    println(name1 === name4) //Comparing reference/memory location

    name4 = "Harry"
    println(name1 === name4)

    name4 = "Mary"
    println(name1 === name4)
}