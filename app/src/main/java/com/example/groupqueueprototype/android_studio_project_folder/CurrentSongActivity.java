package com.example.groupqueueprototype.android_studio_project_folder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentSongActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        String [] s = new String[] {"Jeff's Halloween", "Party Two", "Hello Three",
                "Hello Four", "Hello Five", "Hello Six", "Hello Seven", "Hello Eight"};
        ListView lv = (ListView)findViewById(R.id.songList);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, s));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                ListView lv = (ListView) arg0;
                TextView tv = (TextView) lv.getChildAt(arg2);
                String s = tv.getText().toString();
                Toast.makeText(CurrentSongActivity.this, "Clicked item is "+s, Toast.LENGTH_LONG).show();
            } });
    }


}
