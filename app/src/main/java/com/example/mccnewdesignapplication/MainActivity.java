package com.example.mccnewdesignapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getSupportActionBar().hide();

        CardView compCard = (CardView) findViewById(R.id.compProj);
        compCard.setOnClickListener(v -> {
            Intent compintent = new Intent(MainActivity.this,
                    CompProjectScreen.class);
            startActivity(compintent);
        });
        CardView ongCard = (CardView) findViewById(R.id.ongProj);
        ongCard.setOnClickListener(v -> {
            Intent ongintent = new Intent(MainActivity.this,
                    OngProjectScreen.class);
            startActivity(ongintent);
        });
    }
}