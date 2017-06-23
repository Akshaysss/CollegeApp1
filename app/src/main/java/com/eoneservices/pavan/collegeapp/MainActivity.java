package com.eoneservices.pavan.collegeapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.eoneservices.pavan.collegeapp.Login_Activity.LoginPg;

public class MainActivity extends AppCompatActivity {
    Context context;

    CardView admin, hod, teacher, student;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin = (CardView) findViewById(R.id.college_admin);
        hod = (CardView) findViewById(R.id.hod);
        teacher = (CardView) findViewById(R.id.teacher);
        student = (CardView) findViewById(R.id.student);


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginPg.class);
                intent.putExtra(Utils.SELECTED_USER, Utils.ADMIN);
                startActivity(intent);

            }
        });

        hod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginPg.class);
                intent.putExtra(Utils.SELECTED_USER, Utils.HOD);
                startActivity(intent);
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginPg.class);
                intent.putExtra(Utils.SELECTED_USER, Utils.TEACHER);
                startActivity(intent);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginPg.class);
                intent.putExtra(Utils.SELECTED_USER, Utils.STUDENT);
                startActivity(intent);
            }
        });
    }


}
