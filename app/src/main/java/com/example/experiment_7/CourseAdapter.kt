package com.example.experiment_7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

data class Course(
    val name: String,
    val description: String,
    val image: Int
)

class CourseAdapter(
    context: Context,
    private val courses: List<Course>
) : ArrayAdapter<Course>(context, 0, courses) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView
            ?: LayoutInflater.from(context).inflate(
                R.layout.list_item_course,
                parent,
                false
            )

        val imageView = view.findViewById<ImageView>(
            R.id.imgCourse
        )

        val nameText = view.findViewById<TextView>(
            R.id.txtCourseName
        )

        val descriptionText = view.findViewById<TextView>(
            R.id.txtCourseDescription
        )

        val course = courses[position]

        imageView.setImageResource(course.image)
        nameText.text = course.name
        descriptionText.text = course.description

        return view
    }
}