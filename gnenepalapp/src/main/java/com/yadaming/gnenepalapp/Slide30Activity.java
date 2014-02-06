package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide30Activity extends Activity {

    SoundModule SoundModule = new SoundModule(this);

    private int clickedNum = 0;

    public void nextMethodSL30(View view) {
        if (SoundModule.playing == false) {
            if (clickedNum == 0) {
                SoundModule.play(R.raw.vrp_slide31);
                clickedNum = clickedNum + 1;
            }
            if (clickedNum == 1) {
                SoundModule.play(R.raw.vrp_slide32_34i_willbehealthier);
                clickedNum = clickedNum + 1;
            }
            if (clickedNum == 2) {
                SoundModule.play(R.raw.vrp_slide32_34mybabywillbehealthierandsmarter);
                clickedNum = clickedNum + 1;
            }
            if (clickedNum == 3) {
                SoundModule.play(R.raw.vrp_slide32_34mymilkwillbehealthier);
                clickedNum = clickedNum + 1;
            }
            if (clickedNum == 4) {
                SoundModule.play(R.raw.vrp_slide35);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide30);
        SoundModule.play(R.raw.vrp_slide30);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slide30, menu);
        return true;
    }

}
