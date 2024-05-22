fun main() {
    val things = "Pumpkin"
    println("$things ${things.lowercase()} ${things.uppercase()}")

    var more: String? = "Apples"
    println("$more ${more?.lowercase()} ${more?.uppercase()}")
    more = null
    println(more)
}