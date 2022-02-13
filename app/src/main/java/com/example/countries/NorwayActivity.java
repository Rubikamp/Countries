package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class NorwayActivity extends AppCompatActivity {

    AppCompatTextView equinor, telenor, aker, orkla, Kvarner, total_norge, norsk;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norway);

        AppCompatImageView farmNorway = findViewById(R.id.farm_norway);
        Glide.with(this).load(PicLinks.FARM_NORWAY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(farmNorway);

        AppCompatImageView skyNorway = findViewById(R.id.sky_norway);
        Glide.with(this).load(PicLinks.SKY_NORWAY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(skyNorway);

        AppCompatImageView mountainNorway = findViewById(R.id.mountain_norway);
        Glide.with(this).load(PicLinks.MOUNTAIN_NORWAY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainNorway);

        AppCompatImageView cityNorway = findViewById(R.id.city_norway);
        Glide.with(this).load(PicLinks.CITY_NORWAY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityNorway);

        AppCompatImageView homeNorway = findViewById(R.id.home_norway);
        Glide.with(this).load(PicLinks.HOME_NORWAY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeNorway);

        AppCompatImageView tottalUni = findViewById(R.id.tottal_norway);
        Glide.with(this).load(PicLinks.TOTTAL_UNI_NOR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tottalUni);

        AppCompatImageView birgenUni = findViewById(R.id.birgen_norway);
        Glide.with(this).load(PicLinks.BIRGEN_UNI_NOR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(birgenUni);

        AppCompatImageView tinkenUni = findViewById(R.id.tinken_norway);
        Glide.with(this).load(PicLinks.TINKEN_UNI_NOR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tinkenUni);

        AppCompatImageView bonesUni = findViewById(R.id.bones_norway);
        Glide.with(this).load(PicLinks.BONES_UNI_NOR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bonesUni);


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