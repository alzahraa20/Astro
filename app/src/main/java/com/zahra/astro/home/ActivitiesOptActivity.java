package com.zahra.astro.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zahra.astro.R;
import com.zahra.astro.activities.InteractActivity;
import com.zahra.astro.activities.MapActivity;
import com.zahra.astro.activities.SolarAgeActivity;
import com.zahra.astro.activities.SolarWeightActivity;

/**
 * options of activities : 1)age calculator in other planets
 * 2)weight calculator in other planets
 * 3)map of earth
 * 4)create your rocket
 */

public class ActivitiesOptActivity extends AppCompatActivity {

    Button ageBn;
    Button weightBn;
    Button mapBn;
    Button interactBn;
    FloatingActionButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_opt);
        ageBn = findViewById(R.id.age_btn);
        weightBn = findViewById(R.id.weight_btn);
        mapBn = findViewById(R.id.map_btn);
        home = findViewById(R.id.home_btn1);
        interactBn = findViewById(R.id.interact_btn);

        ageBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), SolarAgeActivity.class));
            }
        });
        weightBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), SolarWeightActivity.class));
            }
        });
        mapBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MapActivity.class));
            }
        });
        interactBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), InteractActivity.class));
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });
    }
}