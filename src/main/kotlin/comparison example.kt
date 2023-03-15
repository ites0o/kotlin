fun main(args: Array<String>) {
    print("Enter MMI code")
    var num:Int = readln().toInt()

    if ( num == 1){
        println("Sh20 = 1GB 1Hr")
    }

    else if (num == 2){
        println("Sh99 = 1GB 24Hr")
    }

    else if (num == 3){
        println("Sh1500 = 25GB 30Days")
    }

    else if (num == 4){
        println("Sh2000 = 35GB 30Days")
    }

     else if (num == 5){
        println("Sh2500 = 90GB 30Days(3GB/Day)")
    }

    else if (num == 6){
        println("TUNUKIWA")
    }

    else if (num == 7){
        println("Nyakua Bonus")
    }

    else if (num == 8){
        println("Unlock Baze Bonus")
    }

    else if (num == 9){
        println("Lipa na Data")
    }

    else{
        print("Invalid MMI code")
    }



}