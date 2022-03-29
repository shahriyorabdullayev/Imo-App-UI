package com.example.imoappuim5_l2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappuim5_l2.adapter.ChatAdapter
import com.example.imoappuim5_l2.model.Chat

class MainActivity : AppCompatActivity() {

    private lateinit var rvMain:RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        context = this
        rvMain = findViewById(R.id.rv_main)
        rvMain.layoutManager = GridLayoutManager(context, 1)


        refreshAdapter(getAllChats())

    }

    private fun refreshAdapter(items:ArrayList<Chat>) {
        val adapter = ChatAdapter(context, items)
        rvMain.adapter = adapter
    }


    private fun getAllChats():ArrayList<Chat> {
        val chats = ArrayList<Chat>()
        for (i in 0..10){
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", 1))
            chats.add(Chat(R.drawable.im_sanjarbek, "Sanjarbek Shermetov", 2))
            chats.add(Chat(R.drawable.im_munis, "Munisbek Ibragimov", 5))
            chats.add(Chat(R.drawable.im_diyorbek, "Diyorbek Abdullayev", 2))
            chats.add(Chat(R.drawable.im_azizbek, "Azizbek Abdullayev", 4))

        }



        return chats
    }
}