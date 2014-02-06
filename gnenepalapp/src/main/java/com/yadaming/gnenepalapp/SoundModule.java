package com.yadaming.gnenepalapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SoundModule {
	Context c;
    public boolean playing;

	public SoundModule(Context context) {
		c = context;
	}

	public void play(int soundToPlay) {
        playing = true;
        MediaPlayer mMediaPlayer = MediaPlayer.create(c, soundToPlay);
		mMediaPlayer.start();
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {	

			@Override
			public void onCompletion(MediaPlayer mp) {
				playing = false;
			}
		});
	}

}
