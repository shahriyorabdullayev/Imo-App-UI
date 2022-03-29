package com.example.imoappuim5_l2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappuim5_l2.R
import com.example.imoappuim5_l2.model.Chat

class ChatAdapter(var context:Context, var items: ArrayList<Chat>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val chat = items[position]

        if (holder is MessageViewHolder) {
            holder.apply {

                ivProfile.setImageResource(chat.profile)
                tvFullname.text = chat.fullname
                tvCount.text = chat.count.toString()

                if (chat.count > 0) {
                    tvCount.visibility = View.VISIBLE
                }else {
                    tvCount.visibility = View.GONE
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var ivProfile = view.findViewById<ImageView>(R.id.iv_profile)
        var tvFullname = view.findViewById<TextView>(R.id.tv_fullname)
        var tvCount = view.findViewById<TextView>(R.id.tv_count)
    }



}