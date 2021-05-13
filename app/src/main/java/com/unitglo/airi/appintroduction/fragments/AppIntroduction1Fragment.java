package com.unitglo.airi.appintroduction.fragments;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unitglo.airi.R;

public class AppIntroduction1Fragment extends Fragment {

    public AppIntroduction1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_app_introduction1, container, false);

        return rootView;
    }
}