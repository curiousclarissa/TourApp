package com.example.android.tourapp;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by clarissajarem on 8/14/18.
 * contains an array of locations and their data
 */

public final class Locations {
    public static final Location[] LOCATIONS = {
            new Location(App.getContext().getResources().getString(R.string.location_u_heights),
                    App.getContext().getResources().getString(R.string.location_u_heights_phone),
                    App.getContext().getResources().getString(R.string.location_u_heights_url),
                    App.getContext().getResources().getString(R.string.location_u_heights_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location(App.getContext().getResources().getString(R.string.location_farmers_market),
                    App.getContext().getResources().getString(R.string.location_farmers_market_phone),
                    App.getContext().getResources().getString(R.string.location_farmers_market_url),
                    App.getContext().getResources().getString(R.string.location_farmers_market_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location(App.getContext().getResources().getString(R.string.location_taste_of_india),
                    App.getContext().getResources().getString(R.string.location_taste_of_india_phone),
                    App.getContext().getResources().getString(R.string.location_taste_of_india_url),
                    App.getContext().getResources().getString(R.string.location_taste_of_india_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location(App.getContext().getResources().getString(R.string.location_uw_quad),
                    App.getContext().getResources().getString(R.string.location_uw_quad_phone),
                    App.getContext().getResources().getString(R.string.location_uw_quad_url),
                    App.getContext().getResources().getString(R.string.location_uw_quad_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location(App.getContext().getResources().getString(R.string.location_university_branch_library),
                    App.getContext().getResources().getString(R.string.location_university_branch_library_phone),
                    App.getContext().getResources().getString(R.string.location_university_branch_library_url),
                    App.getContext().getResources().getString(R.string.location_university_branch_library_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location(App.getContext().getResources().getString(R.string.location_university_playground),
                    App.getContext().getResources().getString(R.string.location_seattle_parks_phone),
                    App.getContext().getResources().getString(R.string.location_university_playground_url),
                    App.getContext().getResources().getString(R.string.location_university_playground_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location(App.getContext().getResources().getString(R.string.location_burke_museum),
                    App.getContext().getResources().getString(R.string.location_burke_museum_phone),
                    App.getContext().getResources().getString(R.string.location_burke_museum_url),
                    App.getContext().getResources().getString(R.string.location_burke_museum_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location(App.getContext().getResources().getString(R.string.location_hotel_deca),
                    App.getContext().getResources().getString(R.string.location_data_none_closed),
                    App.getContext().getResources().getString(R.string.location_data_none_closed),
                    App.getContext().getResources().getString(R.string.location_hotel_deca_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location(App.getContext().getResources().getString(R.string.location_cowen_park),
                    App.getContext().getResources().getString(R.string.location_seattle_parks_phone),
                    App.getContext().getResources().getString(R.string.location_cowen_park_url),
                    App.getContext().getResources().getString(R.string.location_cowen_park_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location(App.getContext().getResources().getString(R.string.location_neptune_theatre),
                    App.getContext().getResources().getString(R.string.location_neptune_theatre_phone),
                    App.getContext().getResources().getString(R.string.location_neptune_theatre_url),
                    App.getContext().getResources().getString(R.string.location_neptune_theatre_address),
                    R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
    };
    Context context;

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
    public static int getPositionOfLocation(Location location) {
        int i = 0;
        for(; i<LOCATIONS.length; i++){
            if(LOCATIONS[i] == location){
                return i;

            }
        }
        return -1;
    }

}
