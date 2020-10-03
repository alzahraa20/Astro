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
import com.zahra.astro.lessons.SpaceLessonActivity;

import java.util.ArrayList;
/**
 * display space topics in grid layout manager
 * set image and name of every topic into topic adapter
 * implement onTopicClick interface to change the activity when user click on any topic
 */

public class SpaceTopicsActivity extends AppCompatActivity implements Topic_Adapter.OnTopicClick{
    RecyclerView spaceRV;
    Button playBn;
    ImageButton homeBn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_topics);
        spaceRV = findViewById(R.id.space_rv);
        playBn = findViewById(R.id.play_space_btn);
        homeBn = findViewById(R.id.home_space_btn);
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
        topicList.add(new Topic_Item(R.drawable.solar_system,"Solar System"));
        topicList.add(new Topic_Item(R.drawable.star,"Star"));
        topicList.add(new Topic_Item(R.drawable.sun,"Sun"));
        topicList.add(new Topic_Item(R.drawable.asteroid,"Asteroid"));
        topicList.add(new Topic_Item(R.drawable.comet,"Comet"));
        topicList.add(new Topic_Item(R.drawable.meteor,"Meteor"));
        topicList.add(new Topic_Item(R.drawable.orbit,"Orbit"));
        topicList.add(new Topic_Item(R.drawable.mercury,"Mercury"));
        topicList.add(new Topic_Item(R.drawable.venus,"Venus"));
        topicList.add(new Topic_Item(R.drawable.earth1,"Earth"));
        topicList.add(new Topic_Item(R.drawable.mars1,"Mars"));
        topicList.add(new Topic_Item(R.drawable.jupiter,"Jupiter"));
        topicList.add(new Topic_Item(R.drawable.saturn,"Saturn"));
        topicList.add(new Topic_Item(R.drawable.uranus,"Uranus"));
        topicList.add(new Topic_Item(R.drawable.neptune,"Neptune"));

        Topic_Adapter adapter = new Topic_Adapter(topicList,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(),3);
        //  earthRV.hasFixedSize();
        spaceRV.setAdapter(adapter);
        spaceRV.setLayoutManager(layoutManager);


    }

    @Override
    public void OnClick(int pos) {
        if(pos==0){
            startActivity(new Intent(getBaseContext(), SpaceLessonActivity.class));
        }
    }
}