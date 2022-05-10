package com.example.hw15

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //#Task1
        val listUser = ListUser()
        listUser.addUser("Anna", "Petrovna", 18)
        listUser.addUser("Ivan", "Nikolaevich", 32)
        listUser.addUser("Svetlana", "Valentinovna", 27)
        listUser.addUser("Irina", "Nikolaevna", 34)
        listUser.outUser()
        listUser.sortUser()
        listUser.deleteUser()


        //#Task2
        fun generateNumber (){
            val randomNumber = (5..155).random()
            println(randomNumber)
            val interval = 25..100

            if (interval.contains(randomNumber)){
                println("Contains")
            }else{
                println("Does not contains")
            }
        }


        //#Task3
        fun sumOfAllNumbers (){
            var a : Int
            var Summ = 0
            val scanner = Scanner(System.`in`)
            a = scanner.nextInt()
            while(a != 0){
                Summ += (a % 10);
                a /= 10;
            }
            System.out.println("Summ of numbers $Summ")
        }

        //#Task4
        fun summOfNumbers (){
            val  number = 100
            var summ = 0
            for (i in 1..number){
                summ +=i
            }
            println(summ)
        }
    }
}