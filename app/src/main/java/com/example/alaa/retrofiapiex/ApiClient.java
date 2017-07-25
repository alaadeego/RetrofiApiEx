package com.example.alaa.retrofiapiex;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ala'a on 7/21/2017.
 */

public class ApiClient {
    public static final String Base_URL="http://192.168.1.107/";
    public  static Retrofit retrofit;

    public  static Retrofit getApiClient()
    {

        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(Base_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
