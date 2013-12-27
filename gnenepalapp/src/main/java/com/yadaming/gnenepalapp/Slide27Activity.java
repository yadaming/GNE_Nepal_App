package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Slide27Activity extends Activity {
	public void nextMethodSL27(View view) {
		Intent intent = new Intent(this, Slide28Activity.class);
		startActivity(intent);
		finish();
	}
	public void choseRight(View view) {
		ImageButton starButton;
		starButton = (ImageButton) findViewById(R.id.imageButton1Star);
		starButton.setVisibility(View.VISIBLE);
		ScoreKeeper.correct = ScoreKeeper.correct + 1;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide27);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide27, menu);
		return true;
	}

}
