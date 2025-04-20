package com.example.fitness_trackingcompany;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentManager;

public class BottomSheetFragment extends BottomSheetFragment1 {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_sheet_layout, container, false);
    }

    public Object getTag() {
        return null;
    }

    public void show(FragmentManager supportFragmentManager, Object tag) {
    }
}

