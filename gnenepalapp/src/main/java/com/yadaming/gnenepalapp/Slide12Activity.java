package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;

public class Slide12Activity extends Activity {

    private static int clickedNum = 0;

    public void cb1(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb2(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb3(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb4(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb5(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb6(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb7(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb8(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb9(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void cb10(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            ScoreKeeper.sl12 = ScoreKeeper.sl12 + 1;
        }
    }

    public void nextMethodSL12(View view) {
        if (clickedNum == 0) {
            SoundModule SoundModule = new SoundModule(this);
            SoundModule.play(R.raw.vrp_slide13);
        }
        if (clickedNum == 1) {
            foodTouch();
        }
        clickedNum = 1;
    }

    public void foodTouch() {
        if (SoundModule.playing == false) {
            Intent intent = new Intent(this, Slide14Activity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide12);
        SoundModule SoundModule = new SoundModule(this);
        SoundModule.play(R.raw.vrp_slide12);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slide12, menu);
        return true;
    }

}
