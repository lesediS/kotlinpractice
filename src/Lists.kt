fun main() {
    //Lists are expandable, Arrays are not
    val things: List<String> = listOf("Can", "Bed", "Zebra", "Donkey")

    println(things)
    println(things[2])
    println(things.first())
    println(things.last())
    println(things.size)
    println(things.contains("Bed")) //boolean
    println(things.indexOf("Bed"))
}