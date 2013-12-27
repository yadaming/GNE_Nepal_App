package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide2Activity extends Activity {
	
	public void noMethod(View view) {
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide2_if_selected_no_then_this_is_played);
		if(SoundModule.onCompletion() == 0) {
			finish();
		}
	}
	
	public void yesMethod(View view) {
		ScoreKeeper.correct = ScoreKeeper.correct + 1;
		Intent intent = new Intent(this, Slide3Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide2);
		
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide2_beginning_part_actual_actual);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide2, menu);
		return true;
	}

}
