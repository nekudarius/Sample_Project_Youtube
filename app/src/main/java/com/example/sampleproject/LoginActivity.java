package com.example.sampleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppCompatButton LoginBtn    = findViewById(R.id.loginBtn);
        EditText Username           = findViewById(R.id.username);
        EditText Password           = findViewById(R.id.password);

        LoginBtn.setOnClickListener(v -> {
            if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin"))
            {
                Toast.makeText(LoginActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
            else
            {   Toast.makeText(LoginActivity.this,"Username or Password incorrect",Toast.LENGTH_SHORT).show(); }
        });
    }
}