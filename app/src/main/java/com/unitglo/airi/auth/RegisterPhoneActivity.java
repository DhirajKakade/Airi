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

public class RegisterPhoneActivity extends AppCompatActivity {

    private LinearLayout llContinueRegisterPhone;
    private TextInputEditText etMobileNumberRegisterPhone;
    private TextView tvSkipRegisterPhone;
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
    private CardView cardBackRegisterPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }
        setContentView(R.layout.activity_register_phone);
        initView();
        getSupportActionBar().hide();

        Functions.setNumberKeyboard(this);

        llContinueRegisterPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPhoneActivity.this, PhoneVerificationActivity.class);
                startActivity(intent);
            }
        });

        tvSkipRegisterPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPhoneActivity.this, AllowNorificationActivity.class);
                startActivity(intent);
            }
        });

        cardBackRegisterPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    private void initView() {
        llContinueRegisterPhone = findViewById(R.id.llContinueRegisterPhone);
        etMobileNumberRegisterPhone = findViewById(R.id.etMobileNumberRegisterPhone);

        tvSkipRegisterPhone = findViewById(R.id.tvSkipRegisterPhone);
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
        cardBackRegisterPhone = (CardView) findViewById(R.id.cardBackRegisterPhone);
    }
}