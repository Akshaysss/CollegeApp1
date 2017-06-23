package com.eoneservices.pavan.collegeapp.Login_Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.eoneservices.pavan.collegeapp.R;
import com.eoneservices.pavan.collegeapp.Utils;

public class RegisterPg extends AppCompatActivity {

    EditText userID, password, confirm_password;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pg);

        final int s = getIntent().getIntExtra(Utils.SELECTED_USER,0);

        userID = (EditText) findViewById(R.id.ar_userID);
        password = (EditText) findViewById(R.id.ar_password);
        confirm_password = (EditText) findViewById(R.id.ar_confirm_password);
        signup = (Button) findViewById(R.id.ar_signUp);

        changetitle(s);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterPg.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void changetitle(int selectedUser) {

        switch (selectedUser) {
            case Utils.ADMIN:
                getSupportActionBar().setTitle("Admin SignUp");

                break;

            case Utils.TEACHER:
                getSupportActionBar().setTitle("Teacher SignUp");
                break;

            case Utils.HOD:
                getSupportActionBar().setTitle("HOD SignUp");

                break;

            case Utils.STUDENT:
                getSupportActionBar().setTitle("Student SignUp");

                break;
        }
    }

}



        /*
        profile = (Spinner) findViewById(R.id.ar_spinner);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Profile_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        profile.setAdapter(adapter);*/
