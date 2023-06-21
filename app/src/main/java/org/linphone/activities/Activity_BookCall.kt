package org.linphone.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import org.linphone.R
import org.linphone.utils.*

class Activity_BookCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_call)
        var nameList = ArrayList<String>()
        nameList.add("Иванченко К.И.")
        nameList.add("Скрипченко И.И.")
        nameList.add("Антоньев С.Е.")
        nameList.add("Балмаджа А.Г.")
        val listView = findViewById<ListView>(R.id.listView_BookCall)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Звоним: ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
    fun onClickGoAunth(view: View) {
        val intent = Intent(this, ActivityAunth::class.java)
        startActivity(intent)
    }
    fun onClickGoCalls(view: View) {
        val intent = Intent(this, ActivityCalls::class.java)
        startActivity(intent)
    }
    fun onClickGoConviviis(view: View) {
        val intent = Intent(this, Activity_conviviis2::class.java)
        startActivity(intent)
    }
    fun onClickGoEmail(view: View) {
        val intent = Intent(this, ActivityEmail::class.java)
        startActivity(intent)
    }
    fun onClickGoAddUser(view: View) {
        val intent = Intent(this, Activity_Add::class.java)
        startActivity(intent)
    }
    fun onClickGoLastCall(view: View) {
        val intent = Intent(this, Activity_LastCall::class.java)
        startActivity(intent)
    }
    fun onClickGoBookCall(view: View) {
        val intent = Intent(this, Activity_BookCall::class.java)
        startActivity(intent)
    }
    fun onClickGoNumber(view: View) {
        val intent = Intent(this, Activity_Number::class.java)
        startActivity(intent)
    }
}
