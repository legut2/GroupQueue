package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class HostViewActivity extends Activity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_view);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.walk_on_water);

        mediaPlayer.start();
    }
}
