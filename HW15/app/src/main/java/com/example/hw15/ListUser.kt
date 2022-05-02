package com.example.hw15

import android.os.Build
import androidx.annotation.RequiresApi

class ListUser {

    private var userList: MutableList<User> = mutableListOf()

    fun addUser(name: String, secondName: String, age: Int) =
        userList.add(User(name, secondName, age))

    fun outUser(): String =
        userList.toString()

    fun sortUser() {
        userList.sortBy { it.name }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun deleteUser() {
        userList.removeIf { it.age < 18 }
    }
}