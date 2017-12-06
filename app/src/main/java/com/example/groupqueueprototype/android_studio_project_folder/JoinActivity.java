package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JoinActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

    public void onClickJoin(View v){
        Intent intent = new Intent(this, GuestViewActivity.class);
        startActivity(intent);
    }
    public void onClickLookForOthers(View v){
        finish();
    }
}
