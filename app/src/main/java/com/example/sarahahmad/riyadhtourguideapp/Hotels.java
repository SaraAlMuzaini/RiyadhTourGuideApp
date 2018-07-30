package com.example.sarahahmad.riyadhtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        final ArrayList<ListItem> hotels = new ArrayList<ListItem>();
        // public ListItem(int name, int address,  double stars, int image)
        hotels.add(new ListItem(R.string.interContinentalHot, R.string.interContinentalHot_add, 5.0, R.drawable.intercontinental));
        hotels.add(new ListItem(R.string.faisaliahHot, R.string.faisaliahHot_add, 5.0, R.drawable.alfaisaliah));
        hotels.add(new ListItem(R.string.saharaAirportHot, R.string.saharaAirportHot_add, 4.0, R.drawable.saharaairporthotel));
        hotels.add(new ListItem(R.string.olayaHot, R.string.olayaHot_add, 3.0, R.drawable.olayahotel));

        ListAdapter adapter = new ListAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
