fun main() {
    val things: List<String> = listOf("Can", "Bed", "Zebra", "Donkey")
    val nums = intArrayOf(1, 2, 3, 4, 5, 6)

    //for (thing in things) println(thing)
    for (thing in things) {
        val up = thing.replaceFirstChar {
            it.lowercase()
        }
        println(up)
    }
    println()
    for (num in nums) println(num)

}