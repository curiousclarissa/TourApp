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
            new Location("U-Heights", "206-527-4278", "www.uheightscenter.org", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location("Farmers Market", "206-632-5234", "https://seatlefarmersmarkets.org/markets/u-district", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("Taste of India", "206-528-1575", "www.tasteofindiaseattle.com", "address", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_RESTAURANT))),
            new Location("UW Quad", "206-543-2100", "www.washington.edu", "Pierce Ln", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location("University Branch Library", "206-684-4063", "www.spl.org/hours-and-locations/university-branch", "5009 Roosevelt Way NE", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location("University Playground", "206-684-4075", "www.seattle.gov/parks/find/parks/university-playground", "4745 9th Ave NE", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location("Burke Museum", "206-543-7907", "www.burkemuseum.org/", "1413 NE 45th St", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location("Hotel Deca", "none: closed", "none: closed", "4507 Brooklyn Ave NE", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_ARCHITECTURE))),
            new Location("Cowen Park", "206-684-4075", "www.seattle.gov/parks/find/parks/cowen-park", "5849 15th Ave NE", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_PARKSANDREC))),
            new Location("The Neptune Theatre", "206-682-1414", "www.stgpresents.org/neptune", "1303 NE 45th St", R.drawable.ic_place_black_24dp, new ArrayList<Integer>(Arrays.asList(Location.LOCATION_CATEGORY_POI, Location.LOCATION_CATEGORY_ARCHITECTURE))),
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
