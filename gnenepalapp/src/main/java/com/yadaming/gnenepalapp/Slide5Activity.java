package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Slide5Activity extends Activity {
	
	public void yesMethodSL5(View view) {
		ScoreKeeper.sl5 = 2;
		Intent intent = new Intent(this, Slide6Activity.class);
		startActivity(intent);
		finish();
	}
	
	public void noMethodSL5(View view) {
		ScoreKeeper.sl5 = 1;
		Intent intent = new Intent(this, Slide6Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide5);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide5_1edited);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide5, menu);
		return true;
	}

}
