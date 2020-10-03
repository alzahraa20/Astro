package com.zahra.astro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.zahra.astro.R;

public class InteractActivity extends AppCompatActivity {

    VideoView interVid;
    TextView text,text2;
    String videoPath;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interact);
        interVid = findViewById(R.id.inter_videoView);
        text = findViewById(R.id.material_tv);
        text2 = findViewById(R.id.material2_tv);

        text.setText("Materials Of The Rocket :");
        text2.setText("-Paper\n\n"+"-Adhesive tape\n\n"+"-Scissors\n\n"+"-Glue");



        String videoPath = "android.resource://" + getPackageName()+ "/" + R.raw.interact_video_compressed;
        interVid.setVideoURI(Uri.parse(videoPath));
        MediaController mediaController= new MediaController(this);
        interVid.setMediaController(mediaController);
        mediaController.setAnchorView(interVid);
        interVid.requestFocus();
        interVid.start();
    }
}