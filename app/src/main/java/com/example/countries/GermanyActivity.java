package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import java.io.PipedInputStream;

public class GermanyActivity extends AppCompatActivity {
    AppCompatTextView volkswagen, daimler, allianz, bmw, siemens, bosch, uniper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        volkswagen = findViewById(R.id.Volkswagen);
        volkswagen.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOLKSWAGEN_URL))));

        daimler = findViewById(R.id.DIAMLER);
        daimler.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIAMLER_URL))));

        allianz = findViewById(R.id.Allianz);
        allianz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALLIANZ_URL))));

        bmw = findViewById(R.id.BMW);
        bmw.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BMW_URL))));

        siemens = findViewById(R.id.Siemens);
        siemens.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SIEMENS_URL))));

        bosch = findViewById(R.id.Bosch);
        bosch.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BOSCH_URL))));

        uniper = findViewById(R.id.Uniper);
        uniper.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNIPER_URL))));


    }
}