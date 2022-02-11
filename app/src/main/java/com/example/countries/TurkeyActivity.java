package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class TurkeyActivity extends AppCompatActivity {

    AppCompatTextView erdemir, enka, kocHolding, izdemir, garantiBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        AppCompatImageView riverTurkey = findViewById(R.id.river_turkey);
        Glide.with(this).load(PicLinks.RIVER_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverTurkey);

        AppCompatImageView cityTurkey = findViewById(R.id.city_turkey);
        Glide.with(this).load(PicLinks.CITY_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityTurkey);

        AppCompatImageView skyTurkey = findViewById(R.id.sky_turkey);
        Glide.with(this).load(PicLinks.SKY_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(skyTurkey);

        AppCompatImageView bridgeTurkey = findViewById(R.id.bridge_turkey);
        Glide.with(this).load(PicLinks.BRIDGE_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeTurkey);

        AppCompatImageView seaTurkey = findViewById(R.id.sea_turkey);
        Glide.with(this).load(PicLinks.SEA_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seaTurkey);

        AppCompatImageView istanbulUni = findViewById(R.id.istanbul_uni);
        Glide.with(this).load(PicLinks.ISTANBUL_UNI_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(istanbulUni);

        AppCompatImageView ankaraUni = findViewById(R.id.ankara_turkey);
        Glide.with(this).load(PicLinks.ANKARA_UNI_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ankaraUni);

        AppCompatImageView anadoluUni = findViewById(R.id.anadolu_turkey);
        Glide.with(this).load(PicLinks.ANADOLU_UNI_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(anadoluUni);

        AppCompatImageView bogaziciUni = findViewById(R.id.bogazici_turkey);
        Glide.with(this).load(PicLinks.BOGAZICI_UNI_TURKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bogaziciUni);


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