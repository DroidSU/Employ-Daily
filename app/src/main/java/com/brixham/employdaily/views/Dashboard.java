package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.brixham.employdaily.R;
import com.brixham.employdaily.views.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        /*FragmentManager fragmentManager = getSupportFragmentManager();
        fragment = fragmentManager.findFragmentByTag("myFragment");*/
        setFragment();
       /* if (fragment == null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragment =new HomeFragment();
            fragmentTransaction.add(R.id.dashBoard_frameLayout,fragment);
            fragmentTransaction.commit();
        }*/


        
    }
    protected void setFragment() {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.dashBoard_frameLayout, new HomeFragment());
        // or ft.add(R.id.your_placeholder, new ABCFragment());
        // Complete the changes added above
        ft.commit();
    }

}