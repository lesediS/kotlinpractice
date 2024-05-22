fun main() {
    val role = "super admin"

    val res = when (role) {
        "admin" -> "Administrator"
        "user" -> "User"
        else -> "Not a valid role"
    }
    println(res)
}