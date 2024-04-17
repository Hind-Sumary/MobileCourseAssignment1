package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LessonDetailsActivity extends AppCompatActivity {

    private LinearLayout additionSection, multiplicationSection, countingSection,
            subtractionSection, divisionSection, geometrySection, fractionsSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_details);

        Intent intent = getIntent();
        if (intent != null) {
            String lessonTitle = intent.getStringExtra("lessonTitle");
            String lessonContent = intent.getStringExtra("lessonContent");
            additionSection = findViewById(R.id.addition_section);
            multiplicationSection = findViewById(R.id.multiplicationSection);
            countingSection = findViewById(R.id.countingSection);
            subtractionSection = findViewById(R.id.subtractionSection);
            divisionSection = findViewById(R.id.divisionSection);
            geometrySection = findViewById(R.id.geometrySection);
            fractionsSection = findViewById(R.id.fractionsSection);

            switch (lessonTitle) {
                case "Introduction to Addition":
                    showAdditionSection();
                    setUpAdditionSection();
                    break;
                case "Multiplication Basics":
                    showMultiplicationSection();
                    setUpMultiplicationSection();
                    break;
                case "Counting":
                    showCountingSection();
                    setUpCountingSection();
                    break;
                case "Introduction to Subtraction":
                    showSubtractionSection();
                    setUpSubtractionSection();
                    break;
                case "Understanding Division":
                    showDivisionSection();
                    setUpDivisionSection();
                    break;
                case "Basic Geometry":
                    showGeometrySection();
                    setUpGeometrySection();
                    break;
                case "Fundamentals of Fractions":
                    showFractionsSection();
                    setUpFractionsSection();
                    break;
            }
        }
    }

    private void showAdditionSection() {
        additionSection.setVisibility(View.VISIBLE);
        multiplicationSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showMultiplicationSection() {
        multiplicationSection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showCountingSection() {
        countingSection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        multiplicationSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showSubtractionSection() {
        subtractionSection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        multiplicationSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showDivisionSection() {
        divisionSection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        multiplicationSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showGeometrySection() {
        geometrySection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        multiplicationSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        fractionsSection.setVisibility(View.GONE);
    }

    private void showFractionsSection() {
        fractionsSection.setVisibility(View.VISIBLE);
        additionSection.setVisibility(View.GONE);
        multiplicationSection.setVisibility(View.GONE);
        countingSection.setVisibility(View.GONE);
        subtractionSection.setVisibility(View.GONE);
        divisionSection.setVisibility(View.GONE);
        geometrySection.setVisibility(View.GONE);
    }


    private void setUpAdditionSection() {
        RadioGroup radioGroup = findViewById(R.id.additionRadioGroup);
        Button answerButton = findViewById(R.id.additionAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("7")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpMultiplicationSection() {
        RadioGroup radioGroup = findViewById(R.id.multiplicationRadioGroup);
        Button answerButton = findViewById(R.id.multiplicationAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("8")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpCountingSection() {
        RadioGroup radioGroup = findViewById(R.id.countingRadioGroup);
        Button answerButton = findViewById(R.id.countingAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("10")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpSubtractionSection() {
        RadioGroup radioGroup = findViewById(R.id.subtractionRadioGroup);
        Button answerButton = findViewById(R.id.subtractionAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("5")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpDivisionSection() {
        RadioGroup radioGroup = findViewById(R.id.divisionRadioGroup);
        Button answerButton = findViewById(R.id.divisionAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("5")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpGeometrySection() {
        RadioGroup radioGroup = findViewById(R.id.geometryRadioGroup);
        Button answerButton = findViewById(R.id.geometryAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("Triangle △")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }

    private void setUpFractionsSection() {
        RadioGroup radioGroup = findViewById(R.id.fractionsRadioGroup);
        Button answerButton = findViewById(R.id.fractionsAnswerButton);

        answerButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioButton = findViewById(selectedId);
                String answer = radioButton.getText().toString();
                if (answer.equals("1/2")) {
                    showToast("Correct answer!");
                } else {
                    showToast("Incorrect answer. Try again!");
                }
            } else {
                showToast("Please select an option.");
            }
        });
    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
