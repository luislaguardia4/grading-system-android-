package com.example.assessmentno7;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Info_Encode extends AppCompatActivity {
    private EditText Lname;
    private EditText Fname;
    private EditText course;
    private EditText year;
    private EditText email;
    private EditText contact;
    private EditText birthyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_encode);
        setTitle("USER INFORMATION");

        Lname = findViewById(R.id.Lname);
        Fname = findViewById(R.id.Fname);
        course = findViewById(R.id.course);
        year = findViewById(R.id.year);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        birthyear = findViewById(R.id.birthyear);
        Button submitButton = findViewById(R.id.submitButton);
        Button backButton = findViewById(R.id.backButton);
        Button refButt = findViewById(R.id.refButt);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lastName = Lname.getText().toString().trim();
                String firstName = Fname.getText().toString().trim();
                String coUrse = course.getText().toString().trim();
                String yeAr = year.getText().toString().trim();
                String emAil = email.getText().toString().trim();
                String conTact = contact.getText().toString().trim();
                String birthYear = birthyear.getText().toString().trim();

                if (TextUtils.isEmpty(lastName) || TextUtils.isEmpty(firstName) || TextUtils.isEmpty(coUrse)
                        || TextUtils.isEmpty(yeAr) || TextUtils.isEmpty(emAil) || TextUtils.isEmpty(conTact)
                        || TextUtils.isEmpty(birthYear)) {
                    Toast.makeText(Info_Encode.this, "fill the black fields", Toast.LENGTH_SHORT).show();
                } else if (!TextUtils.isDigitsOnly(yeAr) || !TextUtils.isDigitsOnly(conTact) || !TextUtils.isDigitsOnly(birthYear)) {
                    Toast.makeText(Info_Encode.this, "year, contact, and birthyear should only input numbers", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Info_Encode.this, Info_View.class);
                    intent.putExtra("lastName", lastName);
                    intent.putExtra("firstName", firstName);
                    intent.putExtra("course", coUrse);
                    intent.putExtra("year", yeAr);
                    intent.putExtra("email", emAil);
                    intent.putExtra("contact", conTact);
                    intent.putExtra("birthYear", birthYear);
                    startActivity(intent);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Info_Encode.this, Menu.class);
                startActivity(i);
            }
        });

        refButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lname.setText("");
                Fname.setText("");
                course.setText("");
                year.setText("");
                email.setText("");
                contact.setText("");
                birthyear.setText("");
            }
        });


    }
}
