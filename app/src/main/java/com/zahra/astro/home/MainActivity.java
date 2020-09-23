package com.zahra.astro.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zahra.astro.R;
import com.zahra.astro.topics.EarthTopicsActivity;
import com.zahra.astro.topics.SpaceTopicsActivity;

public class MainActivity extends AppCompatActivity {
    CardView earthCard;
    CardView spaceCard;
    Button earthBn;
    Button spaceBn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        earthCard = findViewById(R.id.earth_card);
        spaceCard = findViewById(R.id.space_card);
        earthBn = findViewById(R.id.earth_btn);
        spaceBn = findViewById(R.id.space_btn);

        earthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SplashEarthActivity.class);
                startActivity(intent);
            }
        });
        earthBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SplashEarthActivity.class);
                startActivity(intent);
            }
        });
        spaceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SplashSpaceActivity.class);
                startActivity(intent);
            }
        });
        spaceBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SplashSpaceActivity.class);
                startActivity(intent);
            }
        });
    }
}