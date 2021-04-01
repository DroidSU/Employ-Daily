package com.brixham.employdaily.viewmodels;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.brixham.employdaily.models.LoginResponseModel;

public class LoginViewModel extends ViewModel {
    /**
     * Two way bind-able fields
     */
    public MutableLiveData<String> emailAddress = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<String> mobileNumber = new MutableLiveData<>();
    private MutableLiveData<LoginResponseModel> userMutableLiveData;

    public MutableLiveData<LoginResponseModel> getUser() {
        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;

    }

    public void onClick(View view) {

    }
}
