package com.unitglo.airi.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.textfield.TextInputEditText;
import com.unitglo.airi.R;
import com.unitglo.airi.utils.Functions;

public class PhoneVerificationActivity extends AppCompatActivity {

    private LinearLayout llNextPhoneVerification;
    private TextInputEditText etOtp1PhoneVerification;
    private TextInputEditText etOtp2PhoneVerification;
    private TextInputEditText etOtp3PhoneVerification;
    private TextInputEditText etOtp4PhoneVerification;
    private TextView tvSkipPhoneVerification;
    private TextView tv1NumberKeyboard;
    private TextView tv2NumberKeyboard;
    private TextView tv3NumberKeyboard;
    private TextView tv4NumberKeyboard;
    private TextView tv5NumberKeyboard;
    private TextView tv6NumberKeyboard;
    private TextView tv7NumberKeyboard;
    private TextView tv8NumberKeyboard;
    private TextView tv9NumberKeyboard;
    private TextView tv0NumberKeyboard;
    private TextView tvClearNumberKeyboard;
    private CardView cardBackPhoneVerification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }

        setContentView(R.layout.activity_phone_verification);
        initView();

        getSupportActionBar().hide();
        Functions.setNumberKeyboard(this);

        llNextPhoneVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneVerificationActivity.this, AllowNorificationActivity.class);
                startActivity(intent);
            }
        });

        tvSkipPhoneVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneVerificationActivity.this, AllowNorificationActivity.class);
                startActivity(intent);
            }
        });

        cardBackPhoneVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void initView() {
        llNextPhoneVerification = findViewById(R.id.llNextPhoneVerification);
        etOtp1PhoneVerification = findViewById(R.id.etOtp1PhoneVerification);
        etOtp2PhoneVerification = findViewById(R.id.etOtp2PhoneVerification);
        etOtp3PhoneVerification = findViewById(R.id.etOtp3PhoneVerification);
        etOtp4PhoneVerification = findViewById(R.id.etOtp4PhoneVerification);
        tvSkipPhoneVerification = findViewById(R.id.tvSkipPhoneVerification);
        tv1NumberKeyboard = findViewById(R.id.tv1NumberKeyboard);
        tv2NumberKeyboard = findViewById(R.id.tv2NumberKeyboard);
        tv3NumberKeyboard = findViewById(R.id.tv3NumberKeyboard);
        tv4NumberKeyboard = findViewById(R.id.tv4NumberKeyboard);
        tv5NumberKeyboard = findViewById(R.id.tv5NumberKeyboard);
        tv6NumberKeyboard = findViewById(R.id.tv6NumberKeyboard);
        tv7NumberKeyboard = findViewById(R.id.tv7NumberKeyboard);
        tv8NumberKeyboard = findViewById(R.id.tv8NumberKeyboard);
        tv9NumberKeyboard = findViewById(R.id.tv9NumberKeyboard);
        tv0NumberKeyboard = findViewById(R.id.tv0NumberKeyboard);
        tvClearNumberKeyboard = findViewById(R.id.tvClearNumberKeyboard);
        cardBackPhoneVerification = findViewById(R.id.cardBackPhoneVerification);
    }
}