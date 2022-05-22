package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name =intent.getStringExtra("name_extra")
        birthdayGreeting.text = "happy birthday \n $name"
    }
}