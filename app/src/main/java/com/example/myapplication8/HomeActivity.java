package com.example.myapplication8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    //ImageView profile_img;
    TextView profile_email;
    TextView profile_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile_email = findViewById(R.id.profile_email);
        //profile_img = findViewById(R.id.profile_img);
        profile_pass = findViewById(R.id.profile_pass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("email");
        String password = bundle.getString("password");

        profile_email.setText(email);
        profile_pass.setText(password);
    }
}
