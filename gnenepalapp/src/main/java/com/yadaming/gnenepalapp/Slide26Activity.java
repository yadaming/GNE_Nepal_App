package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide26Activity extends Activity {
	public void nextMethodSL26(View view) {
		Intent intent = new Intent(this, Slide27Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide26);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide26);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide26, menu);
		return true;
	}

}
