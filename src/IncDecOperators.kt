fun main() {
    //++ & --
    var num = 3
    //println("++ before num: " + ++num)
    //println(num++) will not work, == must be before variable. Returns number first then increments
    println("++ after num: " + num++)
    println("printing after putting ++ after num: " + num)

    var num2 = 8
    //println("\n-- before num2: " + --num2)
    println("\n-- after num: " + num2--)
    println("printing after putting -- after num2: " + num2)
}