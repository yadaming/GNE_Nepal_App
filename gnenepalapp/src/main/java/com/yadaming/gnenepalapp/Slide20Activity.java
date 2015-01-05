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

public class Slide20Activity extends Activity
{
    /*
        Function to call when brown rice is selected
                              -----
     */
    public void choseBrown(View view)
    {
        // This function should make the green check visible when clicked
        // first check if a sound module is playing or not
        if (!SoundModule.playing)
        {
            // play the sound for brown rice
            SoundModule rice_sound = new SoundModule(this);
            rice_sound.playsound(R.raw.slide_19_brown_selected);

            // Change the image
            ImageView greenCheck;
            greenCheck = (ImageView) findViewById(R.id.imageView3);
            greenCheck.setVisibility(View.VISIBLE);
        }
    }

    /*
        Function to call when white rice is selected
                              -----
     */
    public void choseWhite(View view)
    {
        // This function should make the red "x" visible when clicked
        // check that no other sound is playing
        if (!SoundModule.playing)
        {
            // play the sound for when white rice is selected
            SoundModule white_rice_sound = new SoundModule(this);
            white_rice_sound.play(R.raw.slide_19_white_selected);

            // TODO finish the red x image behavior
            ImageView redX;
            redX = (ImageView) findViewById(R.id.imageView2);
            redX.setVisibility(View.VISIBLE);
        }
    }


    /*
        For when the next button is clicked - this will start the next
        activity
     */
    public void nextMethodSL20(View view)
    {
        if (!SoundModule.playing)
        {
            // Slide 20 goes directly to the Snack Food activity - which
            // in the notes corresponds to Slide 20 (slide 22 in the PDF)
            Intent intent = new Intent(this, SnackFoodActivity.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide20);

        // Create a sound module to play
        SoundModule SoundModule = new SoundModule(this);
        // The audio to play for slide 20 is slide_19 because the slide numbers don't match up
        SoundModule.playsound(R.raw.slide_19_start_and_question);
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
        switch (item.getItemId())
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
                } else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide3:
                if (!SoundModule.playing)
                {
                    // Slide 3 became slide 4
                    Intent intent3 = new Intent(this, Slide4Activity.class);
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
                    Intent intent4 = new Intent(this, Slide5Activity.class);
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
                    Intent intent5 = new Intent(this, Slide6Activity.class);
                    startActivity(intent5);
                    finish();
                } else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide6:
                if (!SoundModule.playing)
                {
                    Intent intent6 = new Intent(this, Slide7Activity.class);
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
                    // Slide 7 in the notes is named Rice_none_circled in the code
                    Intent intent7 = new Intent(this, Rice_none_circled.class);
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
                    // Slide 8 is named Rice_main_circled in the code
                    Intent intent8 = new Intent(this, Rice_main_circled.class);
                    startActivity(intent8);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide9:
                if (!SoundModule.playing)
                {
                    // Slide 9 is named Rice_rice_circled in the code
                    Intent intent9 = new Intent(this, Rice_right_circled.class);
                    startActivity(intent9);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.action_slide10:
                if (!SoundModule.playing)
                {
                    // Slide 10 is named Rice_rice_circled in the code
                    Intent intent10 = new Intent(this, Slide8Activity.class);
                    startActivity(intent10);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide11:
                if (!SoundModule.playing)
                {
                    // Slide 9 is named Rice_rice_circled in the code
                    Intent intent11 = new Intent(this, Slide12Activity.class);
                    startActivity(intent11);
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
                    Intent intent12 = new Intent(this, Vitamin.class);
                    startActivity(intent12);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide13:
                if (!SoundModule.playing)
                {
                    Intent intent13 = new Intent(this, VitaminA.class);
                    startActivity(intent13);
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
                    Intent intent14 = new Intent(this, Iron.class);
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
                    Intent intent15 = new Intent(this, Calcium.class);
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
                    Intent intent16 = new Intent(this, Iodine.class);
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
                    Intent intent17 = new Intent(this, Folate.class);
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
                    Intent intent18 = new Intent(this, Cooking.class);
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
                    Intent intent19 = new Intent(this, Slide20Activity.class);
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
                    Intent intent20 = new Intent(this, SnackFoodActivity.class);
                    startActivity(intent20);
                    finish();
                }
                else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide21:
                if (!SoundModule.playing)
                {
                    Intent intent20 = new Intent(this, Alcohol.class);
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
                    Intent intent22 = new Intent(this, Slide24Activity.class);
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
                    Intent intent23 = new Intent(this, Slide25Activity.class);
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
                    Intent intent24 = new Intent(this, Slide26Activity.class);
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
                    Intent intent25 = new Intent(this, Slide28Activity.class);
                    startActivity(intent25);
                    finish();
                } else if (SoundModule.playing) // if the audio is playing: tell the user to wait
                {
                    Toast.makeText(getBaseContext(), "You have to hear this!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.action_slide26:
                if (!SoundModule.playing)
                {
                    Intent intent26 = new Intent(this, Slide29Activity.class);
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
                    Intent intent27 = new Intent(this, WhyBeNutritious.class);
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
                    Intent intent28 = new Intent(this, Hygiene.class);
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
                    Intent intent29 = new Intent(this, Hand.class);
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
                    Intent intent30 = new Intent(this, End.class);
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
