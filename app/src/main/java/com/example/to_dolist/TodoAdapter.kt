package com.example.to_dolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_item.view.*

class TodoAdapter(
    var todos : List<dataTodo>
    ) :RecyclerView.Adapter<todoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_item,parent,false)
        return todoViewHolder(view)
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {
       holder.itemView.apply {
         tvName.text = todos[position].name
           etAge.text = todos[position].age.toString()
           tvRollno.text = todos[position].rollno
       }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}

class todoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)