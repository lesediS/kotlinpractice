fun main() {
    val things: MutableList<String> = mutableListOf("Can", "Bed", "Zebra", "Donkey")

    println(things)

    things.add("Sugar")
    println("$things\n")
    things.removeAt(2)
    println(things)

    println(things[2])
    println(things.first())
    println(things.last())
    println(things.size)
    println(things.contains("Bed")) //boolean true/falses
    println(things.indexOf("Bed"))

    val nullArr = arrayOfNulls<String>(5)
    println(nullArr.contentToString())
    val emptyList = mutableListOf<Any>()
    println(emptyList)
    println(emptyList.isEmpty()) //boolean

}