package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.brixham.employdaily.R;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.brixham.employdaily.R;

public class RegistrationActivity extends AppCompatActivity {

    private Spinner spinner;
    private Adapter adapter;
    String[] items = new String[]{"Male", "Female", "Others"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        spinner = findViewById(R.id.registerGender_spinner);
        ArrayAdapter adapter = new ArrayAdapter<>(RegistrationActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);

    }

}