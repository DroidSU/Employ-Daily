package com.brixham.employdaily.models;

import com.google.gson.annotations.SerializedName;

public class LoginRequestModel {
    @SerializedName("M_No")
    public String mobileNumber;
    @SerializedName("Password")
    public String password;

    public LoginRequestModel(String mobileNumber, String password) {
        this.mobileNumber = mobileNumber;
        this.password = password;
    }
}
