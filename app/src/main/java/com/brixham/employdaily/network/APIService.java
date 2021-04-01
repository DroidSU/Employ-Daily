package com.brixham.employdaily.network;

import com.brixham.employdaily.models.LoginRequestModel;
import com.brixham.employdaily.models.LoginResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("Registration/Logincheck")
    Call<LoginResponseModel> loginUser(@Body LoginRequestModel loginRequestModel);
}
