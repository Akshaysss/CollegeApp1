package com.eoneservices.pavan.collegeapp.Login_Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.eoneservices.pavan.collegeapp.Activities.AdminDrawer;
import com.eoneservices.pavan.collegeapp.Activities.HodDrawer;
import com.eoneservices.pavan.collegeapp.Activities.StudentDrawer;
import com.eoneservices.pavan.collegeapp.Activities.TeacherDrawer;
import com.eoneservices.pavan.collegeapp.R;
import com.eoneservices.pavan.collegeapp.Utils;

public class LoginPg extends AppCompatActivity {
    Button login, register;
    EditText username, password;
    String userID = "";
    String pwd = "";
    ImageView iw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pg);

        final int s = getIntent().getIntExtra(Utils.SELECTED_USER, 0);


        login = (Button) findViewById(R.id.al_login);
        register = (Button) findViewById(R.id.al_register);
        username = (EditText) findViewById(R.id.al_userID);
        password = (EditText) findViewById(R.id.al_password);
        iw = (ImageView) findViewById(R.id.al_image);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userID = username.getText().toString();
                pwd = password.getText().toString();
                login(s);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginPg.this, RegisterPg.class);
                i.putExtra(Utils.SELECTED_USER, s);
                startActivity(i);
            }
        });

        changeImageandtitle(s);

    }

    public void login(int selectedUser) {

        switch (selectedUser) {
            case Utils.ADMIN:

                if (userID.equals("admin") && pwd.equals("admin")) {
                    Intent admin = new Intent(LoginPg.this, AdminDrawer.class);
                    startActivity(admin);
                    finish();
                } else {
                    Toast.makeText(this, "invalid Username", Toast.LENGTH_SHORT).show();
                }

                break;

            case Utils.TEACHER:

                if (userID.equals("teacher") && pwd.equals("teacher")) {
                    Intent teacher = new Intent(LoginPg.this, TeacherDrawer.class);
                    startActivity(teacher);
                    finish();
                } else {
                    Toast.makeText(this, "invalid Username", Toast.LENGTH_SHORT).show();
                }
                break;

            case Utils.HOD:

                if (userID.equals("hod") && pwd.equals("hod")) {
                    Intent hod = new Intent(LoginPg.this, HodDrawer.class);
                    startActivity(hod);
                    finish();
                } else {
                    Toast.makeText(this, "invalid Username", Toast.LENGTH_SHORT).show();
                }

                break;

            case Utils.STUDENT:

                if (userID.equals("student") && pwd.equals("student")) {
                    Intent student = new Intent(LoginPg.this, StudentDrawer.class);
                    startActivity(student);
                    finish();

                } else {
                    Toast.makeText(this, "invalid Username", Toast.LENGTH_SHORT).show();

                }
                break;
        }
    }

    public void changeImageandtitle(int selectedUser) {

        switch (selectedUser) {
            case Utils.ADMIN:
                iw.setImageResource(R.drawable.ic_admin);
                getSupportActionBar().setTitle("Admin");
                break;

            case Utils.TEACHER:
                iw.setImageResource(R.drawable.ic_teacher);
                getSupportActionBar().setTitle("Teacher");
                break;

            case Utils.HOD:
                iw.setImageResource(R.drawable.ic_hod);
                getSupportActionBar().setTitle("HOD");
                break;

            case Utils.STUDENT:
                iw.setImageResource(R.drawable.ic_student);
                getSupportActionBar().setTitle("Student");
                break;
        }
    }

}
