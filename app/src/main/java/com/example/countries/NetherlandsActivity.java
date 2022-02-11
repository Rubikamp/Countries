package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class NetherlandsActivity extends AppCompatActivity {


    AppCompatTextView unilever, royal, ing, aegon, rabobank, philips, ahold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netherlands);

        AppCompatImageView riverNetherlands = findViewById(R.id.river_netherlands);
        Glide.with(this).load(PicLinks.RIVER_NETHERLANDS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverNetherlands);

        AppCompatImageView waterFallNetherlands = findViewById(R.id.waterfall_netherlands);
        Glide.with(this).load(PicLinks.WATER_FALL_NETHERLANDS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterFallNetherlands);

        AppCompatImageView buildingNetherlands = findViewById(R.id.building_netherlands);
        Glide.with(this).load(PicLinks.BUILDING_NETHERLANDS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(buildingNetherlands);

        AppCompatImageView boatNetherlands = findViewById(R.id.boat_netherlands);
        Glide.with(this).load(PicLinks.BOAT_NETHERLANDS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(boatNetherlands);

        AppCompatImageView castleNetherlands = findViewById(R.id.castle_netherlands);
        Glide.with(this).load(PicLinks.CASTLE_NETHERLANDS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleNetherlands);

        AppCompatImageView ameUni = findViewById(R.id.ame_netherlands);
        Glide.with(this).load(PicLinks.AME_UNI_NTH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ameUni);

        AppCompatImageView riverUni = findViewById(R.id.river_uni);
        Glide.with(this).load(PicLinks.RIVER_UNI_NTH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverUni);

        AppCompatImageView vrijeUni = findViewById(R.id.vrije_netherlands);
        Glide.with(this).load(PicLinks.VRIJE_UNI_NTH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(vrijeUni);

        AppCompatImageView georgiaUni = findViewById(R.id.georgia_uni);
        Glide.with(this).load(PicLinks.GEORGIA_UNI_NTH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(georgiaUni);


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