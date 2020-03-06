package com.cis.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val student_name = resources.getStringArray(R.array.students60)
        //val student_id = resources.getStringArray(R.array.student60_id)
        //data DB -> Adapter -> view, listView, table
        val mylistview = findViewById<ListView>(R.id.mylistview)


        //val StudentID = findViewById<TextView>(R.id.StudentID)
        val StudentName = findViewById<TextView>(R.id.StudentName)

        val arrayAdapter: ArrayAdapter<*>
        //val arrayAdapter_name: ArrayAdapter<*>

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,student_name)
        mylistview.adapter = arrayAdapter as ListAdapter
        //arrayAdapter_name = ArrayAdapter(this,android.R.layout.simple_list_item_2,student_name)
        //mylistview.adapter = arrayAdapter_name as ListAdapter


        mylistview.setOnItemClickListener{parent, view, position, id ->
            //get text from listview by position
            Log.i("listview item",position.toString())
            //display toast message
            val itemText = parent.getItemAtPosition(position) as String
            Toast.makeText(this,itemText,Toast.LENGTH_SHORT).show()

            val i = Intent(this,ProfileActivity::class.java)
            i.putExtra("selectedname",itemText)
            startActivity(i)
        }
    }
}
