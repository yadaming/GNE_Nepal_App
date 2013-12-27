package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Slide29Activity extends Activity {
	
	SoundModule SoundModule = new SoundModule(this);
	
	public void boy(View view) {
		SoundModule.play(R.raw.vrp_slide29_updatedboy);
		ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
	}
	
	public void old(View view) {
		SoundModule.play(R.raw.vrp_slide29_updatedoldwomen);
		ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
	}
	
	public void man(View view) {
		SoundModule.play(R.raw.vrp_slide29_updatedmen);
		ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
	}
	
	public void girl(View view) {
		SoundModule.play(R.raw.vrp_slide29_updatedsmallgirl);
		ScoreKeeper.incorrect = ScoreKeeper.incorrect + 1;
	}
	
	public void nextMethodSL29(View view) {
		Intent intent = new Intent(this, Slide30Activity.class);
		startActivity(intent);
		finish();
	}
	
	public void right1SL29(View view) {
		ImageView SL29gold1;
		SL29gold1 = (ImageView) findViewById(R.id.imageView6);
		SL29gold1.setVisibility(View.VISIBLE);
		ScoreKeeper.correct = ScoreKeeper.correct + 1;
		SoundModule.play(R.raw.vrp_slide29_updatedproperactual);
	}
	
	public void right2SL29(View view) {
		ImageView SL29gold2;
		SL29gold2 = (ImageView) findViewById(R.id.imageView5);
		SL29gold2.setVisibility(View.VISIBLE);
		ScoreKeeper.correct = ScoreKeeper.correct + 1;
		SoundModule.play(R.raw.vrp_slide29_updatedproperactual);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide29);
		SoundModule.play(R.raw.vrp_slide29_updated);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide29, menu);
		return true;
	}

}
