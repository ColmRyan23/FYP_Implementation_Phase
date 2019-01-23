package com.example.colmr.fyp_implementation_phase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private TextView noOfAttempts;
    private Button login;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        noOfAttempts = (TextView)findViewById(R.id.noOfAttempts);
        login = (Button)findViewById(R.id.login);

        noOfAttempts.setText("No of attempts remaining: 3");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("admin")) && (userPassword.equals("pass"))){
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);
        }
        else{
            counter--;

            noOfAttempts.setText("No of attempts remaining: " + String.valueOf(counter));
            if(counter == 0){
                login.setEnabled(false);
            }
        }
    }
}
