package com.example.hw14

class ListUser {

    private var userList: MutableList<User> = mutableListOf()

    fun addUser(name: String, secondName: String, age: Int) =
        userList.add(User(name, secondName, age))

    fun outUser(): String =
        userList.toString()
}
