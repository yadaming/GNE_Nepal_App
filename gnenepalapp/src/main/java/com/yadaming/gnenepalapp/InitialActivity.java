/*
    The initial main activity for the GNE Nepal App

 */

package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class InitialActivity extends Activity
{
    public void nextMethod(View view)
    {
        if (SoundModule.playing == false) // if the audio is not playing then the next method can work
        {
            Intent intent = new Intent(this, Slide2Activity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        // Play the sound
        SoundModule SoundModule = new SoundModule(this);
        SoundModule.play(R.raw.vrp_slide1);
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
            case R.id.action_settings:
                Toast.makeText(getBaseContext(), "You selected settings!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_slide2:
                Intent intent = new Intent(this, Slide2Activity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.action_slide3:
                Toast.makeText(getBaseContext(), "You selected slide 3", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_slide4:
                Toast.makeText(getBaseContext(), "You selected slide 4", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_slide5:
                Toast.makeText(getBaseContext(), "You selected slide 5", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
