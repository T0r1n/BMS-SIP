package org.linphone.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import org.linphone.R

class ActivityCalls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calls)
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