package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GuestViewActivity extends Activity {

    private EditText edt;
    private TextView myTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_view);

    }

    public void goProposing(View v){
        Intent intent = new Intent(this, CurrentSongActivity.class);
        startActivity(intent);
    }

    public void addText(View v){
        edt = (EditText) findViewById(R.id.guest_edt);
        String content = "Me: ";
        content += edt.getText().toString(); //gets you the contents of edit text
        myTxtView = (TextView) findViewById(R.id.guest_text);
        myTxtView.setText(content);
    }
}
