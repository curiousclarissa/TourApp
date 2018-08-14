package com.example.android.tourapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by clarissajarem on 8/14/18.
 * contains an array of locations
 */

public final class Locations {
    public static final Location[] LOCATIONS = {
            new Location("U-Heights", "206-527-4278", "www.uheightscenter.org", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI))),
            new Location("Farmers Market", "206-632-5234", "https://seatlefarmersmarkets.org/markets/u-district", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("Taste of India", "206-528-1575", "www.tasteofindiaseattle.com", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("UW Quad", "206-543-2100", "www.washington.edu", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI)))
    };

    private Locations() {
    }

    /**
     *population array list of locations based on items with that category id
     **/

    public static ArrayList<Location> getLocationsInCategory(@Location.LocationCategory int category) {
        ArrayList<Location> locationsInCategory = new ArrayList<>();
        for (Location location: LOCATIONS) {
            if(location.getCategoryId().contains(category)){
                locationsInCategory.add(location);
            }
        }
        return locationsInCategory;
    }

}
