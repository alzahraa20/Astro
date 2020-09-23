package com.zahra.astro.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.zahra.astro.R;
import com.zahra.astro.topics.EarthTopicsActivity;
import com.zahra.astro.topics.SpaceTopicsActivity;

public class SplashSpaceActivity extends AppCompatActivity {
    ImageView splash_iv;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_space);
        splash_iv = findViewById(R.id.spacecraft_space_iv);

        animation = AnimationUtils.loadAnimation(this,R.anim.splash_anim);//create the animation

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //go to main activity after splash animation ends
                Intent intent = new Intent(getBaseContext(), SpaceTopicsActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        splash_iv.startAnimation(animation);

    }
}
