package com.example.myapplication8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText pass;
    Boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

    }

    public void demo(View view) {
        String email_text = email.getText().toString();
        String pass_text = pass.getText().toString();
        check = false;


        Intent homeIntent = new Intent(this, HomeActivity.class);

        Bundle bundle = new Bundle();

        bundle.putString("email", email_text);
        bundle.putString("password", pass_text);

        homeIntent.putExtras(bundle);


        if(email_text.isEmpty()){
            email.setError("This field is empty");
            check = true;
        }
        if(pass_text.isEmpty()){
            pass.setError("This field is empty");
            check = true;
        }
        else if(pass.length() <= 6){
            pass.setError("Password is too short");
            check = true;
        }
        if(!check){
            startActivity(homeIntent);
        }

    }
}

