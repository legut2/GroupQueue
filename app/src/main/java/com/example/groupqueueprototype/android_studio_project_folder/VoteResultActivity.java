package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class VoteResultActivity extends Activity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_result);
        backButton  = (Button) findViewById(R.id.back_btn);
    }

    public void backToParty(View v) {
        Intent i= new Intent(VoteResultActivity.this, GuestViewActivity.class);
        startActivity(i);
    }
}