fun main(args : Array<String>) {
//       println("hello everyone")

    var question2 = "Name."
//       question2 = "name of user"
    println(question2)
    print("Username?: ")
    val name = readLine()
    println("Hello and welcome back " + name)
//       this is a greeter
    val question1 = "Age."
//       var ans1 = '10';'11';'12';'13';'14';'15';'16';'17'
//       println(ans1)
    println(question1)
    print("Age of user?: ")
    val age = readLine()


//       var question3 = "Are you a former or new memeber?"
//       println(question3)

//       val number: Int = 2
//       val answer = number * 5
//       val decimalNumber: Double = 10.6
//       val floatNumber: Float = 10.6f
//    val answerdouble: Double = decimalNumber * 3
//    val answerfloat: Float = floatNumber * 3
//    println("answer: " + answerdouble)
//    println("answer: " + answerfloat)

    println("Which level of expertice shall you pick? ")
    println("1 is beginner, 2 is intermediate and 3 is advanced")
//      val character = readLine()
    val number: Int? = readLine()?.toInt()

    if (number == 1) {
        println("Beginner")
    }
    if (number == 2) {
        println("Intermediate")
    }
    if (number == 3) {
        println("Advanced")
    }
}