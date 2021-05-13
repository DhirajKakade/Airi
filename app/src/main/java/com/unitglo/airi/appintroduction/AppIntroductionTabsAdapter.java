package com.unitglo.airi.appintroduction;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.unitglo.airi.appintroduction.fragments.AppIntroduction1Fragment;
import com.unitglo.airi.appintroduction.fragments.AppIntroduction2Fragment;
import com.unitglo.airi.appintroduction.fragments.AppIntroduction3Fragment;


public class AppIntroductionTabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public AppIntroductionTabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                AppIntroduction1Fragment home = new AppIntroduction1Fragment();
                return home;
            case 1:
                AppIntroduction2Fragment about = new AppIntroduction2Fragment();
                return about;
            case 2:
                AppIntroduction3Fragment contact = new AppIntroduction3Fragment();
                return contact;
            default:
                return null;
        }
    }
}