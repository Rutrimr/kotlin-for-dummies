package com.example.project1

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }

    // Kotlin Hello World Program
    fun main(args: Array<String>) {
        println("Hello, World!")
    }

    // Список переменных использующихся в описании стула
    //var wheel: Short = -1 //предназначен для хранения целых чисел. Диапазон чисел от -32 768 до 32 767;
    // var base: UShort = 0 //предназначен для хранения целых положительных чисел. Диапазон чисел от 0 до 65 535;
    // var armrest: Int = -20 //предназначен для хранения целых чисел. Диапазон чисел от -2 147 483 648 до 2 147 483 647;
    // var seat: UInt = 100201 //предназначен для хранения целых положительных чисел. Диапазон чисел от 0 до 4 294 967 295;
    // var back: Long = -8000 // предназначен для хранения целых чисел. Диапазон чисел от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807;
    // var cylinder: ULong = 154437 //предназначен для хранения целых положительных чисел. Диапазон чисел от 0 до 18 446 744 073 709 551 615.
    // var upholstery: Float = -3.14 //для создания чисел с плавающей точкой. Диапазон чисел от от -3.4*1038 до 3.4*1038;
    // var soft_lining: Double = 1.8 //для создания чисел с плавающей точкой. Диапазон чисел от от ±4.9*10-324 до ±1.8*10308.
    // var handle: Boolean = (true) //логический тип данных. Предназначен для записи истинного (true) или ложного (false) значения;
    // var headrest: Char = `R` //тип данных для работы с символами. Позволяет поместить в одинарных кавычках какой-либо символ;
    // var back_support: String = "Уж небо осенью дышало..." //тип данных для текста. В двойных кавычках можно сохранить одно или множество слов.
    // val man: String = "Чувак" //создание константы. Такую переменную нельзя будет изменить и установить для неё новое значение.

    //Вариант 2, стул, основные параметры
    // var height: Short = 1700 //Высота в милиметрах
    // var width: Short = 680 //ширана в миллиметрах
    // var weight: Short = 120 //максимальный выдерживаемый вес в килограммах
    // var wheel: Short = 30 //диаметр колёс в миллиметрах
    // var color: String "black" //цвет стула
    // var armrest: Short = 2 //количество подлокотников
    // var back_support: Boolean = (true) //поддержка спины - есть
    // val name: String "Чёрный трон 9" //неизменное название, константа
}

