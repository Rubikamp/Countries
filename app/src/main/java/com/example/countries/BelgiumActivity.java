package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;


public class BelgiumActivity extends AppCompatActivity {
    AppCompatTextView abInBev, kbcBank, ageAs, solVaySA, deXia, ucb, umiCore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belgium);

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

        AppCompatImageView imageViewGlide=findViewById(R.id.farm_castle);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.castle_city_belgium);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_belgium);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.river_belgium);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.belgium_city);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.libre_belgium);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.ghent);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.louvian);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.ku_university);
        Glide.with(this).load("").into(imageViewGlide);


    }
}