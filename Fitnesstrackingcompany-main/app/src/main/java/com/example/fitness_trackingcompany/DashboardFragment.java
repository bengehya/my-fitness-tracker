package com.example.fitness_trackingcompany;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {
    private TextView tvStepCount, tvCaloriesBurned;
    private Button btnOpenBottomSheet;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);


        tvStepCount = view.findViewById(R.id.tv_step_count);
        tvCaloriesBurned = view.findViewById(R.id.tv_calories_burned);
        btnOpenBottomSheet = view.findViewById(R.id.btn_open_bottom_sheet);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView workoutCard = view.findViewById(R.id.card_start_workout);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView sleepCard = view.findViewById(R.id.card_track_sleep);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView waterCard = view.findViewById(R.id.card_log_water);


        workoutCard.setOnClickListener(v ->
                Toast.makeText(getContext(), "Start Workout Clicked!", Toast.LENGTH_SHORT).show()
        );

        sleepCard.setOnClickListener(v ->
                Toast.makeText(getContext(), "Track Sleep Clicked!", Toast.LENGTH_SHORT).show()
        );

        waterCard.setOnClickListener(v ->
                Toast.makeText(getContext(), "Log Water Intake Clicked!", Toast.LENGTH_SHORT).show()
        );


        btnOpenBottomSheet.setOnClickListener(v -> {
            FitnessBottomSheet bottomSheet = new FitnessBottomSheet();
            bottomSheet.show(getParentFragmentManager(), "fitness_bottom_sheet");
        });

        return view;
    }
}
