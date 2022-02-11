package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class BelgiumActivity extends AppCompatActivity {
    AppCompatTextView abInBev, kbcBank, ageAs, solVaySA, deXia, ucb, umiCore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belgium);

        AppCompatImageView farmCastle = findViewById(R.id.farm_castle);
        Glide.with(this).load(PicLinks.FARM_CASTLE_BEL_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(farmCastle);

        AppCompatImageView castleCity = findViewById(R.id.castle_city_belgium);
        Glide.with(this).load(PicLinks.CASTLE_CITY_BEL_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleCity);

        AppCompatImageView castleBel = findViewById(R.id.castle_belgium);
        Glide.with(this).load(PicLinks.CASTLE_BEL_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleBel);

        AppCompatImageView river = findViewById(R.id.river_belgium);
        Glide.with(this).load(PicLinks.RIVER_BEL_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(river);

        AppCompatImageView belgiumCity = findViewById(R.id.belgium_city);
        Glide.with(this).load(PicLinks.BELGIUM_CITY_BEL_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(belgiumCity);

        AppCompatImageView libreUni = findViewById(R.id.libre_belgium);
        Glide.with(this).load(PicLinks.LIBRE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(libreUni);

        AppCompatImageView ghentUni = findViewById(R.id.ghent);
        Glide.with(this).load(PicLinks.GHENT_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ghentUni);

        AppCompatImageView louvianUni = findViewById(R.id.louvian);
        Glide.with(this).load(PicLinks.LOUVIAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(louvianUni);

        AppCompatImageView kuUni = findViewById(R.id.ku_university);
        Glide.with(this).load(PicLinks.KU_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(kuUni);


        abInBev = findViewById(R.id.ab_inbev);
        abInBev.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AB_INBEV_URL))));

        kbcBank = findViewById(R.id.kbc_bank);
        kbcBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KBC_BANK_URL))));

        ageAs = findViewById(R.id.ageas);
        ageAs.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AGEAS_URL))));

        solVaySA = findViewById(R.id.solvaySA);
        solVaySA.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SOLVAYSA_URL))));

        deXia = findViewById(R.id.dexia);
        deXia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DEXIA_URL))));

        ucb = findViewById(R.id.ucb);
        ucb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UCB_URL))));

        umiCore = findViewById(R.id.umicore);
        umiCore.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UMIOCORE_URL))));

    }
}