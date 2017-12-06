package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class VoteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        String [] s = new String[] {"Vote on this", "Vote on this", "Vote on this",
                "Vote on this", "Vote on this", "Vote on this", "Vote on this", "Vote on this"};
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
                Toast.makeText(VoteActivity.this, "Clicked item is "+s, Toast.LENGTH_LONG).show();
            } });
    }


    public void toFinal(View v){
        Intent i= new Intent(VoteActivity.this, VoteResultActivity.class);
        startActivity(i);
    }

}
