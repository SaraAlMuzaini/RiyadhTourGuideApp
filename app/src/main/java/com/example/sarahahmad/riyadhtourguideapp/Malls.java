package com.example.sarahahmad.riyadhtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        final ArrayList<ListItem> malls = new ArrayList<ListItem>();
        //public ListItem((int name, int address, int workH, int image)
        malls.add(new ListItem(R.string.granadaMal, R.string.granadaMal_add, R.string.workHourMall, R.drawable.granada_center));
        malls.add(new ListItem(R.string.nakheelMal, R.string.nakheelMal_add, R.string.workHourMall, R.drawable.nakheel_mall));
        malls.add(new ListItem(R.string.panoramaMal, R.string.panoramaMal_add, R.string.workHourMall, R.drawable.panorama_mall));
        malls.add(new ListItem(R.string.riyadhMal, R.string.riyadhMal_add, R.string.workHourMall, R.drawable.riyadh_gallery_mall));

        ListAdapter adapter = new ListAdapter(this, malls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
