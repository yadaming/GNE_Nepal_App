package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide22Activity extends Activity {
	
	public void nextMethodSL22(View view) {
		Intent intent = new Intent(this, Slide23Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide22);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide22);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide22, menu);
		return true;
	}

}
