fun main() {
    var names = arrayOf<String>("Jane", "Timothy", "Mandy")

    println(names.contentToString())

    for(name in names){
        println(name)
    }

    names[0] = "Sandra"
    println(names.contentToString())

    println("\nArray size: ${names.size}")

    if ("Daniel" in names) {
        println("Name is in array")
    } else {
        println("\nName is not in array\n")
    }

    names += "Danny"
    println(names.contentToString())
}