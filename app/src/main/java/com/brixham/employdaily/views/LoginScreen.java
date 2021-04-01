package com.brixham.employdaily.views;

import androidx.appcompat.app.AppCompatActivity;
import com.brixham.employdaily.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.brixham.employdaily.models.LoginRequestModel;
import com.brixham.employdaily.models.LoginResponseModel;
import com.brixham.employdaily.network.APIClient;
import com.brixham.employdaily.network.APIService;
import com.brixham.employdaily.utilities.ConstantsManager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginScreen extends AppCompatActivity {
    private MaterialButton loginButton;
    private TextView textViewRegister;
    private TextInputEditText editTextMobile;
    private TextInputEditText editTextPassword;
    private TextInputEditText editTextEmail;
    private APIService apiService;
    private String mobileNumber = "";
    private String password = "";
    private String email = "";

    private TextView registerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        loginButton = findViewById(R.id.btn_login);
        editTextMobile = findViewById(R.id.textInputMobile);
        editTextEmail = findViewById(R.id.textInputEmail);
        editTextPassword = findViewById(R.id.textInputPassword);
        textViewRegister = findViewById(R.id.textView_register);

        apiService = APIClient.getClient().create(APIService.class);

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, RegistrationActivity.class));
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileNumber = editTextMobile.getText().toString();
                password = editTextPassword.getText().toString();
                email = editTextEmail.getText().toString();

                if(mobileNumber != null && !mobileNumber.isEmpty() && password != null && !password.isEmpty() && email != null && !email.isEmpty()) {
                    LoginRequestModel model = new LoginRequestModel(mobileNumber, password);

                    apiService.loginUser(model).enqueue(new Callback<LoginResponseModel>() {
                        @Override
                        public void onResponse(Call<LoginResponseModel> call, Response<LoginResponseModel> response) {
                            SharedPreferences sharedPreferences = getSharedPreferences(ConstantsManager.SHARED_PREFS_FILE_NAME, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(ConstantsManager.SHARED_PREFS_USER_ID, response.body().getData().getmNo().toString());
                            editor.putString(ConstantsManager.SHARED_PREFS_USER_NAME, response.body().getData().getName());
                            editor.putString(ConstantsManager.SHARED_PREFS_EMAIL, response.body().getData().getEmail());
                            editor.putString(ConstantsManager.SHARED_PREFS_DOB, response.body().getData().getDob());
                            editor.putString(ConstantsManager.SHARED_PREFS_GENDER, response.body().getData().getGender());
                            editor.putString(ConstantsManager.SHARED_PREFS_ADDRESS, response.body().getData().getAddress());
                            editor.putBoolean(ConstantsManager.SHARED_PREFS_IS_USER_LOGGED_IN, true);
                            editor.apply();

                            startActivity(new Intent(LoginScreen.this, Dashboard.class));
                            finish();
                        }

                        @Override
                        public void onFailure(Call<LoginResponseModel> call, Throwable t) {
                            Log.e("LOGIN", "onFailure: " + t.getMessage());
                        }
                    });
                }
                else{

                }
            }
        });
    }
}