package com.wjxl.retrofitdemo;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by lenovo on 2016/7/20.
 */
public interface gitapipost {

    //异步请求
    @POST("login!login18.action")
    public Observable<Login> loginPost(@QueryMap Map<String, String> options);

}
