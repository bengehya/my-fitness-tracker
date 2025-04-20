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

public class WorkoutsFragment extends Fragment {

    private TextView tvWorkoutPrograms;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workouts, container, false);

        tvWorkoutPrograms = view.findViewById(R.id.tv_workout_programs);


        tvWorkoutPrograms.setText("Available Workouts:\n- Cardio\n- Strength Training\n- Yoga\n- HIIT");

        return view;
    }
}
