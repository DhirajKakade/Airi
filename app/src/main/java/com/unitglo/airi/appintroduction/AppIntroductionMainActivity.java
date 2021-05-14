package com.unitglo.airi.appintroduction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;

import com.unitglo.airi.R;

public class AppIntroductionMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }
        setContentView(R.layout.activity_app_introduction_main);
        getSupportActionBar().hide();

        final ViewPager viewPager = findViewById(R.id.viewPagerAppIntroductionMain);
        AppIntroductionTabsAdapter tabsAdapter = new AppIntroductionTabsAdapter(getSupportFragmentManager(), 3);
        viewPager.setAdapter(tabsAdapter);

    }
}