package com.example.assessmentno7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Info_View extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;
    private TextView txt7;
    private TextView txt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view);
        setTitle("STUDENT INFORMATION");

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String lastName = extras.getString("lastName");
            String firstName = extras.getString("firstName");
            String coUrse = extras.getString("course");
            String yeAr = extras.getString("year");
            String emAil = extras.getString("email");
            String conTact = extras.getString("contact");
            String birthYear = extras.getString("birthYear");

            // setting the textxx galing sa TextView
            txt1.setText("Last Name: " + lastName);
            txt2.setText("First Name: " + firstName);
            txt3.setText("Course: " + coUrse);
            txt4.setText("Year: " + yeAr);
            txt5.setText("Email Address: " + emAil);
            txt6.setText("Contact Number: " + conTact);
            txt7.setText("Birth Year: " + birthYear);

//            2023 - 2004 = 19
            int today = 2023;
            int age = today - Integer.parseInt(birthYear);
            txt8.setText("AGE: " + age);
        }
    }

    public void goingBack(View view){
        Intent iii = new Intent(Info_View.this, Menu.class);
        startActivity(iii);
    }
}

