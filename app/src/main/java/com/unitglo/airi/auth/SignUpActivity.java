package com.unitglo.airi.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.unitglo.airi.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

    }
}