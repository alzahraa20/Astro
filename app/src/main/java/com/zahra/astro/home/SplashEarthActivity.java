package com.zahra.astro.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.zahra.astro.R;
import com.zahra.astro.topics.EarthTopicsActivity;

/**
 * animation before launch topics activity
 */

public class SplashEarthActivity extends AppCompatActivity {
    ImageView splash_iv;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_earth);
        splash_iv = findViewById(R.id.spacecraft_earth_iv);

        animation = AnimationUtils.loadAnimation(this,R.anim.splash_anim);//create the animation

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(getBaseContext(), EarthTopicsActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        splash_iv.startAnimation(animation);

    }
}