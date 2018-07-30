package com.example.sarahahmad.riyadhtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        final ArrayList<ListItem> malls = new ArrayList<ListItem>();
        //public ListItem(int name, int address, int workH, int image, double stars)
        malls.add(new ListItem(R.string.fairouzRes, R.string.fairouzRes_add, R.string.workHourRes, R.drawable.fairouz_garden, 4.0));
        malls.add(new ListItem(R.string.MajlisRes, R.string.MajlisRes_add, R.string.workHourResam, R.drawable.almajlis_alkhaleeji, 4.3));
        malls.add(new ListItem(R.string.ShurfaRes, R.string.ShurfaRes_add, R.string.workHourResam, R.drawable.alshorfa_restaurant, 3.0));
        malls.add(new ListItem(R.string.NajdRes, R.string.NajdRes_add, R.string.workHourRes, R.drawable.najdiah_rest, 3.0));

        ListAdapter adapter = new ListAdapter(this, malls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
