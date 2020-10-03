package com.zahra.astro.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import com.zahra.astro.R;
import com.zahra.astro.home.MainActivity;
import com.zahra.astro.lessons.EarthQuizActivity;

public class EarthVideoActivity extends AppCompatActivity {
    Button quizBn;
    ImageButton homeBn;
    VideoView earthVid;
 //   String videoPath;
 //   Uri uri;
  //  MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_video);
        quizBn = findViewById(R.id.quiz2_earth_btn);
        homeBn = findViewById(R.id.home3_earth_btn);
        earthVid = findViewById(R.id.earth_videoView);


        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        quizBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), EarthQuizActivity.class));
            }
        });


        String videoPath = "android.resource://" + getPackageName()+ "/" + R.raw.atmosphere;
        Uri uri = Uri.parse(videoPath);
        earthVid.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        earthVid.setMediaController(mediaController);
        mediaController.setAnchorView(earthVid);
        earthVid.requestFocus();
        earthVid.start();

    }
}