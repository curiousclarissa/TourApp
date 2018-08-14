package com.example.android.tourapp;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/14/18.
 * defines the properties of a location
 */

public class Location {
   private String mName;
   private String mPhone;
   private String mWebsite;
    private String mAddress;
    private int mImageId;
   private ArrayList<Integer> mCategoryId = new ArrayList<>();

    /**
     * IntDef an annotation that defines a list of integers like an C-ENUM
     * This allows IDE to check numbers annotated with @LocationCategory to be members IntDef contains
     * Retention policy retains to source, doesn't get compiled
     */

   @IntDef({LOCATION_CATEGORY_POI, LOCATION_CATEGORY_RESTAURANT})
   @Retention(RetentionPolicy.SOURCE)
   public @interface LocationCategory{}
   public static final int LOCATION_CATEGORY_POI=0;
   public static final int LOCATION_CATEGORY_RESTAURANT=1;

    public Location(String name, String phone, String website, String address, int imageId, ArrayList<Integer> categoryId) {
        this.mName = name;
        this.mPhone = phone;
        this.mWebsite = website;
        this.mAddress = address;
        this.mImageId = imageId;
        this.mCategoryId = categoryId;
    }

    public String getName() {
        return mName;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageId() {
        return mImageId;
    }

    public ArrayList<Integer> getCategoryId() {
        return mCategoryId;
    }
}
