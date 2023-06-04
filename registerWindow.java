package com.example.assessmentno7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registerWindow extends AppCompatActivity {

    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_window);
    }

    public void back(View v){
        Intent i = new Intent(registerWindow.this, MainActivity.class);
        startActivity(i);
    }

    public void registerr(View v) {
        try {
            Toast.makeText(registerWindow.this, "registered successfully!", Toast.LENGTH_SHORT).show();
            Intent ii = new Intent(registerWindow.this, MainActivity.class);
            startActivity(ii);

        } catch (Exception e) {
            Toast.makeText(registerWindow.this, "fill out the fields", Toast.LENGTH_SHORT).show();
        }    }
}
