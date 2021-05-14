package com.unitglo.airi;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private ChipNavigationBar chipNavigationBarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.home_background));
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initView();

        chipNavigationBarMain.setItemSelected(R.id.home, true);

    }

    private void initView() {
        chipNavigationBarMain = findViewById(R.id.chipNavigationBarMain);
    }
}