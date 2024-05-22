fun main() {
//    val nums = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chars = charArrayOf('A', 'B', 'C', 'D', 'E', 'F')
    for (index in chars.indices) { //indices prints index position
        println("$index - ${chars[index]}")
    }

    println("Reverse")
    for (index in chars.indices.reversed()) {
        println("$index - ${chars[index]}")
    }
}