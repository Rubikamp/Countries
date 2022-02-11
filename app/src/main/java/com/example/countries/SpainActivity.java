package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class SpainActivity extends AppCompatActivity {
    AppCompatTextView inditex, iberdrola, santander, amadeus, naturgy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);

        AppCompatImageView whitePlace = findViewById(R.id.white_place);
        Glide.with(this).load(PicLinks.WHITE_PLACE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(whitePlace);

        AppCompatImageView castleSpain = findViewById(R.id.castle_spain);
        Glide.with(this).load(PicLinks.CASTLE_SPAIN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleSpain);

        AppCompatImageView towerSpain = findViewById(R.id.tower_spain);
        Glide.with(this).load(PicLinks.TOWER_SPAIN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerSpain);

        AppCompatImageView homeSpain = findViewById(R.id.home_spain);
        Glide.with(this).load(PicLinks.HOME_SPAIN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeSpain);

        AppCompatImageView ninejSpain = findViewById(R.id.ninej_spain);
        Glide.with(this).load(PicLinks.NINEJ_SPAIN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ninejSpain);

        AppCompatImageView tikenUni = findViewById(R.id.tiken_spain);
        Glide.with(this).load(PicLinks.TIKEN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tikenUni);

        AppCompatImageView niermUni = findViewById(R.id.nierm_spain);
        Glide.with(this).load(PicLinks.NIERM_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(niermUni);

        AppCompatImageView ekromdUni = findViewById(R.id.ekromd_spain);
        Glide.with(this).load(PicLinks.EKROMD_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ekromdUni);

        AppCompatImageView denkeUni = findViewById(R.id.denke_spain);
        Glide.with(this).load(PicLinks.DENKE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(denkeUni);


        inditex = findViewById(R.id.inditex);
        inditex.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.INDITEX_URL))));

        iberdrola = findViewById(R.id.iberdrola);
        iberdrola.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.IBERDROLA_URL))));

        santander = findViewById(R.id.santander);
        santander.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SANTANDER_URL))));

        amadeus = findViewById(R.id.amadeus);
        amadeus.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AMDEUS_URL))));

        naturgy = findViewById(R.id.naturgy);
        naturgy.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NATURGY_URL))));

    }
}