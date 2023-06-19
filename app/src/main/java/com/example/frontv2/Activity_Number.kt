package com.example.frontv2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity_Number : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        val btn0=findViewById<Button>(R.id.btn_0)
        val btn1=findViewById<Button>(R.id.btn_1)
        val btn2=findViewById<Button>(R.id.btn_2)
        val btn3=findViewById<Button>(R.id.btn_3)
        val btn4=findViewById<Button>(R.id.btn_4)
        val btn5=findViewById<Button>(R.id.btn_5)
        val btn6=findViewById<Button>(R.id.btn_6)
        val btn7=findViewById<Button>(R.id.btn_7)
        val btn8=findViewById<Button>(R.id.btn_8)
        val btn9=findViewById<Button>(R.id.btn_9)
        val editTextNumber = findViewById<TextView>(R.id.editTextNumber)

        btn0.setOnClickListener{SetText("0")}
        btn1.setOnClickListener{SetText("1")}
        btn2.setOnClickListener{SetText("2")}
        btn3.setOnClickListener{SetText("3")}
        btn4.setOnClickListener{SetText("4")}
        btn5.setOnClickListener{SetText("5")}
        btn6.setOnClickListener{SetText("6")}
        btn7.setOnClickListener{SetText("7")}
        btn8.setOnClickListener{SetText("8")}
        btn9.setOnClickListener{SetText("9")}

        val del = findViewById<ImageView>(R.id.Delete)

        del.setOnClickListener{
            val str = editTextNumber.text.toString()
            if(str.isNotEmpty())
                editTextNumber.text = str.substring(0,str.length-1)
        }
    }
    fun SetText(str: String){
       val editTextNumber = findViewById<TextView>(R.id.editTextNumber)
        editTextNumber.append(str)
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
    fun onClickGoLastCall(view : View) {
        val intent = Intent(this, Activity_LastCall::class.java)
        startActivity(intent)
    }
    fun onClickGoBookCall(view : View) {
        val intent = Intent(this, Activity_BookCall::class.java)
        startActivity(intent)
    }
    fun onClickGoNumber(view : View) {
        val intent = Intent(this, Activity_Number::class.java)
        startActivity(intent)
    }
}