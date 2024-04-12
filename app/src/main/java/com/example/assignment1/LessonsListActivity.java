package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LessonsListActivity extends AppCompatActivity {

    private String[] courseNames = {
            "Introduction to Addition",
            "Multiplication Basics",
            "Counting",
            "Introduction to Subtraction",
            "Understanding Division",
            "Basic Geometry",
            "Fundamentals of Fractions"
    };

    private String[] courseDescriptions = {
            "Learn the basics of addition and how to add numbers.",
            "Understand multiplication and its basic principles.",
            "Explore counting, number sequences, and patterns.",
            "Introduction to subtraction and how to subtract numbers.",
            "Learn about division and dividing numbers.",
            "Introduction to basic geometric shapes and concepts.",
            "Understand fractions and their fundamental operations."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_list);

        ListView lessonsListView = findViewById(R.id.lessonsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courseNames);
        lessonsListView.setAdapter(adapter);

        lessonsListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedCourse = courseNames[position];
            String courseDescription = courseDescriptions[position];

            // You can pass the course description to the LessonDetailsActivity if needed
            Intent intent = new Intent(LessonsListActivity.this, LessonDetailsActivity.class);
            intent.putExtra("lessonTitle", selectedCourse);
            intent.putExtra("lessonContent", courseDescription);
            startActivity(intent);
        });
    }
}
