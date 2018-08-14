package com.example.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {


    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    public static Fragment createNewInstance(Location location) {
        return new LocationFragment();
    }
    public static Fragment createNewInstance(int position) {
        Fragment fragment = new LocationFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("location position", position);
        fragment.setArguments(bundle);
        return fragment;
    }
}
