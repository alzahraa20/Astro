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

public class VideoActivity extends AppCompatActivity {
    Button quizBn;
    Button lessonBn;
    ImageButton homeBn;
    VideoView earthVid;
    String videoPath;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        quizBn = findViewById(R.id.quiz2_earth_btn);
      //  lessonBn = findViewById(R.id.lesson_earth_btn);
        homeBn = findViewById(R.id.home3_earth_btn);

        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

   /*     lessonBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), EarthLessonActivity.class));
            }
        });
*/



        earthVid = findViewById(R.id.earth_videoView);
        videoPath = "android.resource://"+ getPackageName() + "/"+R.raw.sad;
        uri = Uri.parse(videoPath);
        earthVid.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        earthVid.setMediaController(mediaController);
        mediaController.setAnchorView(earthVid);
    }
}