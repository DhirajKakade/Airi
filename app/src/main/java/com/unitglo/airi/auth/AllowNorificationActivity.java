package com.unitglo.airi.auth;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.unitglo.airi.MainActivity;
import com.unitglo.airi.R;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

public class AllowNorificationActivity extends AppCompatActivity {

    private LinearLayout llAllowNotificationAllowNotification;
    private LinearLayout llDontAllowAllowNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(AllowNorificationActivity.this, R.color.white));
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }

        setContentView(R.layout.activity_allow_norification);
        initView();
        getSupportActionBar().hide();

        llAllowNotificationAllowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllowNorificationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        llAllowNotificationAllowNotification = findViewById(R.id.llAllowNotificationAllowNotification);
        llDontAllowAllowNotification = findViewById(R.id.llDontAllowAllowNotification);
    }
}