package com.example.frontv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class ActivityEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        var nameList = ArrayList<String>()
        nameList.add("Иванченко К.И.")
        nameList.add("Скрипченко И.И.")
        nameList.add("Антоньев С.Е.")
        nameList.add("Балмаджа А.Г.")
        val listView = findViewById<ListView>(R.id.listView_2)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            //val intent = Intent(this,)

        }
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