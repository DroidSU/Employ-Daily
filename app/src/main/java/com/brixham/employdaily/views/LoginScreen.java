package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.brixham.employdaily.R;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.brixham.employdaily.R;

public class LoginScreen extends AppCompatActivity {

    private TextView registerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_login_screen);
        registerText = findViewById(R.id.textViewRegister);
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, RegistrationPage.class);
                startActivity(intent);
            }
        });
    }
}