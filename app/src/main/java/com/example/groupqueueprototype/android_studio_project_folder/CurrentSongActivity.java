package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentSongActivity extends Activity {

    private Button previousSong;
    private Button nextSong;
    private Button playSong;
    private MediaPlayer musicPlayer;
    private SeekBar musicProgress;

    protected View.OnClickListener previousSongListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Play the previous song on the list, not yet implemented.
        }
    };

    protected View.OnClickListener nextSongListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Play the next song on the list, not yet implemented.
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        playSong = (Button) findViewById (R.id.playSong);

        musicPlayer = MediaPlayer.create(CurrentSongActivity.this, R.raw.walk_on_water);

        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(musicPlayer.isPlaying()){
                    musicPlayer.pause();
                } else {
                    musicPlayer.start();
                }
            }
        });


        String [] s = new String[] {"Song1", "Song2", "Song3",
                "Song4", "Song5", "Song6", "Song7", "Song8"};
        ListView lv = (ListView)findViewById(R.id.songList);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, s));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                ListView lv = (ListView) arg0;
                TextView tv = (TextView) lv.getChildAt(arg2);
                String s = tv.getText().toString();
                Toast.makeText(CurrentSongActivity.this, "Clicked item is "+s, Toast.LENGTH_LONG).show();
            } });
    }

    public void goVoting(View v){
        Intent intent = new Intent(this, VoteActivity.class);
        startActivity(intent);
    }


}
