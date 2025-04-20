package com.example.fitness_trackingcompany;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProgressFragment extends Fragment {

    private TextView tvFitnessProgress;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress, container, false);

        tvFitnessProgress = view.findViewById(R.id.tv_fitness_progress);


        tvFitnessProgress.setText("Fitness Progress:\n- Steps: 10,000\n- Calories Burned: 500\n- Workouts Completed: 5");

        return view;
    }
}
