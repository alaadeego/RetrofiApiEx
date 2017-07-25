package com.example.alaa.retrofiapiex;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ala'a on 7/21/2017.
 */

public interface ApiInterface {

    @GET("getcalories.php")
    Call<List<calories>> getCaloriesInfo(@Query("item_type") String item_type);
}
