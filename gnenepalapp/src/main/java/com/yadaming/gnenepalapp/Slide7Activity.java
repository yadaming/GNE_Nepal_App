package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide7Activity extends Activity {
	
	public void nextMethodSL7(View view) {
		Intent intent = new Intent(this, Slide8Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide7);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide7);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide7, menu);
		return true;
	}

}
