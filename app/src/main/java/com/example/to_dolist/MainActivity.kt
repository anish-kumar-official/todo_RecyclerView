package com.example.to_dolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.todo_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todolist = mutableListOf(
            dataTodo("Anish","19bcs2588",21),
            dataTodo("Aayan","19bcs2592",20),
            dataTodo("Praveen","19bcs2616",20),
            dataTodo("Halwai","19bcs2645",19),
            dataTodo("Hemant","19bcs2500",21)
        )

        val adapter = TodoAdapter(todolist)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener {
            val name = etName.text.toString()
            val rollno = etRollno.text.toString()
            val age = etAge.text.toString().toInt()
            val btnTodo = dataTodo(name,rollno,age)
            todolist.add(btnTodo)
            adapter.notifyItemInserted(todolist.size-1)

        }
    }
}