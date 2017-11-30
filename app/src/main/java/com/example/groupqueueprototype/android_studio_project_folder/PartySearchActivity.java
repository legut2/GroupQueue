package com.example.groupqueueprototype.android_studio_project_folder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class PartySearchActivity extends AppCompatActivity  {
    private Button createNewParty;
    private Button partyInfo;
    protected View.OnClickListener createPartyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goCreateParty();
        }
    };
    protected View.OnClickListener partyInfoListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goToPartyInfo();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.party_search);
        createNewParty = (Button) findViewById(R.id.createParty);
        partyInfo = (Button) findViewById(R.id.topButton);
        createNewParty.setOnClickListener(createPartyListener);
        partyInfo.setOnClickListener(partyInfoListener);
    }
    public void goToPartyInfo() {
        //Intent intent = new Intent(this, PartySearchActivity.class);
        //startActivity(intent);
        partyInfo.setText("You touched this button!");
    }
    public void goCreateParty() {
        Intent intent = new Intent(this, GroundRules.class);
        startActivity(intent);
    }
}
