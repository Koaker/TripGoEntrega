package com.example.a4july.tripgo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WalmartService {

    @GET("search?query=ipod&format=json&apiKey=nhzsnczmjmw4vu74m9p9z5kn")
    Call<Product> listProduct();
}
