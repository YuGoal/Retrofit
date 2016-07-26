package com.wjxl.retrofitdemo;

import org.json.JSONObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;


/**
 * Created by lenovo on 2016/7/20.
 */
public interface gitapi {

    @POST("login!login18.action")
    Call<Login> getFeed(@QueryMap Map<String, String> options);

}
