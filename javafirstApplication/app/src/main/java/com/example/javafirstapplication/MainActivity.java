package com.example.javafirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = (Button) findViewById(R.id.mybtn);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello from barbod", Toast.LENGTH_SHORT).show();
            }
        });
    }

}