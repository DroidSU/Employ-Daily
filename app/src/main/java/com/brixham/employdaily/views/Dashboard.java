package com.brixham.employdaily.views;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.brixham.employdaily.R;
import com.brixham.employdaily.utilities.ConstantsManager;
import com.brixham.employdaily.views.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private  Toolbar toolbar;
    private CircleImageView imageViewProfile;
    private String userId;
    private boolean isUserLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        toolbar = findViewById(R.id.dashboard_layout_toolbaar);

        imageViewProfile = toolbar.findViewById(R.id.imgProfile);

        SharedPreferences sharedPreferences = getSharedPreferences(ConstantsManager.SHARED_PREFS_FILE_NAME, MODE_PRIVATE);
        userId = sharedPreferences.getString(ConstantsManager.SHARED_PREFS_USER_ID, "");
        isUserLoggedIn = sharedPreferences.getBoolean(ConstantsManager.SHARED_PREFS_IS_USER_LOGGED_IN, false);

        imageViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isUserLoggedIn) {
                    Intent intent = new Intent(Dashboard.this, LoginScreen.class);
                    startActivity(intent);
                }
                else{
//                    Intent intent = new Intent(Dashboard.this, ProfileActivity.class);
//                    startActivity(intent);
                    Toast.makeText(Dashboard.this, "Not implemented yet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setFragment();
    }

    protected void setFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.dashBoard_frameLayout, HomeFragment.newInstance());
        ft.commit();
    }

}