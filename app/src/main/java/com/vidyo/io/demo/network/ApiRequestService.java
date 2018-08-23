package com.vidyo.io.demo.network;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Summary: Service Layer class for api calling
 * @author R Systems
 * @date 20.08.2018
 */
public class ApiRequestService {
    private Retrofit retrofit;
    private AppService restApis;

    /**
     * Using constructor initialize retrofit instance
     */
    public ApiRequestService() {
        retrofit = RetrofitClient.getRetroInstance();
        restApis = retrofit.create(AppService.class);
    }

    /**
     * Get access token from server
     */
    public void getAccessToken(String username, Observer observer) {
        restApis.getAccessToken(username)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Observer) observer);
    }
}
