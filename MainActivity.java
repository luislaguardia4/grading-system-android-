package com.example.assessmentno7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    Button btnREG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.user);
        password = findViewById(R.id.pass);
        loginButton = findViewById(R.id.reg);
        btnREG = findViewById(R.id.main);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "fill out the fields", Toast.LENGTH_SHORT).show();

                } else if (username.getText().toString().equals("admin") && password.getText().toString().equals("password")) {
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "incorrect username or password", Toast.LENGTH_SHORT).show();
            }

            }
        });

        btnREG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, registerWindow.class);
                startActivity(i);
            }
        });

    }
}
