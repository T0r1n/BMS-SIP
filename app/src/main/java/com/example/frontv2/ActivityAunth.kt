package com.example.frontv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAunth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aunth)
    }
    fun onClickGoAunth(view : View){
        val intent = Intent(this, ActivityAunth::class.java)
        startActivity(intent)
    }
    fun onClickGoCalls(view : View){
        val intent = Intent(this, ActivityCalls::class.java)
        startActivity(intent)
    }
    fun onClickGoConviviis(view : View){
        val intent = Intent(this, ActivityConviviis::class.java)
        startActivity(intent)
    }
    fun onClickGoEmail(view : View){
        val intent = Intent(this, ActivityEmail::class.java)
        startActivity(intent)
    }
}