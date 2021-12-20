package com.example.a18078281_nguyenhuuthang_dhktpm14ctt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    ApiService apiService = new Retrofit.Builder()
            .baseUrl("https://61c024ad33f24c001782314c.mockapi.io/user/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    @GET("taikhoan/{id}")
    Call<User> getUserById(@Path("id") String id);

    @GET("taikhoan")
    Call<List<User>> getTaiKhoan();
//
//    @POST("bill")
//    Call<Bill> addBill(@Body Bill bill);
//
//    @PUT("bill/{id}")
//    Call<Bill> update(@Path("id") String id, @Body Bill bill);
//
//    @DELETE("bill/{id}")
//    Call<Bill> delete(@Path("id") String id);
}
