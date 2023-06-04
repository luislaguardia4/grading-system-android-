package com.example.assessmentno7;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Grade_ViewWWW extends AppCompatActivity {

    private TextView txtLastName;
    private TextView txtFirstName;
    private TextView txtAttendance;
    private TextView txtquiz1;
    private TextView txtquiz2;
    private TextView txtquiz3;
    private TextView txtquiz4;
    private TextView txtexam;
    private TextView txtAverage;
    private TextView txtStatus;
    private TextView txtRemarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_view_www);

        txtLastName = findViewById(R.id.txtLastName);
        txtFirstName = findViewById(R.id.txtFirstName);
        txtAttendance = findViewById(R.id.txtAttendance);
        txtquiz1 = findViewById(R.id.txtquiz1);
        txtquiz2 = findViewById(R.id.txtquiz2);
        txtquiz3 = findViewById(R.id.txtquiz3);
        txtquiz4 = findViewById(R.id.txtquiz4);
        txtexam = findViewById(R.id.txtexam);
        txtexam = findViewById(R.id.txtexam);
        txtAverage = findViewById(R.id.txtAverage);
        txtStatus = findViewById(R.id.txtRemarks);
        txtRemarks = findViewById(R.id.txtStatus);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Ls = extras.getString("lastName");
            String Fs = extras.getString("firstName");
            int attendance = extras.getInt("attendance");
            int quiz1 = extras.getInt("quiz1");
            int quiz2 = extras.getInt("quiz2");
            int quiz3 = extras.getInt("quiz3");
            int quiz4 = extras.getInt("quiz4");
            int exam = extras.getInt("exam");

            txtLastName.setText("Last Name: " + Ls);
            txtFirstName.setText("First Name: " + Fs);
            txtAttendance.setText("Attendance: " + attendance);
            txtquiz1.setText("Quiz1: " + quiz1);
            txtquiz2.setText("Quiz2: " + quiz2);
            txtquiz3.setText("Quiz3: " + quiz3);
            txtquiz4.setText("Quiz4: " + quiz4);
            txtexam.setText("Exam: " + exam);

            double aveeg = (0.2 * attendance) + (0.3 * (quiz1 + quiz2 + quiz3 + quiz4) / 4) + (0.5 * exam);
            txtAverage.setText("Average: " + aveeg);

            if (aveeg > 60) {
                txtStatus.setText("Status: PASSED");
            } else {
                txtStatus.setText("Status: FAILED");
            }

            String reflection;
            if (aveeg >= 96) {
                reflection = "4.00";
            } else if (aveeg >= 90) {
                reflection = "3.50";
            } else if (aveeg >= 84) {
                reflection = "3.00";
            } else if (aveeg >= 78) {
                reflection = "2.50";
            } else if (aveeg >= 72) {
                reflection = "2.00";
            } else if (aveeg >= 66) {
                reflection = "1.50";
            } else if (aveeg >= 60) {
                reflection = "1.00";
            } else {
                reflection = "INC";
            }
            txtRemarks.setText("Remarks: " + reflection);
        }
    }

    public void gradeMenu(View v) {
        Intent backk = new Intent(Grade_ViewWWW.this, Menu.class);
        startActivity(backk);
    }
}
