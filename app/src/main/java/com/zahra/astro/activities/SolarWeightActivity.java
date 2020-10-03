package com.zahra.astro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.zahra.astro.R;

/**
 * calculate weight on other planets and earth moon
 */

public class SolarWeightActivity extends AppCompatActivity {
    ImageButton mercuryBn, venusBn, moonBn, marsBn, jupiterBn, saturnBn, uranusBn, neptuneBn;
    EditText earthEt,planetEt;
    TextView planetTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_weight);
        earthEt = findViewById(R.id.earth_weight_et);
        planetEt = findViewById(R.id.planet_weight_et);
        planetTv = findViewById(R.id.planet_weight_tv);
        mercuryBn =findViewById(R.id.mercury_btn);
        venusBn = findViewById(R.id.venus_btn);
        moonBn = findViewById(R.id.moon_btn);
        marsBn = findViewById(R.id.mars_btn);
        jupiterBn = findViewById(R.id.jupiter_btn);
        saturnBn = findViewById(R.id.saturn_btn);
        uranusBn = findViewById(R.id.uranus_btn);
        neptuneBn = findViewById(R.id.neptune_btn);



        mercuryBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetTv.setText("Weight On Mercury: ");
                    planetEt.setVisibility(View.VISIBLE);
                    planetEt.setText(String.format("%.2f",weight * 0.378));
                }
            }
        });
        venusBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Venus: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 0.907));
                }
            }
        });
        moonBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Moon: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 0.166));
                }
            }
        });
        marsBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Mars: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 0.377));
                }
            }
        });
        jupiterBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Jupiter: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 2.36));
                }
            }
        });
        saturnBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Saturn: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 0.916));
                }
            }
        });
        uranusBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Uranus: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 0.889));
                }
            }
        });
        neptuneBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(earthEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter A Valid Weight",Toast.LENGTH_SHORT).show();
                }else {
                    planetTv.setText("Weight On Neptune: ");
                    planetEt.setVisibility(View.VISIBLE);
                    int weight = Integer.parseInt(earthEt.getText().toString());
                    planetEt.setText(String.format("%.2f",weight * 1.12));
                }
            }
        });

    }
}