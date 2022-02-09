package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;



public class NetherlandsActivity extends AppCompatActivity {


    AppCompatTextView unilever, royal, ing, aegon, rabobank, philips, ahold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netherlands);

        unilever = findViewById(R.id.unilever);
        unilever.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNILEVERE_URL))));

        royal = findViewById(R.id.royal);
        royal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ROYAL_URL))));

        ing = findViewById(R.id.ing);
        ing.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ING_URL))));

        aegon = findViewById(R.id.aegon);
        aegon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AEGON_URL))));

        rabobank = findViewById(R.id.rabobank);
        rabobank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.RABOBANK_URL))));

        philips = findViewById(R.id.philips);
        philips.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PHILIPS_URL))));

        ahold = findViewById(R.id.ahold);
        ahold.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AHOLD_URL))));

    }
}