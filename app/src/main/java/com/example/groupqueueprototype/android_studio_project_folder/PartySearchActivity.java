package com.example.groupqueueprototype.android_studio_project_folder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PartySearchActivity extends AppCompatActivity  {
    private Button createNewParty;
    private Button joinParty;
    private Button partyInfo;
    protected View.OnClickListener createPartyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goCreateParty();
        }
    };
    protected View.OnClickListener joinPartyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goJoinParty();
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
        joinParty = (Button) findViewById(R.id.join);
        String [] s = new String[] {"Jeff's Halloween", "Party Two", "Hello Three",
                "Hello Four", "Hello Five", "Hello Six", "Hello Seven", "Hello Eight"};
        ListView lv = (ListView)findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, s));
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                ListView lv = (ListView) arg0;
                TextView tv = (TextView) lv.getChildAt(arg2);
                String s = tv.getText().toString();
                Toast.makeText(PartySearchActivity.this, "Clicked item is "+s, Toast.LENGTH_LONG).show();
            } });
        //partyInfo = (Button) findViewById(R.id.topButton);
        createNewParty.setOnClickListener(createPartyListener);
        joinParty.setOnClickListener(joinPartyListener);
        //partyInfo.setOnClickListener(partyInfoListener);
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

    public void goJoinParty() {
        Intent intent = new Intent(this, JoinActivity.class);
        startActivity(intent);
    }
}
