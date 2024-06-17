package com.example.myapplication12
fun main() {
    while (true) {
        println("메뉴를 골라주세요")
        println("shakeshack menu")
        println("[1]burger,[2]frozen custard,[3]drinks,[4]beer,[5]종료")
        val select = readLine()!!.toInt()
        if(select==5) {
            break
        }
        if (select == 1) {
            println("burger menu")
            println("1.shack burger, 2.smoke shack, 3.shroom burger, 4 cheeseburger, 0.뒤로가기")

            val select = readLine()!!.toInt()
            if (select == 1) {
                println("shack burger/ w6.9")
            }
            if (select == 2) {
                println("smoke shack/ w8.9")
            }
            if (select == 3) {
                println("shroom burger/w9.4")
            }
            if (select == 4) {
                println("cheese burger/w6.9")
            }
            if (select == 0) {
                println("뒤로가기")
            }
        }

        if (select == 2) {
            println("frozen custard menu")
            println("[1] custard donut [2] churros [0]뒤로가기")
            val select = readLine()!!.toInt()

            if (select == 1) {
                println("custard donut")
            }
            if (select == 2) {
                println("churros")
            }
            if (select == 0) {
                println("뒤로가기")
            }

        }
        if (select == 3) {
            println("drink menu")
            println("[1]coffee, [2]orange juice [0]뒤로가기")
            val select = readLine()!!.toInt()

            if (select == 1) {
                println("coffee")
            }
            if (select == 2) {
                println("orange juice")
            }
            if (select == 0) {
                println("뒤로가기")
            }
        }
        if (select == 4) {
            println("beer menu")
            println("[1]butter beer, [2]black beer [0]뒤로가기")
            val select = readLine()!!.toInt()

            if (select == 1) {
                println("butter beer")
            }
            if (select == 2) {
                println("black beer")
            }
            if (select == 0) {
                println("뒤로가기")
            }
        }
    }
}