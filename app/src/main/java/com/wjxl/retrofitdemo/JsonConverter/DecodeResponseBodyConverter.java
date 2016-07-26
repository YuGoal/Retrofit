package com.wjxl.retrofitdemo.JsonConverter;

import android.annotation.SuppressLint;

import com.google.gson.TypeAdapter;
import com.wjxl.retrofitdemo.Base64Decoder;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by lenovo on 2016/7/26.
 */
public class DecodeResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final String TAG = "DecodeResponseBodyConverter";
    private final TypeAdapter<T> adapter;

    DecodeResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
    }
    @SuppressLint("LongLogTag")
    @Override
    public T convert(ResponseBody value) throws IOException {
        return adapter.fromJson(Base64Decoder.decode(value.string()));
    }
}

