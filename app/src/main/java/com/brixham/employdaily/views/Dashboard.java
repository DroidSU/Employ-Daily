package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.brixham.employdaily.R;


import com.brixham.employdaily.views.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private  Toolbar toolbar;
    private CircleImageView circleImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
//        toolbarBinding = LayoutToolbarBinding.inflate(getLayoutInflater());
//        toolbar = toolbarBinding.getRoot();
//        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_dashboard);
        circleImageView = findViewById(R.id.imgProfile);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, LoginScreen.class);
                startActivity(intent);
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