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

public class HomeFragment extends Fragment {

    private TextView tvWelcomeMessage, tvRecentActivity;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        tvWelcomeMessage = view.findViewById(R.id.tv_welcome_message);
        tvRecentActivity = view.findViewById(R.id.tv_recent_activity);


        tvWelcomeMessage.setText("Welcome to your Fitness Tracker!");
        tvRecentActivity.setText("Recent Activity: 5000 Steps | 200 Calories Burned");

        return view;
    }
}
