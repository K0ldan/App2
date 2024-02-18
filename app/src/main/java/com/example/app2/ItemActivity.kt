package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)


        val ItemList:RecyclerView = findViewById(R.id.Itemlist)
        val items = arrayListOf<Item>()

        items.add(Item(1,"holod","Холодильник","Холодильник samsung","Заебись",9999))
        items.add(Item(2,"sofa","Диван","Диван Льери Мини – компактная версия популярной модели Льери в скандинавском стиле.","Диван Льери Мини – компактная версия популярной модели Льери в скандинавском стиле. Узкие подлокотники, объемные подушки и изящные ножки необычной формы делают его ярким акцентом в любом интерьере. Благодаря своим размерам диван легко разместить в ограниченном пространстве, например, на кухне, в квартире-студии или на балконе.",999))

        ItemList.layoutManager = LinearLayoutManager(this)
        ItemList.adapter = ItemsAdapter(items,this)
    }
}