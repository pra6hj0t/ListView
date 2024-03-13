package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_view)

        val taskList = arrayListOf<String>()

        taskList.add("Set Alarm of 2:30 am")
        taskList.add("Turn Off The Internet")
        taskList.add("Wake up at ist ring of alarm")
        taskList.add("Take a bath")
        taskList.add("Read the nitnem banees")
        taskList.add("Wake up all the boys")


        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on : " + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }
}