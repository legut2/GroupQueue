package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuestViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_view);

    }

    public void goProposing(View v){
        Intent intent = new Intent(this, CurrentSongActivity.class);
        startActivity(intent);
    }
}
