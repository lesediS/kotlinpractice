fun main() {
    val thing = "Crunk"
    for (c in thing) {
        println(c)
    }

    for (c in thing.indices.reversed()) {
        println(c)
    }
}