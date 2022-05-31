package com.example.mccnewdesignapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getSupportActionBar().hide();

        FragmentManager fragmentManager = getSupportFragmentManager();
        Button btncomp = findViewById(R.id.compProj);
        btncomp.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, compproject.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit());

        Button btnong = findViewById(R.id.ongProj);
        btnong.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, ongproject.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit());

    }
}