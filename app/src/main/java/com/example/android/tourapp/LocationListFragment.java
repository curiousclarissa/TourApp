package com.example.android.tourapp;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationListFragment extends Fragment {


    public LocationListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_location_list, container, false);
        final ArrayList<Location> filteredLocations = Locations.getLocationsInCategory(getArguments().getInt("category position", Location.LOCATION_CATEGORY_POI));
        LocationAdapter adapter = new LocationAdapter(getContext(), filteredLocations, 0);
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // launch an intent
                Intent launchIntent = new Intent(getContext(), LocationDetailsActivity.class);
                launchIntent.putExtra("location position", (filteredLocations.get(position)));
                startActivity(launchIntent);
            }
        });
        return rootView;
    }
    public static Fragment createNewInstance(int position) {
        Fragment fragment = new LocationListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("category position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

}
