package com.example.hw14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
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

        //#Task2
        val answers = listOf(
            "Да",
            "Нет",
            "Скорее всего да",
            "Скорее всего нет",
            "Возможно",
            "Имеются перспективы",
            "Вопрос задан неверно"
        )

        val scanner = Scanner(System.`in`)
        val question = scanner.nextLine()
        if (question == ""){
            println("Ask your question")
        }
        println(answers.random())

    }
}
