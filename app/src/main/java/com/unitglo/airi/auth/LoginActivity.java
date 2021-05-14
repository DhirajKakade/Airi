package com.unitglo.airi.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.unitglo.airi.R;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout llCreateAccountLogin;
    private TextView tvForgotPasswordLogin;
    private CardView cardSignInLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        getSupportActionBar().hide();
        initView();


        tvForgotPasswordLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        cardSignInLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterPhoneActivity.class);
                startActivity(intent);
            }
        });

//        RegisterPhoneActivity

        llCreateAccountLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        llCreateAccountLogin = findViewById(R.id.llCreateAccountLogin);
        tvForgotPasswordLogin = findViewById(R.id.tvForgotPasswordLogin);
        cardSignInLogin = findViewById(R.id.cardSignInLogin);
    }
}