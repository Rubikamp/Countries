package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class TurkeyActivity extends AppCompatActivity {

     AppCompatTextView erdemir, enka, kocHolding, izdemir, garantiBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        erdemir = findViewById(R.id.erdemir);
        erdemir.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ERDEMIR_URL))));

        enka = findViewById(R.id.enka);
        enka.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ENKA_URL))));

        kocHolding = findViewById(R.id.koc_holding);
        kocHolding.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KOC_HOLDING_URL))));

        izdemir = findViewById(R.id.izmir);
        izdemir.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.IZMIR_URL))));

        garantiBank = findViewById(R.id.garantiBank);
        garantiBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GARANTINKBANK_URL))));



    }
}