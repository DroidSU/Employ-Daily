package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;

import com.brixham.employdaily.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.brixham.employdaily.R;
import com.brixham.employdaily.utilities.ConstantsManager;


public class SplashActivity extends AppCompatActivity {

    private String userId = "";
    private boolean isUserLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startActivity(new Intent(SplashActivity.this, Dashboard.class));
        finish();

//        SharedPreferences sharedPreferences = getSharedPreferences(ConstantsManager.SHARED_PREFS_FILE_NAME, MODE_PRIVATE);
//        userId = sharedPreferences.getString(ConstantsManager.SHARED_PREFS_USER_ID, "");
//        isUserLoggedIn = sharedPreferences.getBoolean(ConstantsManager.SHARED_PREFS_IS_USER_LOGGED_IN, false);

//        if(isUserLoggedIn){
//            startActivity(new Intent(SplashActivity.this, Dashboard.class));
//            finish();
//        }
//        else{
//            startActivity(new Intent(SplashActivity.this, LoginScreen.class));
//            finish();
//        }
    }
}