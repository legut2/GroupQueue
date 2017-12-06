package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by highlandevil on 11/30/17.
 */

public class VoteResultActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_result);
    }

    public void toView(View v) {
        Intent i= new Intent(VoteResultActivity.this, GuestViewActivity.class);
        startActivity(i);
    }
}
