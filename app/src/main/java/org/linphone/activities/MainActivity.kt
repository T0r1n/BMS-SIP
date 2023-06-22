package org.linphone.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import org.linphone.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
