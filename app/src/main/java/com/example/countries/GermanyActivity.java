package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class GermanyActivity extends AppCompatActivity {
    AppCompatTextView volkswagen, daimler, allianz, bmw, siemens, bosch, uniper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        volkswagen = findViewById(R.id.volkswagen);
        volkswagen.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOLKSWAGEN_URL))));

        daimler = findViewById(R.id.DIAMLER);
        daimler.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIAMLER_URL))));

        allianz = findViewById(R.id.allianz);
        allianz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALLIANZ_URL))));

        bmw = findViewById(R.id.bmw);
        bmw.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BMW_URL))));

        siemens = findViewById(R.id.siemens);
        siemens.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SIEMENS_URL))));

        bosch = findViewById(R.id.bosch);
        bosch.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BOSCH_URL))));

        uniper = findViewById(R.id.uniper);
        uniper.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNIPER_URL))));

    }
}