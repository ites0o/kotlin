fun main(args: Array<String>) {

    print("Enter marks")
    var marks:Int = readln().toInt()

    if (marks >= 80) {
        println("You have an A")
    }

    else if (marks >= 70){
        println("you have an A-")
    }

    else if (marks >= 60) {
        println("You have a B")

    }

    else{
        println("You have failed")
        println("You are to be scheduled to resit this examination")
    }

}