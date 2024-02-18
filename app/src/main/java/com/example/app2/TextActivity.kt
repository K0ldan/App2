package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val title : TextView = findViewById(R.id.item_list_title_one)
        val text : TextView = findViewById(R.id.item_list_text)
        val image : ImageView = findViewById(R.id.Itemlist_image3)
        val button : Button = findViewById(R.id.button_buy)
        val imageid : Int = intent.getIntExtra("itemImageid",0)



        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")
        image.setImageResource(imageid)
        button.text = "Цена "+intent.getStringExtra("itemPrice")+"$"

    }
}