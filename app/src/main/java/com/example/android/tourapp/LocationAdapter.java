package com.example.android.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/14/18.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0 , locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the ImageView for the location
        ImageView locationImageView = listItemView.findViewById(R.id.location_image_view);
        //set resource for imageView
        locationImageView.setImageResource(currentLocation.getImageId());
        //Find the textivew for location name
        TextView locationNameView = listItemView.findViewById(R.id.location_name_text_view);
        locationNameView.setText(currentLocation.getName());
        //Find the textview for location name
        TextView locationAddressView = listItemView.findViewById(R.id.location_address_text_view);
        locationAddressView.setText(currentLocation.getAddress());
        //Find the textview for location name
        TextView locationPhoneView = listItemView.findViewById(R.id.location_phone_text_view);
        locationPhoneView.setText(currentLocation.getPhone());
        //Find the textiew for location name
        TextView locationWebsiteView = listItemView.findViewById(R.id.location_website_text_view);
        locationWebsiteView.setText(currentLocation.getWebsite());
        return listItemView;
    }

}
