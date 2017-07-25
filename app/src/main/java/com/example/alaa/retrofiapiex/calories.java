package com.example.alaa.retrofiapiex;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ala'a on 7/21/2017.
 */

public class calories {
    @SerializedName("name")
    private  String Name;

    @SerializedName("image")
    private  String Image;

    @SerializedName("calories")
    private  String Calories;

    public String getName() {
        return Name;
    }
    public String getImage() {
        return Image;
    }

    public String getCalories() {
        return Calories;
    }

}
