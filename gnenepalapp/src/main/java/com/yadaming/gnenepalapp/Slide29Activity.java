package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Slide29Activity extends Activity {

    SoundModule SoundModule = new SoundModule(this);

    public void boy(View view) {
        if (SoundModule.playing == false) {
            SoundModule.play(R.raw.vrp_slide29_updatedboy);
            ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
        }
    }

    public void old(View view) {
        if (SoundModule.playing == false) {
            SoundModule.play(R.raw.vrp_slide29_updatedoldwomen);
            ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
        }
    }

    public void man(View view) {
        if (SoundModule.playing == false) {
            SoundModule.play(R.raw.vrp_slide29_updatedmen);
            ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
        }
    }

    public void girl(View view) {
        if (SoundModule.playing == false) {
            SoundModule.play(R.raw.vrp_slide29_updatedsmallgirl);
            ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
        }
    }

    // opens up slide 30
    public void nextMethodSL29(View view) {
        if (SoundModule.playing == false) {
            Intent intent = new Intent(this, Slide30Activity.class);
            startActivity(intent);
            finish();
        }
    }

    /*
        play second audio file that is meant to be played after the
        person makes their selection
        I Think
    */
    public void right1SL29(View view) {
        if (SoundModule.playing == false) {
            ImageView SL29gold1;
            SL29gold1 = (ImageView) findViewById(R.id.imageView6);
            SL29gold1.setVisibility(View.VISIBLE);
            ScoreKeeper.correct = ScoreKeeper.correct + 1;
            SoundModule.play(R.raw.vrp_slide29_updatedproperactual);
        }
    }

    /*
        play third audio when they push the button again
        I'm pretty sure this is what they want
     */
    public void right2SL29(View view) {
        if (SoundModule.playing == false) {
            ImageView SL29gold2;
            SL29gold2 = (ImageView) findViewById(R.id.imageView5);
            SL29gold2.setVisibility(View.VISIBLE);
            ScoreKeeper.correct = ScoreKeeper.correct + 1;
            SoundModule.play(R.raw.vrp_slide29_updatedproperactual);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide29);
        SoundModule.play(R.raw.vrp_slide29_updatedproperactual);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.initial, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        /* a switch case for the item selected from the menu. */
        switch(item.getItemId())
        {
            case R.id.action_slide1:
                if (!SoundModule.playing) // if the audio is not playing then the next method can work
                {
                    Intent intent1 = new Intent(this, InitialActivity.class);
                    startActivity(intent1);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide2:
                if (!SoundModule.playing) // if the audio is not playing then the next method can work
                {
                    Intent intent2 = new Intent(this, Slide2Activity.class);
                    startActivity(intent2);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide3:
                if (!SoundModule.playing)
                {
                    Intent intent3 = new Intent(this, Slide3Activity.class);
                    startActivity(intent3);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide4:
                if (!SoundModule.playing)
                {
                    Intent intent4 = new Intent(this, Slide4Activity.class);
                    startActivity(intent4);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide5:
                if (!SoundModule.playing)
                {
                    Intent intent5 = new Intent(this, Slide5Activity.class);
                    startActivity(intent5);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide6:
                if (!SoundModule.playing)
                {
                    Intent intent6 = new Intent(this, Slide6Activity.class);
                    startActivity(intent6);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide7:
                if (!SoundModule.playing)
                {
                    Intent intent7 = new Intent(this, Slide7Activity.class);
                    startActivity(intent7);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide8:
                if (!SoundModule.playing)
                {
                    Intent intent8 = new Intent(this, Slide8Activity.class);
                    startActivity(intent8);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide12:
                if (!SoundModule.playing)
                {
                    Intent intent12 = new Intent(this, Slide12Activity.class);
                    startActivity(intent12);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide14:
                if (!SoundModule.playing)
                {
                    Intent intent14 = new Intent(this, Slide14Activity.class);
                    startActivity(intent14);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide15:
                if (!SoundModule.playing)
                {
                    Intent intent15 = new Intent(this, Slide15Activity.class);
                    startActivity(intent15);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide16:
                if (!SoundModule.playing)
                {
                    Intent intent16 = new Intent(this, Slide16Activity.class);
                    startActivity(intent16);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide17:
                if (!SoundModule.playing)
                {
                    Intent intent17 = new Intent(this, Slide17Activity.class);
                    startActivity(intent17);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide18:
                if (!SoundModule.playing)
                {
                    Intent intent18 = new Intent(this, Slide18Activity.class);
                    startActivity(intent18);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide19:
                if (!SoundModule.playing)
                {
                    Intent intent19 = new Intent(this, Slide19Activity.class);
                    startActivity(intent19);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide20:
                if (!SoundModule.playing)
                {
                    Intent intent20 = new Intent(this, Slide20Activity.class);
                    startActivity(intent20);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide22:
                if (!SoundModule.playing)
                {
                    Intent intent22 = new Intent(this, Slide22Activity.class);
                    startActivity(intent22);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide23:
                if (!SoundModule.playing)
                {
                    Intent intent23 = new Intent(this, SnackFoodActivity.class);
                    startActivity(intent23);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide24:
                if (!SoundModule.playing)
                {
                    Intent intent24 = new Intent(this, Slide24Activity.class);
                    startActivity(intent24);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide25:
                if (!SoundModule.playing)
                {
                    Intent intent25 = new Intent(this, Slide25Activity.class);
                    startActivity(intent25);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide26:
                if (!SoundModule.playing)
                {
                    Intent intent26 = new Intent(this, Slide26Activity.class);
                    startActivity(intent26);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide27:
                if (!SoundModule.playing)
                {
                    Intent intent27 = new Intent(this, Slide27Activity.class);
                    startActivity(intent27);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide28:
                if (!SoundModule.playing)
                {
                    Intent intent28 = new Intent(this, Slide28Activity.class);
                    startActivity(intent28);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide29:
                if (!SoundModule.playing)
                {
                    Intent intent29 = new Intent(this, Slide29Activity.class);
                    startActivity(intent29);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.action_slide30:
                if (!SoundModule.playing)
                {
                    Intent intent30 = new Intent(this, Slide30Activity.class);
                    startActivity(intent30);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
