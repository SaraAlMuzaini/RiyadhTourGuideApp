package com.example.sarahahmad.riyadhtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceToVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        final ArrayList<ListItem> malls = new ArrayList<ListItem>();
        //public ListItem(int name, int address, int workH )
        malls.add(new ListItem(R.string.kingdomCentreTower, R.string.kingdomCentreTower_add, R.string.kingdomCentreTower_WH));
        malls.add(new ListItem(R.string.nationalMuseum, R.string.nationalMuseum_add, R.string.nationalMuseum_WH));
        malls.add(new ListItem(R.string.masmakFort, R.string.masmakFort_add, R.string.masmakFort_WH));
        malls.add(new ListItem(R.string.riyadhZoo, R.string.riyadhZoo_add, R.string.riyadhZoo_WH));

        ListAdapter adapter = new ListAdapter(this, malls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
