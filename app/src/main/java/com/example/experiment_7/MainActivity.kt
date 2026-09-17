package com.example.experiment_7

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val courseListView = findViewById<ListView>(
            R.id.courseListView
        )

        val courses = listOf(
            Course(
                "Data Structures",
                "Learn arrays, stacks, queues and trees",
                android.R.drawable.ic_menu_agenda
            ),

            Course(
                "Java Programming",
                "Learn object-oriented programming concepts",
                android.R.drawable.ic_menu_edit
            ),

            Course(
                "Computer Networks",
                "Study networking and communication",
                android.R.drawable.ic_menu_share
            ),

            Course(
                "Machine Learning",
                "Introduction to machine learning algorithms",
                android.R.drawable.ic_menu_search
            ),

            Course(
                "Database Management",
                "Learn SQL and database concepts",
                android.R.drawable.ic_menu_save
            )
        )

        val adapter = CourseAdapter(this, courses)

        courseListView.adapter = adapter

        courseListView.setOnItemClickListener { _, _, position, _ ->

            val selectedCourse = courses[position]

            Toast.makeText(
                this,
                "Selected: ${selectedCourse.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}