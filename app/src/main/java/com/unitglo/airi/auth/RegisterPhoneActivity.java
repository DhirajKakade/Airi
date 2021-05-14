package com.unitglo.airi.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unitglo.airi.R;

public class RegisterPhoneActivity extends AppCompatActivity {

    private LinearLayout llContinueRegisterPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }
        setContentView(R.layout.activity_register_phone);
        initView();
        getSupportActionBar().hide();

        llContinueRegisterPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPhoneActivity.this, PhoneVerificationActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        llContinueRegisterPhone = findViewById(R.id.llContinueRegisterPhone);
    }
}