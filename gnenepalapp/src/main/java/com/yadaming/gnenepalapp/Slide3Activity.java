package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Slide3Activity extends Activity {

    public void nextMethodSL3(View view) {
        Intent intent = new Intent(this, Slide4Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);
        // there should probably be a sound here
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

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
