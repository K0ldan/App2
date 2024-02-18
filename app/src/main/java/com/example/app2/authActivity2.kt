package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class authActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth2)

        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPassword: EditText = findViewById(R.id.user_pass_auth)
        val button: Button = findViewById(R.id.button_auth)
        val linktoReg: TextView = findViewById(R.id.link_reg)

        linktoReg.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPassword.text.toString().trim()


            if (login == "" || pass == "")
                Toast.makeText(this, "Все поля должны быть заполнены", Toast.LENGTH_SHORT).show()
            else {
                val db = DbHelper(this, null)
                val isAuth = db.getUser(login, pass)

                if (isAuth)
                {
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_SHORT).show()
                    userLogin.text.clear()
                    userPassword.text.clear()

                    val intent = Intent(this, ItemActivity::class.java)
                    startActivity(intent)

                }
                else
                {
                    Toast.makeText(this, "Пользователь $login НЕ авторизован", Toast.LENGTH_SHORT).show()
                }


            }
        }
    }
}