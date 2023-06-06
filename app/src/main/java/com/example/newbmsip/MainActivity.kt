package com.example.newbmsip

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создаем экземпляр PJSIPManager
        pjsipManager = PJSIPManager()

        // Инициализация PJSIP
        pjsipManager.initialize()

        // Находим кнопку в разметке
        val callButton: Button = findViewById(R.id.button)

        // Назначаем обработчик события нажатия на кнопку
        callButton.setOnClickListener {
            // Вызываем метод makeCall из PJSIPManager
            pjsipManager.makeCall("destination_username")
        }
    }
}