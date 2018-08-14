package com.example.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


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
        LocationAdapter adapter = new LocationAdapter(getContext(), Locations.getLocationsInCategory(getArguments().getInt("category position", Location.LOCATION_CATEGORY_POI)), 0);
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
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
