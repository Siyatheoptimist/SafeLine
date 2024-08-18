package com.android.sheguard.api;

import com.android.sheguard.model.NotificationSenderModel;
import com.android.sheguard.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

        @Headers({
                        "Content-Type:application/json",
                        "Authorization:key= AIzaSyBcBRl7GVL0u0ko-kiWnOcnIBlcNRIUuB0" // replace with your own
                                                                                     // authorization key which you get
                                                                                     // from Firbase
        })

        @POST("fcm/send")
        Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
