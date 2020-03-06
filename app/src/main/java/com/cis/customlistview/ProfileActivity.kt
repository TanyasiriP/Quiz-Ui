package com.cis.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val data = intent.getStringExtra("selectedname")
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()

        val student_name = resources.getStringArray(R.array.students60)
        val student_id = resources.getStringArray(R.array.student60_id)

        val StudentID = findViewById<TextView>(R.id.StudentID)
        val StudentName = findViewById<TextView>(R.id.StudentName)





        SaveButton.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)


        }
    }
}
