package com.unitglo.airi.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.unitglo.airi.R;
import com.unitglo.airi.activity.ProductActivity;

public class SearchFragment extends Fragment {

    private LinearLayout llSearchItem;

    public SearchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        initView(rootView);

        llSearchItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ProductActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

    private void initView(View view) {
        llSearchItem = view.findViewById(R.id.llSearchItem);
    }
}