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
import com.zahra.astro.home.MainActivity;
import com.zahra.astro.lessons.SpaceLessonActivity;

import java.util.ArrayList;

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

        ArrayList<Topic_Item> topicList = new ArrayList<>();
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));
        topicList.add(new Topic_Item(R.drawable.mars,"Mars"));

        Topic_Adapter adapter = new Topic_Adapter(topicList,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(),2);
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