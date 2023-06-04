package com.example.assessmentno7;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Grade_Encode extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private EditText a1;
    private EditText q1;
    private EditText q2;
    private EditText q3;
    private EditText q4;
    private EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_encode);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        a1 = findViewById(R.id.a1);
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        e1 = findViewById(R.id.e1);
        Button b1 = findViewById(R.id.b1);
        Button b = findViewById(R.id.b);
        Button refff = findViewById(R.id.refff);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ls = n1.getText().toString().trim();
                String Fs = n2.getText().toString().trim();
                String As = a1.getText().toString().trim();
                String Q1s = q1.getText().toString().trim();
                String Q2s = q2.getText().toString().trim();
                String Q3s = q3.getText().toString().trim();
                String Q4s = q4.getText().toString().trim();
                String Es = e1.getText().toString().trim();

                if (TextUtils.isEmpty(Ls) || TextUtils.isEmpty(Fs)
                        || TextUtils.isEmpty(As) || TextUtils.isEmpty(Q1s)
                        || TextUtils.isEmpty(Q2s) || TextUtils.isEmpty(Q3s)
                        || TextUtils.isEmpty(Q4s) || TextUtils.isEmpty(Es)) {
                    Toast.makeText(Grade_Encode.this, "fill all the blank fields", Toast.LENGTH_SHORT).show();
                } else {
                    int attendance = Integer.parseInt(As);
                    int quiz1 = Integer.parseInt(Q1s);
                    int quiz2 = Integer.parseInt(Q2s);
                    int quiz3 = Integer.parseInt(Q3s);
                    int quiz4 = Integer.parseInt(Q4s);
                    int exam = Integer.parseInt(Es);

                    if (attendance < 1 || attendance > 100 || quiz1 < 1 || quiz1 > 100
                            || quiz2 < 1 || quiz2 > 100 || quiz3 < 1 || quiz3 > 100
                            || quiz4 < 1 || quiz4 > 100 || exam < 1 || exam > 100) {
                        Toast.makeText(Grade_Encode.this, "enter scores from 1 and 100", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent ii = new Intent(Grade_Encode.this, Grade_ViewWWW.class);
                        ii.putExtra("lastName", Ls);
                        ii.putExtra("firstName", Fs);
                        ii.putExtra("attendance", attendance);
                        ii.putExtra("quiz1", quiz1);
                        ii.putExtra("quiz2", quiz2);
                        ii.putExtra("quiz3", quiz3);
                        ii.putExtra("quiz4", quiz4);
                        ii.putExtra("exam", exam);
                        startActivity(ii);
                    }
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent init = new Intent(Grade_Encode.this, Menu.class);
            startActivity(init);
            }
        });

        refff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText("");
                n2.setText("");
                a1.setText("");
                q1.setText("");
                q2.setText("");
                q3.setText("");
                q4.setText("");
                e1.setText("");
            }
        });
    }
}
