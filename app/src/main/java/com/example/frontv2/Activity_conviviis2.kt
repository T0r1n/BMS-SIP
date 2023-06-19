package com.example.frontv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Activity_conviviis2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conviviis2)
        var nameList = ArrayList<String>()
        nameList.add("Сеть 1")
        nameList.add("Сеть 2")
        nameList.add("Сеть 3")
        val listView = findViewById<ListView>(R.id.listView_3)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Подключаемся к: ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
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
        val intent = Intent(this, Activity_conviviis2::class.java)
        startActivity(intent)
    }
    fun onClickGoEmail(view : View){
        val intent = Intent(this, ActivityEmail::class.java)
        startActivity(intent)
    }
}