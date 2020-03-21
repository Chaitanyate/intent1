package com.example.intent1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)
    }
    fun check2(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}
