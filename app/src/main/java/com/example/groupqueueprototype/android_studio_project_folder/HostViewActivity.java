package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HostViewActivity extends Activity {

    MediaPlayer musicPlayer;
    private Button playSong;
    private EditText edt;
    private TextView myTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_view);
        musicPlayer = MediaPlayer.create(getApplicationContext(), R.raw.walk_on_water);

        playSong = (Button) findViewById (R.id.play_btn);

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

        /*
        final EditText edittext = (EditText) findViewById(R.id.host_edt);
        edittext.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    Toast.makeText(HostViewActivity.this, edittext.getText(), Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
        */
    }

    public void addText(View v){
        edt = (EditText) findViewById(R.id.host_edt);
        String content = "Me: ";
        content += edt.getText().toString(); //gets you the contents of edit text
        myTxtView = (TextView) findViewById(R.id.host_text);
        myTxtView.setText(content);
    }




}
