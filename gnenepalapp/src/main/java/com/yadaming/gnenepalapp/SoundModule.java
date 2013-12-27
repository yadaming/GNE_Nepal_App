package com.yadaming.gnenepalapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SoundModule {
	Context c;

	public SoundModule(Context context) {
		c = context;
	}
	
	public int onCompletion() {
		return 0;
	}

	public void play(int soundToPlay) {
		MediaPlayer mMediaPlayer = MediaPlayer.create(c, soundToPlay);
		mMediaPlayer.start();
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {	
			public void onComplete(MediaPlayer mp) {
				SoundModule.this.onCompletion();		
			}

			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
