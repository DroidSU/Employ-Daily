package com.brixham.employdaily.repositories;

import com.brixham.employdaily.models.LoginResponseModel;
import com.brixham.employdaily.network.APIService;
import com.brixham.employdaily.utilities.ConstantsManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginRepository {
    private static LoginRepository instance;
    private APIService apiService;

    public static LoginRepository getInstance() {
        if (instance == null) {
            instance = new LoginRepository();
        }
        return instance;
    }

    public void loginUser(String mobileNumber, String password){
    }
}
