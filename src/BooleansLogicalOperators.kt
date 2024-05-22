fun main() {
    val isAdult = false
    val isCitizen = true
    val isMandatory = true
    val isAlive = true

    //combine two bool - logical && AND
    println(isAdult && isCitizen) //output false
    println(isAdult && isMandatory) //output false
    println(isMandatory && isCitizen && isAlive) //output false

    println()

    //combine two bool - logical || OR
    println(isAdult || isCitizen) //output true
    println(isAdult || isMandatory) //output true
    println(isMandatory || isCitizen || isAlive) //output true

    println()
    //combine two bool - logical ! NOT (negate)
    println(!isAdult) //true
    println(!isMandatory) //false
}