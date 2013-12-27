package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide23Activity extends Activity {

	public void zeroToTwo(View view) {
		ScoreKeeper.sl23 = 0;
		Intent intent = new Intent(this, Slide24Activity.class);
		startActivity(intent);
		finish();
	}

	public void threeToSix(View view) {
		ScoreKeeper.sl23 = 1;
		Intent intent = new Intent(this, Slide24Activity.class);
		startActivity(intent);
		finish();
	}

	public void moreThanSix(View view) {
		ScoreKeeper.sl23 = 2;
		Intent intent = new Intent(this, Slide24Activity.class);
		startActivity(intent);
		finish();
	}

	public void nextMethodSL23(View view) {
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide23question);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide23);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide23proper);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide23, menu);
		return true;
	}

}
