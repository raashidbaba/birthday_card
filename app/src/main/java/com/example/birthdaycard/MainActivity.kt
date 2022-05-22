package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*val createBirthdayButton = findViewById<Button>(R.id.createBirthdayButton)
        createBirthdayButton.setOnClickListener { It:View!
        }*/
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
      //  Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
        println("hello this is my commit")
    }
}