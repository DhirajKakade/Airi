package com.unitglo.airi.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unitglo.airi.R;

public class PhoneVerificationActivity extends AppCompatActivity {

    private LinearLayout llNextPhoneVerification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }

        setContentView(R.layout.activity_phone_verification);
        initView();

        getSupportActionBar().hide();

        llNextPhoneVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneVerificationActivity.this, AllowNorificationActivity.class);
                startActivity(intent);
            }
        });
        
    }

    private void initView() {
        llNextPhoneVerification = findViewById(R.id.llNextPhoneVerification);
    }
}