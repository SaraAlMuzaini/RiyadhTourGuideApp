package com.example.sarahahmad.riyadhtourguideapp;
/**
 * Created by sarahahmad on 8/18/17.
 */

public class ListItem {

    private static final int NO_DATA = -1;

    private int mName;

    private int mAddress;

    private int mImageResourceId = NO_DATA;

    private double mStars = NO_DATA;

    private int mWorkHour = NO_DATA;

    //restaurants
    public ListItem(int name, int address, int workH, int image, double stars) {
        mName = name;
        mAddress = address;
        mWorkHour = workH;
        mImageResourceId = image;
        mStars = stars;
    }

    //place to visit
    public ListItem(int name, int address, int workH) {
        mName = name;
        mAddress = address;
        mWorkHour = workH;
    }

    //malls
    public ListItem(int name, int address, int workH, int image) {
        mName = name;
        mAddress = address;
        mWorkHour = workH;
        mImageResourceId = image;
    }

    //hotels
    public ListItem(int name, int address, double stars, int image) {
        mName = name;
        mAddress = address;
        mStars = stars;
        mImageResourceId = image;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public float getStars() {
        return (float) mStars;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getName() {
        return mName;
    }

    public int getWorkHour() {
        return mWorkHour;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_DATA;
    }

    public boolean hasStars() {
        return mStars != NO_DATA;
    }

    public boolean hasWorkHour() {
        return mWorkHour != NO_DATA;
    }
}
