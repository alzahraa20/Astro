package com.zahra.astro.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.zahra.astro.R;
import com.zahra.astro.home.MainActivity;

public class SpaceVideoActivity extends AppCompatActivity {
    Button quizBn;
    ImageButton homeBn;
    VideoView spaceVid;
//    String videoPath;
//    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_video);
        quizBn = findViewById(R.id.quiz3_space_btn);
        homeBn = findViewById(R.id.home3_space_btn);
        spaceVid = findViewById(R.id.space_videoView);

        homeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        quizBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), SpaceQuizActivity.class));
            }
        });



        String videoPath = "android.resource://" + getPackageName()+ "/" + R.raw.space_video;
        spaceVid.setVideoURI(Uri.parse(videoPath));
        MediaController mediaController= new MediaController(this);
        spaceVid.setMediaController(mediaController);
        mediaController.setAnchorView(spaceVid);
        spaceVid.requestFocus();
        spaceVid.start();

    }
}