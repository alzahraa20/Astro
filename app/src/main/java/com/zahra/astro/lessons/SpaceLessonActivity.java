package com.zahra.astro.lessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.zahra.astro.R;
import com.zahra.astro.adapters.Conversation_Adapter;
import com.zahra.astro.data.Conversation_Item;
import com.zahra.astro.home.MainActivity;

import java.util.ArrayList;

public class SpaceLessonActivity extends AppCompatActivity {
    RecyclerView spaceLessonRV;
    Button quizBn;
    Button videoBn;
    ImageButton homeBn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_lesson);
        spaceLessonRV = findViewById(R.id.space_lesson_rv);
        quizBn = findViewById(R.id.quiz_space_btn);
        videoBn = findViewById(R.id.video_space_btn);
        homeBn = findViewById(R.id.home4_earth_btn);

        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        videoBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), SpaceVideoActivity.class));
            }
        });

        quizBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), SpaceQuizActivity.class));
            }
        });


        ArrayList<Conversation_Item> list = new ArrayList<>();
        list.add(new Conversation_Item("Astro, what about doing a solar system maquette tomorrow?","solar system what does it mean?"));
        list.add(new Conversation_Item("we live on this planet as a part of the solar system, it isn’t just containing our world there are many planets, the sun dozens of moons. The Solar System is part of a bigger grouping of stars called a galaxy. Our galaxy is the Milky Way. ","How is the solar system made up?"));
        list.add(new Conversation_Item("our solar system is made up of one star that is the sun and eight planets orbit it. They are Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune in the order. Also there are Dwarf planets, Comets, Asteroid belt, Kuiper belt, Oort cloud.",
                "Tell me more about these Objects."));
        list.add(new Conversation_Item("•Dwarf planets are objects similar to the planets but not large enough. Some of the dwarf planets in the Solar System include Pluto, Ceres, Eris, Haumea, and Makemake." +
                "\n•Comets are objects made of ice, dust, and rocks that orbit the sun. They often have a visible (tail) of gas that comes from solar radiation and solar wind. Comets originate from the Kuiper belt and the Oort cloud." +
                "\n•Asteroid belt is a region between the planets Mars and Jupiter. In this region thousands of rocky objects orbit the Sun." +
                "\n•Kuiper belt is a region of thousands of small bodies that exists outside the orbit of the planets. Objects in the Kuiper belt consist of (ices) such as ammonia, water, and methane."+
                "\n•Oort cloud exists much further out than the Kuiper belt.The Oort cloud is at the very edge of the Solar System.","Thanks sir for your time."));

        Conversation_Adapter adapter = new Conversation_Adapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false);
        spaceLessonRV.setAdapter(adapter);
        spaceLessonRV.setLayoutManager(layoutManager);
    }
}