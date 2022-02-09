package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SpainActivity extends AppCompatActivity {
    AppCompatTextView inditex, iberdrola, santander, amadeus, naturgy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);


        inditex = findViewById(R.id.inditex);
        inditex.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.INDITEX_URL))));

        iberdrola = findViewById(R.id.iberdrola);
        iberdrola.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.IBERDROLA_URL))));

        santander = findViewById(R.id.Santander);
        santander.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SANTANDER_URL))));

        amadeus = findViewById(R.id.Amadeus);
        amadeus.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AMDEUS_URL))));

        naturgy = findViewById(R.id.naturgy);
        naturgy.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NATURGY_URL))));
    }
}