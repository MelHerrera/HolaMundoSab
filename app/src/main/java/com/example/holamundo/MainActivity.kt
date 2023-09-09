package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val usuarioLogeado = "Hola Juan Valladares"


        val textoHola = findViewById<TextView>(R.id.txtHola)

        textoHola.text = usuarioLogeado
         */

        val plainTextUserName = findViewById<EditText>(R.id.editUserName)
        val btnSaludar = findViewById<Button>(R.id.btnSaludo)


        btnSaludar.setOnClickListener {

            val myToas =  Toast.makeText(this, "Hols bienvenido ${plainTextUserName.text}", Toast.LENGTH_LONG)


                myToas.show()
        }

    }
}