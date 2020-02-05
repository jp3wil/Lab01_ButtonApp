package com.wiluszjp.lab01_buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button colorButton;
    View display;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorButton = findViewById(R.id.button1);
        display = findViewById(R.id.displayContent);
        text = findViewById(R.id.descriptor);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randCol = (int)(0xffffff * Math.random()) + 1;
                String color = (String.format("#%06x", randCol)).toUpperCase();
                display.setBackgroundColor(Color.parseColor((color)));
                text.setText(color);
            }
        });
    }
}