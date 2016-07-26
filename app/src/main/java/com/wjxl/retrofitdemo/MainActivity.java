package com.wjxl.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wjxl.retrofitdemo.JsonConverter.DecodeConverterFactory;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    TextView tv_user;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_user = (TextView) findViewById(R.id.tv_user);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

//        gitapi service = retrofit.create(gitapi.class);
//        Call<gitmodel> model = service.getFeed("YuGoal");
//        model.enqueue(new Callback<gitmodel>() {
//            @Override
//            public void onResponse(Response<gitmodel> response, Retrofit retrofit) {
//                Log.d(TAG, "onResponse: "+response.body().toString());
//                Log.d(TAG, "avatar_url: "+response.body().getAvatar_url());
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                Log.d(TAG, "onFailure: "+t.toString());
//            }
//        });
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            Map<String,String> map = new HashMap<>();
            map.put("phoneno","18674877803");
            map.put("pwd","123");

            OkHttpClient client = new OkHttpClient().newBuilder()
                    .addInterceptor(new MyInterceptors())
                    .build();
            Retrofit retrofit = new Retrofit.Builder()
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl("https://wuyetongxin.cn/portalws/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            gitapi service = retrofit.create(gitapi.class);
            Call<Login> model = service.getFeed(map);
            model.enqueue(new Callback<Login>() {
                @Override
                public void onResponse(Call<Login> call, Response<Login> response) {
                    Log.d(TAG, "onResponse: "+response.body().toString());
                }

                @Override
                public void onFailure(Call<Login> call, Throwable t) {
                    Log.d(TAG, "onFailure: ");
                }
            });
        }
    }
}