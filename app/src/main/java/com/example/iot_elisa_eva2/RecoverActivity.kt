package com.example.iot_elisa_eva2

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.TextView

class RecoverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover)

        val tvVolverLogin = findViewById<TextView>(R.id.tvVolverLogin)
        tvVolverLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }


        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val correo = etCorreo.text.toString().trim()

            if (correo.isEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Por favor ingrese su correo electrónico.")
                    .setPositiveButton("OK", null)
                    .show()
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Enlace enviado")
                    .setMessage("Se ha enviado un enlace de recuperación a $correo.")
                    .setPositiveButton("Aceptar", null)
                    .show()
            }
        }
    }
}
