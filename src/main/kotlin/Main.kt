package org.example

fun main() {
    val pairBox1 = "Apple" to "Banana"
    println("${pairBox1.second} is good but i prefer ${pairBox1.first}")

    val pairBox2 = Triple("Apple", "Banana", "Melon")
    println("i like ${pairBox2.second} but i prefer ${pairBox2.first}, however ${pairBox2.third} is also good")

    val box1 = mutableListOf("Apple", "Banana", "Melon")
    box1.add("Orange")

    println("Mutable list: $box1")


    val user = User.create("John Doe")
    println("User name: ${user.name}")

    println("User type: ${User.USER_TYPE}")


    val human1 = Humanoid("John", 37)
    val human2 = Humanoid("Bekka", 26)

    human1.introduction()
    human2.introduction()
}



class User private constructor(val name: String) {
    companion object {
        fun create(name: String): User {
            return User(name)
        }

        const val USER_TYPE = "DEFAULT_USER"
    }
}


open class Station {
    val faction = "Search Party"
}


class Humanoid(val name: String, val age: Int) : Station() {
    fun introduction() {
        println("$name - $age - $faction")
    }
}