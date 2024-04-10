package com.example.customviewactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {
    private Button backButton;
    private Spinner spinner;
    private EditText editSizeText;
    private EditText editGradeNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_activity);

        backButton = findViewById(R.id.backButton);
        spinner = findViewById(R.id.spinner);
        editSizeText = findViewById(R.id.editTextSize);
        editGradeNumber = findViewById(R.id.editGradeNumber);

        backButton.setOnClickListener(view ->
                finish());


    }
}
