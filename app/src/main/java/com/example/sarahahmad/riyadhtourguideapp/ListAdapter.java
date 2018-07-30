package com.example.sarahahmad.riyadhtourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sarahahmad on 8/18/17.
 */

public class ListAdapter extends ArrayAdapter<ListItem> {

    private static final String LOG_TAG = ListAdapter.class.getSimpleName();

    public ListAdapter(Activity context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }
        ListItem currentListItem = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // set this text on the name TextView
        nameTextView.setText(currentListItem.getName());

        // Find the TextView in the item_list.xml layout with the ID address
        TextView addressTextview = (TextView) listItemView.findViewById(R.id.address);
        // set this text on the address TextView
        addressTextview.setText(currentListItem.getAddress());

        // Find the TextView in the item_list.xml layout with the ID work_hour
        TextView workHTextview = (TextView) listItemView.findViewById(R.id.work_hour);
        // set this text on the workHTextview
        if (currentListItem.hasWorkHour()) {
            workHTextview.setText(currentListItem.getWorkHour());
            workHTextview.setVisibility(View.VISIBLE);
        } else
            workHTextview.setVisibility(View.GONE);

        RatingBar stars = (RatingBar) listItemView.findViewById(R.id.stars);
        // set the Stars to stars
        if (currentListItem.hasStars()) {
            stars.setRating(currentListItem.getStars());
            stars.setVisibility(View.VISIBLE);
        } else
            stars.setVisibility(View.GONE);

        // Find the ImageView in the item_list.xml layout with the ID image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // set the image to imageView
        if (currentListItem.hasImage()) {
            imageView.setImageResource(currentListItem.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);

        // Return the whole list item layout
        return listItemView;
    }
}

