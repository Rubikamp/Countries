package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class CanadaActivity extends AppCompatActivity {
    AppCompatTextView westJet, mcCain, timHortons, shoppers, bombardier, saputo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        AppCompatImageView niagara = findViewById(R.id.niagara);
        Glide.with(this).load(PicLinks.NIAGARA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(niagara);

        AppCompatImageView towerCanada = findViewById(R.id.tower_canada);
        Glide.with(this).load(PicLinks.TOWER_CANADA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerCanada);

        AppCompatImageView castleCanada = findViewById(R.id.castle_canada);
        Glide.with(this).load(PicLinks.CASTLE_CANADA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleCanada);

        AppCompatImageView hillTower = findViewById(R.id.hill_tower);
        Glide.with(this).load(PicLinks.HILL_TOWER_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(hillTower);

        AppCompatImageView seaCanada = findViewById(R.id.sea_canada);
        Glide.with(this).load(PicLinks.SEA_CANADA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seaCanada);

        AppCompatImageView torontoUni = findViewById(R.id.toronto);
        Glide.with(this).load(PicLinks.TORONTO_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(torontoUni);

        AppCompatImageView albertaUni = findViewById(R.id.alberta);
        Glide.with(this).load(PicLinks.ALBERTA_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(albertaUni);

        AppCompatImageView britishUni = findViewById(R.id.british);
        Glide.with(this).load(PicLinks.BRITISH_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(britishUni);

        AppCompatImageView waterlooUni = findViewById(R.id.waterloo);
        Glide.with(this).load(PicLinks.WATERLOO_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterlooUni);


        westJet = findViewById(R.id.west_jet);
        westJet.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.WESTJET_URL))));

        mcCain = findViewById(R.id.mccain);
        mcCain.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MCCAIN_URL))));

        timHortons = findViewById(R.id.hortons);
        timHortons.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HORTONS_URL))));

        shoppers = findViewById(R.id.shoppers);
        shoppers.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHOPPERS_URL))));

        bombardier = findViewById(R.id.bombardier_inc);
        bombardier.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BOMBARDIER_INC_URL))));

        saputo = findViewById(R.id.saputo);
        saputo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SAPUTO_URL))));


    }
}