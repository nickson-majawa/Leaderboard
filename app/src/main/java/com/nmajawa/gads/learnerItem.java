package com.nmajawa.gads;

public class learnerItem {
    private String  mName;
    private int mHours;
    private String mCountry;

    public learnerItem( String name, int hours, String country) {
        mName = name;
        mHours = hours;
        mCountry = country;
    }


    public  String getName() {
        return mName;
    }
    public int getHours() {
        return mHours;
    }
    public  String getCountry() {
        return mCountry;
    }


}
