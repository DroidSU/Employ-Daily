package com.brixham.employdaily.models;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseData implements Parcelable {
    @SerializedName("pk_Registerid")
    @Expose
    private int pkRegisterid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("m_No")
    @Expose
    private String mNo;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("address")
    @Expose
    private String address;
    public final static Creator<LoginResponseData> CREATOR = new Creator<LoginResponseData>() {


        @SuppressWarnings({
                "unchecked"
        })
        public LoginResponseData createFromParcel(android.os.Parcel in) {
            return new LoginResponseData(in);
        }

        public LoginResponseData[] newArray(int size) {
            return (new LoginResponseData[size]);
        }

    }
            ;

    protected LoginResponseData(android.os.Parcel in) {
        this.pkRegisterid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.mNo = ((String) in.readValue((String.class.getClassLoader())));
        this.dob = ((String) in.readValue((String.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((String) in.readValue((String.class.getClassLoader())));
    }

    public LoginResponseData() {
    }

    public Integer getPkRegisterid() {
        return pkRegisterid;
    }

    public void setPkRegisterid(Integer pkRegisterid) {
        this.pkRegisterid = pkRegisterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(pkRegisterid);
        dest.writeValue(name);
        dest.writeValue(email);
        dest.writeValue(mNo);
        dest.writeValue(dob);
        dest.writeValue(gender);
        dest.writeValue(address);
    }

    public int describeContents() {
        return 0;
    }
}
