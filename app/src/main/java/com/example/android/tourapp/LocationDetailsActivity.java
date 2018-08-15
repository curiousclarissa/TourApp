package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        // Get the {@link Word} object located at this position in the list
        final Location currentLocation = Locations.LOCATIONS[getIntent().getIntExtra("location position", 0)];

        //Find the ImageView for the location
        ImageView locationImageView = findViewById(R.id.location_image_view);
        //set resource for imageView
        locationImageView.setImageResource(currentLocation.getImageId());
        //Find the textivew for location name
        TextView locationNameView = findViewById(R.id.location_name_text_view);
        locationNameView.setText(currentLocation.getName());
        //Find the textview for location name
        TextView locationAddressView = findViewById(R.id.location_address_text_view);
        locationAddressView.setText(currentLocation.getAddress());
        //Find the textview for location name
        TextView locationPhoneView = findViewById(R.id.location_phone_text_view);
        locationPhoneView.setText(currentLocation.getPhone());
        
        //Find the textiew for location name
        TextView locationWebsiteView = findViewById(R.id.location_website_text_view);
        locationWebsiteView.setText(currentLocation.getWebsite());
    }
}
