package com.example.android.tourapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/14/18.
 * defines the properties of a location
 */

public class Location implements Parcelable{
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
// constructor A that creates the location
    public Location(String name, String phone, String website, String address, int imageId, ArrayList<Integer> categoryId) {
        this.mName = name;
        this.mPhone = phone;
        this.mWebsite = website;
        this.mAddress = address;
        this.mImageId = imageId;
        this.mCategoryId = categoryId;
    }
//parcel constructor
    protected Location(Parcel in) {
        mName = in.readString();
        mPhone = in.readString();
        mWebsite = in.readString();
        mAddress = in.readString();
        mImageId = in.readInt();
        mCategoryId = in.readArrayList(Location.class.getClassLoader());
    }
//puts data into the parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mPhone);
        dest.writeString(mWebsite);
        dest.writeString(mAddress);
        dest.writeInt(mImageId);
        dest.writeList(mCategoryId);
    }
    //describeContents needs to always return 0
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * boilerplate code that creates an inner class of Creator that will create a location from a parcel and an array of locations
     */
    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

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
