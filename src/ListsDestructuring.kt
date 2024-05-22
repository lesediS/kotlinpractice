fun main() {
    //can also work with arrayOf
    val things: List<String> = listOf("Can", "Bed", "Zebra", "Donkey")

    //DO: do it like this
    val (one, _, three, four) = things //Omit "Bed"
    println("$one $three $four") //"Bed" is not printed

    /* DON'T do it like this
    val can = things[0]
    val bed = things[1]
    val zebra = things[2]
    val donk = things[3]
     */
}