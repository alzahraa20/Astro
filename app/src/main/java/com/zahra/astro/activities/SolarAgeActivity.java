package com.zahra.astro.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zahra.astro.R;
import com.zahra.astro.adapters.Age_Adapter;
import com.zahra.astro.data.Age_Item;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * calculate age on all planets in years and days
 */

public class SolarAgeActivity extends AppCompatActivity {
    RecyclerView RV;
    EditText birthEt;
    TextView textView;
    Button calculateBn;
    FloatingActionButton home;
    int day,month,year;

    DatePickerDialog.OnDateSetListener dateSetListener1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_age);
        RV = findViewById(R.id.age_rv);
        calculateBn = findViewById(R.id.calculate_btn);
  //      home = findViewById(R.id.home_btn2);
        birthEt = findViewById(R.id.birth_et);

        textView = findViewById(R.id.textView_age);

        ArrayList<Age_Item> list = new ArrayList<>();
        list.add(new Age_Item("Mercury",R.drawable.mercury_nasa,"",""));
        list.add(new Age_Item("Venus",R.drawable.venus_nasa,"",""));
        list.add(new Age_Item("Earth",R.drawable.earth_nasa,"",""));
        list.add(new Age_Item("Mars",R.drawable.mars_nasa,"",""));
        list.add(new Age_Item("Jupiter",R.drawable.jupiter_nasa,"",""));
        list.add(new Age_Item("Saturn",R.drawable.saturn_nasa,"",""));
        list.add(new Age_Item("Uranus",R.drawable.uranus_nasa,"",""));
        list.add(new Age_Item("Neptune",R.drawable.neptune_nasa,"",""));



        final Age_Adapter adapter = new Age_Adapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false);
        //  earthRV.hasFixedSize();
        RV.setAdapter(adapter);
        RV.setLayoutManager(layoutManager);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final String date = simpleDateFormat.format(Calendar.getInstance().getTime());

        birthEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(SolarAgeActivity.this,android.R.style.Theme_Holo_Dialog_MinWidth,
                        dateSetListener1,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        dateSetListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int Year, int Month, int dayOfMonth) {
                Month = Month +1;
                String Date = dayOfMonth+"/"+ Month+"/"+ Year;
                birthEt.setText(Date);
            }
        };

        calculateBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String birthday = birthEt.getText().toString();
                String today = date;

                SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date date1 = simpleDateFormat1.parse(birthday);
                    Date date2 = simpleDateFormat1.parse(today);

                    long startDate = date1.getTime();
                    long endDate = date2.getTime();

                    if(startDate <= endDate){
                        Period period = new Period(startDate,endDate, PeriodType.yearMonthDay());
                        int years = period.getYears();
                        int months = period.getMonths();
                        int days = period.getDays();

                        double ageInDays = years*365.2 + months*30 + days ;
                        double ageInYears = ageInDays/365 ;
                  //      textView.setText(ageInDays+":"+String.format("%.2f", ageInYears));

                        ArrayList<Age_Item> list = new ArrayList<>();
                        list.add(new Age_Item("Mercury",R.drawable.mercury_nasa,String.format("%.2f", ageInDays/88),String.format("%.1f",ageInDays/176)));
                        list.add(new Age_Item("Venus",R.drawable.venus_nasa,String.format("%.2f", ageInDays/224.7),String.format("%.1f",ageInDays/117)));
                        list.add(new Age_Item("Earth",R.drawable.earth_nasa,String.format("%.2f", ageInDays/365.2),String.format("%.1f", ageInDays)));
                        list.add(new Age_Item("Mars",R.drawable.mars_nasa,String.format("%.2f", ageInDays/687),String.format("%.1f",ageInDays/1.03)));
                        list.add(new Age_Item("Jupiter",R.drawable.jupiter_nasa,String.format("%.2f", ageInDays/4331),String.format("%.1f",ageInDays/0.41)));
                        list.add(new Age_Item("Saturn",R.drawable.saturn_nasa,String.format("%.2f", ageInDays/10747),String.format("%.1f",ageInDays/0.43)));
                        list.add(new Age_Item("Uranus",R.drawable.uranus_nasa,String.format("%.2f", ageInDays/30589 ),String.format("%.1f",ageInDays/0.75)));
                        list.add(new Age_Item("Neptune",R.drawable.neptune_nasa,String.format("%.2f", ageInDays/59800),String.format("%.1f",ageInDays/0.67)));
                        Age_Adapter adapter = new Age_Adapter(list);
                        RV.setAdapter(adapter);

                    }else {
                        Toast.makeText(getApplicationContext(),"Please Enter A Valid Birthday",Toast.LENGTH_SHORT).show();
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}