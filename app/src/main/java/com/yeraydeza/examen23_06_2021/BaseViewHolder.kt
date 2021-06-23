package com.yeraydeza.examen23_06_2021

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView){
    abstract fun bind(item: T,position:Int)
}