fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in nums){
        if(num % 2 == 0) continue //If condition is met, skips the condition and continues the loop
        if(num > 6) break //If condition is met, stop loop
        println(num)
    }

    /* CANNOT use continue and break, they are only allowed inside a loop
    nums.forEach {
        if(it == 2) continue
    }
     */
}