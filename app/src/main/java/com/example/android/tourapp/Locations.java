package com.example.android.tourapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by clarissajarem on 8/14/18.
 * contains an array of locations
 */

public final class Locations {
    private Locations(){}
    public static final Location[] LOCATIONS = {
            new Location("U-Heights", "206-527-4278", "www.uheightscenter.org","address", 0, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI))),
            new Location("Farmers Market", "206-632-5234", "https://seatlefarmersmarkets.org/markets/u-district", "address",0, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("Taste of India", "206-528-1575", "www.tasteofindiaseattle.com","address", 0, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("UW Quad", "206-543-2100", "www.washington.edu","address", 0, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_RESTAURANT)))
    };

}
