package com.android.daetaweather.service;

import android.os.AsyncTask;

/**
 * Created by ugochukwu on 3/10/17.
 */

public class YahooWeatherService {

    private WeatherServiceCallback callback;
    private String location;


    public YahooWeatherService(WeatherServiceCallback callback) {
        this.callback = callback;
    }

    public String getLocation() {
        return location;
    }


    public void refreshWeather(String location){

        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }
        }.execute(location);
    }
}
