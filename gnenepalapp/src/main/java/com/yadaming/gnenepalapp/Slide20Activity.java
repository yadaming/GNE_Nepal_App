package com.yadaming.gnenepalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Slide20Activity extends Activity {
		
	public void choseBrown(View view) {
		ScoreKeeper.correct = ScoreKeeper.correct + 1;
		ImageView goldSL20;
		goldSL20 = (ImageView)findViewById(R.id.imageView2);
		goldSL20.setVisibility(View.VISIBLE);
	}
	
	public void nextMethodSL20(View view) {
		Intent intent = new Intent(this, Slide22Activity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide20);
		SoundModule SoundModule = new SoundModule(this);
		SoundModule.play(R.raw.vrp_slide20);
		
		//final ImageButton goldenstar;
		//goldenstar = (ImageButton) findViewById(R.id.imageView2);
		//goldenstar.setOnClickListener(new View.OnClickListener() {			
			//@Override
			//public void onClick(View v) {
				//goldenstar.setVisibility(View.VISIBLE);
				
			//}
		//});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide20, menu);
		return true;
	}

}
