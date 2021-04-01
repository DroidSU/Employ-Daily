package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.brixham.employdaily.R;
import com.brixham.employdaily.databinding.ActivityDashboardBinding;
import com.brixham.employdaily.databinding.LayoutToolbarBinding;
import com.brixham.employdaily.views.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private  Toolbar toolbar;

    private ActivityDashboardBinding binding;
    private LayoutToolbarBinding toolbarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        toolbarBinding = LayoutToolbarBinding.inflate(getLayoutInflater());
        toolbar = toolbarBinding.getRoot();
        setSupportActionBar(toolbar);
        setContentView();

        setFragment();
    }
    protected void setFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.dashBoard_frameLayout, HomeFragment.newInstance());
        ft.commit();
    }

}