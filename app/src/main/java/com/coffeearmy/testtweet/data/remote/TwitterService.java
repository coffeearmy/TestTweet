package com.coffeearmy.testtweet.data.remote;


import com.coffeearmy.testtweet.data.remote.model.AuthResponse;
import com.coffeearmy.testtweet.data.remote.model.Tweet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.RequestBody;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface TwitterService {
    String SERVICE_ENDPOINT = "https://api.twitter.com";
    String CONTENT_TYPE = "application/x-www-form-urlencoded;charset=UTF-8";

    @POST("/oauth2/token")
    Observable<AuthResponse> authUser(@Header("Authorization") String authorization,
                                      @Header("Content-Length") String bodyLength,
                                      @Header("Content-Type") String contentType,
                                      @Body RequestBody grantType);

    @GET("/1.1/search/tweets.json")
    Observable<Tweet> search(@Query("q") String searchQuery,
                             @Header("Authorization") String authorization,
                             @Header("Content-Type") String contentType);

    /********
     * Helper class that sets up a new services
     *******/
    class Creator {

        public static TwitterService newTwitterService() {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(TwitterService.SERVICE_ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(TwitterService.class);
        }
    }
}
