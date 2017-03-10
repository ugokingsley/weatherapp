package com.android.daetaweather.service;

import com.android.daetaweather.data.Channel;

/**
 * Created by ugochukwu on 3/10/17.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
