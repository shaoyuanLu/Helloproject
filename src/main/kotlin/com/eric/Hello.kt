package com.eric

fun main(args: Array<String>) {
//    Human().hello()
    val h = Human(weight =  66.5f, height = 1.7f)
    h.bmi()
    println(h.bmi())
    val c:Char='A'
    println(c.toInt()>60)

  /*  h.hello()
    var age=19
    var name="Eric"
    println(name+age)*/
}
class Human(var weight:Float,var height:Float,var name:String="") {
    init {
        println("test $weight$height")
    }
    fun bmi():Float{
        val bmi=weight/(height*height)
        return bmi

    }
    fun hello() {
        println("Hello kotlin")
    }
}
