package com.unitglo.airi.appintroduction.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.unitglo.airi.R;
import com.unitglo.airi.auth.LoginActivity;

public class AppIntroduction3Fragment extends Fragment {

    private CardView cardGetStartedAppIntroduction3;

    public AppIntroduction3Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_app_introduction3, container, false);
        initView(rootView);

        cardGetStartedAppIntroduction3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);

            }
        });

        return rootView;
    }

    private void initView(View view) {
        cardGetStartedAppIntroduction3 = view.findViewById(R.id.cardGetStartedAppIntroduction3);
    }
}