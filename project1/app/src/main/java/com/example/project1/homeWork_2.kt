package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class homeWork_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_work_2)

    }
    fun main() {
    print("Введите имя: ")
    val name = readLine()
    print("Введите email: ")
    val email = readLine()
    print("Введите адрес: ")
    val address = readLine()

    println("Ваше имя: $name")
    println("Ваш email: $email")
    println("Ваш адрес: $address")
  }
}