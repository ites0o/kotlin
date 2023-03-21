fun main(args: Array<String>) {
    println("Enter your weight")
    var weight = readln()!!.toInt()
    println("Enter your height")
    var height = readln()!!.toFloat()
    var bmi = weight/(height * height)
    println(bmi)
    if (bmi <= 18){
        println("underweight")
    }
    else if (bmi <= 29){
        println("Normal weight")
    }
    else if (bmi <= 34){
        println("overweight")
    }
    else {
        println("Obese")
    }
}