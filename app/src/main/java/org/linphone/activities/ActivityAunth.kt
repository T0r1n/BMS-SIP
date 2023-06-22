package org.linphone.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import org.linphone.R

class ActivityAunth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aunth)
        val btnClick = findViewById<Button>(R.id.entrance)
        btnClick.setOnClickListener {
            val editTextLogin = findViewById<EditText>(R.id.login)
            val editTextPassword = findViewById<EditText>(R.id.password)
            val string1 = editTextLogin.text.toString()
            val string2 = editTextPassword.text.toString()
            if (string1 == "admin" && string2 == "admin") {
                val intent = Intent(this, Activity_Settings_SIP::class.java)
                startActivity(intent)
            }
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
}
