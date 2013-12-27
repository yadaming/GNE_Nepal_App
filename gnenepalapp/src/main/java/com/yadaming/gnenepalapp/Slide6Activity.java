package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide6Activity extends Activity {
	
	public void yesMethodSL6(View view) {
		ScoreKeeper.sl6 = 2;
		Intent intent = new Intent(this, Slide7Activity.class);
		startActivity(intent);
		finish();
	}
	
	public void noMethodSL6(View view) {
		ScoreKeeper.sl6 = 1;
		Intent intent = new Intent(this, Slide7Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide6);
		
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide6_1edited);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide6, menu);
		return true;
	}

}
