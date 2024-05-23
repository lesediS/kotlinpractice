fun main() {
    //Lists are expandable, Arrays are not
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
        println("\nName is not in array\n\n")
    }

    names += "Danny"
    println(names.contentToString())


    val nullArray = arrayOfNulls<String>(10)

    println(nullArray.contentToString())
//    nullArray.fill("*", 2, 7)
    nullArray.fill("*")
    println(nullArray.contentToString())

    nullArray[5] = "Index5"
    println(nullArray.contentToString())

/*    fun main() {
        val names = arrayOf<String>("Jane", "Michael", "Lenny", "Danny") //Can remove <String> cause it's redundant here
        println(names.contentToString())
        //println(names[0])
        for (name in names){
            println(name)
        }
        println()
        names[0] = "Kathy"
        println(names.contentToString())
        for (name in names){
            println(name)
        }
        println("\n${names.size}")
        //check if name is in array
        if ("Kathy" in names){
            println("\nName exists")
        } else {
            println("Name does NOT exist")
        }
    }

 */
}