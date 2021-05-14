package com.unitglo.airi.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.unitglo.airi.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

    }
}