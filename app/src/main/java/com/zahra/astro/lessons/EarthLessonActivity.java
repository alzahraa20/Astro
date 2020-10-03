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

public class EarthLessonActivity extends AppCompatActivity {
    RecyclerView earthLessonRV;
    Button quizBn;
    Button videoBn;
    ImageButton homeBn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_lesson);
        earthLessonRV = findViewById(R.id.earth_lesson_rv);
        quizBn = findViewById(R.id.quiz_earth_btn);
        videoBn = findViewById(R.id.video_earth_btn);
        homeBn = findViewById(R.id.home2_earth_btn);

        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        videoBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), EarthVideoActivity.class));
            }
        });

        quizBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), EarthQuizActivity.class));
            }
        });


        ArrayList<Conversation_Item> list = new ArrayList<>();
        list.add(new Conversation_Item("Hello Astro, why are you looking at the sky in this way?","I wonder if the air surrounds all the earth and what does it consist of?"));
        list.add(new Conversation_Item(" that plants and animals breathe to survive is called the atmosphere which is layers of gases surrounding the earth. The atmosphere is made up of mostly nitrogen (78%) and oxygen (21%). There are lots of other gases that are part of the atmosphere but in much smaller amounts."," but what the importance of the atmosphere? "));
        list.add(new Conversation_Item("The atmosphere protects Earth like a big blanket of insulation. It absorbs the heat from the Sun and keeps the heat inside the atmosphere helping the Earth to stay warm, called the Greenhouse Effect."+
                "It also keeps the overall temperature of the Earth fairly steady, especially between night and day. So we don't get too cold at night and too hot during the day. There is also a portion of the atmosphere called the ozone layer. The ozone layer helps to protect the earth from the Sun's radiation." +
                "This big blanket also helps to form our weather patterns and climate. The weather keeps too much hot air from forming in one place and causes storms and rainfall. All of these things are important to life and the Earth's ecology."," how great the atmosphere is ! but sir you said that it is layers of gases i can see just a sky with clouds. where these layers and how do they look like?"));
        list.add(new Conversation_Item("The Earth's atmosphere is divided up into 6 major layers:\n" +
                "The first layer is the Troposphere -(The troposphere) is the layer next to the ground or surface of the Earth. It covers around 30,000-50,000 feet high. This is where we live and even where planes fly. Around 80% of the mass of the atmosphere is in the troposphere. The troposphere is heated by the surface of the Earth.\n" +
                "\nThe second is Stratosphere -(The stratosphere) extends for the next 32 miles after the troposphere. Unlike the troposphere, the stratosphere gets its heat by the Ozone Layer absorbing radiation from the sun. As a result, it gets warmer the further away you get from the Earth. Weather balloons go as high as the stratosphere.\n" +
                "\nThen there is Mesosphere -(The mesosphere) covers the next 50 miles beyond the stratosphere. This is where most meteors burn up upon entry. The coldest place on Earth is at the top of the mesosphere."+
                "\nThermosphere -(The thermosphere)is next and the air is very thin here. Temperatures can get extremely hot in the thermosphere. "+
                "\nThe Ionosphere is a very active part of the atmosphere, and it grows and shrinks depending on the energy it absorbs from the Sun. The gases in these layers are excited by solar radiation to form ions, which have an electrical charge. Parts of the ionosphere overlap with Earth’s magnetosphere. That’s the area around Earth where charged particles feel Earth’s magnetic field. This is where auroras happen. Those are the bright, beautiful bands of light that you sometimes see near Earth’s poles, and This region is what makes radio communications possible.\n" +
                "\nExosphere - The last layer and the thinnest. It goes all the way to 10,000 km above the Earth's surface.","Where does outer space start?"));
        list.add(new Conversation_Item("There is no clear definition between the Earth's atmosphere and outer space. There are a few official guidelines, most are between 50 and 80 miles from the surface of the Earth.","It was interesting information thank you"));



        Conversation_Adapter adapter = new Conversation_Adapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false);
        earthLessonRV.setAdapter(adapter);
        earthLessonRV.setLayoutManager(layoutManager);

    }
}