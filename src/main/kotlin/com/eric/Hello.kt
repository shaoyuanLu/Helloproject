package com.eric

fun main(args: Array<String>) {
//    Human().hello()
    val h = Human()
    h.hello()
    var age=19
    val name:String="Eric"
    println(name+age)
}
class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
