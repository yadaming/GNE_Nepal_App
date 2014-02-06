package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide8Activity extends Activity {

    private static int nextButtonPresses = 0;

    public void playNextSL8(View view) {
        if (nextButtonPresses == 0) {
            if (SoundModule.playing == false) {
                SoundModule SoundModule = new SoundModule(this);
                SoundModule.play(R.raw.vrp_slide9);
            }
        }
        if (nextButtonPresses == 1) {
            if (SoundModule.playing == false) {
                SoundModule SoundModule = new SoundModule(this);
                SoundModule.play(R.raw.vrp_slide10);
            }
        }
        if (nextButtonPresses == 2) {
            if (SoundModule.playing == false) {
                SoundModule SoundModule = new SoundModule(this);
                SoundModule.play(R.raw.vrp_slide11actual);
            }
        }
        nextButtonPresses = nextButtonPresses + 1;
    }

    public void zeroToTwo(View view) {
        if (SoundModule.playing == false) {
            ScoreKeeper.sl8 = 0;
            Intent intent = new Intent(this, Slide12Activity.class);
            startActivity(intent);
            finish();
        }
    }

    public void threeToSix(View view) {
        if (SoundModule.playing == false) {
            ScoreKeeper.sl8 = 1;
            Intent intent = new Intent(this, Slide12Activity.class);
            startActivity(intent);
            finish();
        }
    }

    public void sevenToNine(View view) {
        if (SoundModule.playing == false) {
            ScoreKeeper.sl8 = 2;
            Intent intent = new Intent(this, Slide12Activity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide8);
        SoundModule SoundModule = new SoundModule(this);
        SoundModule.play(R.raw.vrp_slide8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slide8, menu);
        return true;
    }

}
