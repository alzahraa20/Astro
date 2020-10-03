package com.zahra.astro.topics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.zahra.astro.R;
import com.zahra.astro.adapters.Topic_Adapter;
import com.zahra.astro.data.Topic_Item;
import com.zahra.astro.home.ActivitiesOptActivity;
import com.zahra.astro.home.MainActivity;
import com.zahra.astro.lessons.EarthLessonActivity;

import java.util.ArrayList;

/**
 * display earth topics in grid layout manager
 * set image and name of every topic into topic adapter
 * implement onTopicClick interface to change the activity when user click on any topic
 */

public class EarthTopicsActivity extends AppCompatActivity implements Topic_Adapter.OnTopicClick{
    RecyclerView earthRV;
    Button playBn;
    ImageButton homeBn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_topics);
        earthRV = findViewById(R.id.earth_rv);
        playBn = findViewById(R.id.play_btn);
        homeBn = findViewById(R.id.home_btn);
        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });
        playBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ActivitiesOptActivity.class));
            }
        });

        ArrayList<Topic_Item> topicList = new ArrayList<>();
        topicList.add(new Topic_Item(R.drawable.earth,"Atmosphere"));
        topicList.add(new Topic_Item(R.drawable.cloud_computing,"Cloud"));
        topicList.add(new Topic_Item(R.drawable.desert,"Desert"));
        topicList.add(new Topic_Item(R.drawable.rock,"Rock"));
        topicList.add(new Topic_Item(R.drawable.volcano,"Volcano"));
        topicList.add(new Topic_Item(R.drawable.sun,"Sun"));
        topicList.add(new Topic_Item(R.drawable.cloud_computing,"Cloud"));
        topicList.add(new Topic_Item(R.drawable.desert,"Desert"));
        topicList.add(new Topic_Item(R.drawable.rock,"Rock"));
        topicList.add(new Topic_Item(R.drawable.volcano,"Volcano"));
        topicList.add(new Topic_Item(R.drawable.sun,"Sun"));
        topicList.add(new Topic_Item(R.drawable.cloud_computing,"Cloud"));


        Topic_Adapter adapter = new Topic_Adapter(topicList,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(),3);
    //  earthRV.hasFixedSize();
        earthRV.setAdapter(adapter);
        earthRV.setLayoutManager(layoutManager);


    }

    @Override
    public void OnClick(int pos) {
        if(pos==0){
            startActivity(new Intent(getBaseContext(), EarthLessonActivity.class));
        }
    }
}