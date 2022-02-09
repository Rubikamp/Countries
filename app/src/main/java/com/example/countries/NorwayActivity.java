package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class NorwayActivity extends AppCompatActivity {


    AppCompatTextView equinor, telenor, aker, orkla, Kvarner, total_norge, norsk;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norway);


        equinor = findViewById(R.id.equinor);
        equinor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.EQUINOR_URL))));

        telenor = findViewById(R.id.telenor);
        telenor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TELENOR_URL))));

        aker = findViewById(R.id.aker);
        aker.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AKER_URL))));

        orkla = findViewById(R.id.orkla);
        orkla.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ORKLA_URL))));

        Kvarner = findViewById(R.id.Kvarner);
        Kvarner.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KVARNER_URL))));

        total_norge = findViewById(R.id.total_norge);
        total_norge.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TOTAL_NORGE_URL))));

        norsk = findViewById(R.id.norsk);
        norsk.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NORSK_URL))));

    }
}