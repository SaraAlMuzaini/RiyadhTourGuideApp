package com.example.sarahahmad.riyadhtourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView that shows the Restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants_textview);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent restIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restIntent);
            }
        });

        // Find the TextView that shows the Hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels_textview);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hotels TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, Hotels.class);
                startActivity(hotelsIntent);
            }
        });

        // Find the TextView that shows the Malls category
        TextView malls = (TextView) findViewById(R.id.malls_textview);

        // Set a click listener on that View
        malls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Malls TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent mallsIntent = new Intent(MainActivity.this, Malls.class);
                startActivity(mallsIntent);
            }
        });

        // Find the TextView that shows the ListItem to Visit category
        TextView placeToVisit = (TextView) findViewById(R.id.place_to_visit_textview);

        // Set a click listener on that View
        placeToVisit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ListItem to Visit TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent placeToVisitIntent = new Intent(MainActivity.this, PlaceToVisit.class);
                startActivity(placeToVisitIntent);
            }
        });

    }
}
