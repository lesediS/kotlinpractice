fun main() {
    val name = "Jasmine"
    println("$name has ${name.length} characters")
    println("${name[0]} is the first letter. ${name[4]} is the 5th letter")

    /* name.toCharArray()
    for (char in name) {
        println(char)
    } */

    val age = 20
//    var msg = name + " is " + age (Don't use this approach, use the one below"
    val msg = "$name is: ($age) years old"
    println(msg)
    println(msg.uppercase())

    val multiLineStr = """
        Hey %s
            hows
        it
        going
    """.trimIndent()
    println("\n${multiLineStr.format(name)}")
}