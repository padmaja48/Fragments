package com.example.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    // Declare the buttons
    Button btnHome, btnProfile, btnEducation, btnSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons by their IDs from the layout
        btnHome = findViewById(R.id.btn_home);
        btnProfile = findViewById(R.id.btn_profile);
        btnEducation = findViewById(R.id.btn_education);
        btnSkills = findViewById(R.id.btn_skills);

        // Load HomeFragment by default when the activity starts
        loadFragment(new HomeFragment());

        // Set up click listeners for each button to load corresponding fragments
        btnHome.setOnClickListener(view -> loadFragment(new HomeFragment()));
        btnProfile.setOnClickListener(view -> loadFragment(new ProfileFragment()));
        btnEducation.setOnClickListener(view -> loadFragment(new EducationFragment()));
        btnSkills.setOnClickListener(view -> loadFragment(new SkillFragment()));
    }

    // Method to load a fragment in the container
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment) // Replace the current fragment with the new one
                .commit(); // Commit the transaction
    }
}

