package com.example.fitness_trackingcompany;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class FitnessBottomSheet extends BottomSheetDialogFragment {

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_fitness, container, false);


        view.findViewById(R.id.option_log_food).setOnClickListener(v -> {
            Toast.makeText(getContext(), "Log Food Clicked", Toast.LENGTH_SHORT).show();
            dismiss();
        });

        view.findViewById(R.id.option_track_sleep).setOnClickListener(v -> {
            Toast.makeText(getContext(), "Track Sleep Clicked", Toast.LENGTH_SHORT).show();
            dismiss();
        });

        view.findViewById(R.id.option_track_weight).setOnClickListener(v -> {
            Toast.makeText(getContext(), "Track Weight Clicked", Toast.LENGTH_SHORT).show();
            dismiss();
        });

        return view;
    }
}

