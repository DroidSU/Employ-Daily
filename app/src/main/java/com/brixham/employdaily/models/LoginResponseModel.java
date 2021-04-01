package com.brixham.employdaily.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseModel extends BaseObservable implements Parcelable {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("data")
    @Expose
    private LoginResponseData data;

    public final static Creator<LoginResponseModel> CREATOR = new Creator<LoginResponseModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public LoginResponseModel createFromParcel(android.os.Parcel in) {
            return new LoginResponseModel(in);
        }

        public LoginResponseModel[] newArray(int size) {
            return (new LoginResponseModel[size]);
        }

    }
            ;

    protected LoginResponseModel(Parcel in) {
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((boolean) in.readValue((Boolean.class.getClassLoader())));
        this.data = ((LoginResponseData) in.readValue((LoginResponseData.class.getClassLoader())));
    }

    public LoginResponseModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LoginResponseData getData() {
        return data;
    }

    public void setData(LoginResponseData data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(message);
        dest.writeValue(status);
        dest.writeValue(data);
    }

    public int describeContents() {
        return 0;
    }
}
