package com.yeraydeza.examen23_06_2021

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main2.view.*
import java.lang.IllegalArgumentException

class RecyclerAdapter (private val context: Context,val listaAmigos: List<Amigos>):RecyclerView.Adapter<BaseViewHolder<*>>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return AmigosViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is AmigosViewHolder -> holder.bind(listaAmigos[position],position)
            else -> throw IllegalArgumentException("")
        }
    }

    override fun getItemCount(): Int = listaAmigos.size

    inner class AmigosViewHolder(itemView: View):BaseViewHolder<Amigos>(itemView) {
        override fun bind(item: Amigos, position: Int) {
                itemView.name.text = item.name
        }
    }

}