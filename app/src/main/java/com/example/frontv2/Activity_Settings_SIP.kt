package com.example.frontv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Activity_Settings_SIP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_sip)
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
        val intent = Intent(this, Activity_conviviis2::class.java)
        startActivity(intent)
    }
    fun onClickGoEmail(view : View){
        val intent = Intent(this, ActivityEmail::class.java)
        startActivity(intent)
    }
    fun onClickGoMain(view : View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}