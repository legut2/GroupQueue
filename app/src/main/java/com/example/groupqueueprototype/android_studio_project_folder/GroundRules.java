package com.example.groupqueueprototype.android_studio_project_folder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroundRules extends AppCompatActivity {
    private Button go;
    private Button cancel;

    protected View.OnClickListener goListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code to make party goes here
            goHostView();

        }
    };
    protected View.OnClickListener cancelListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Return to previous screen
            finish();
    }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_rules);
        go = (Button) findViewById(R.id.go_button);
        go.setOnClickListener(goListener);
        cancel = (Button) findViewById(R.id.cancel_button);
        cancel.setOnClickListener(cancelListener);
    }

    public void goHostView() {
        Intent intent = new Intent(this, HostViewActivity.class);
        startActivity(intent);
    }
}
