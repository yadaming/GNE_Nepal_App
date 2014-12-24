package com.yadaming.gnenepalapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SoundModule {
    Context c;
    public static boolean playing;

    // create a private MediaPlayer instance
    private static MediaPlayer mMediaPlayer;

    public SoundModule(Context context) {
        c = context;
    }

    public void play(int soundToPlay) {
        playing = true;
        //MediaPlayer mMediaPlayer = MediaPlayer.create(c, soundToPlay);
        mMediaPlayer = MediaPlayer.create(c, soundToPlay);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                playing = false;
            }
        });
    }

    public void stop(int soundToPlay)
    {
        mMediaPlayer.stop();
        playing = false;
    }

}
