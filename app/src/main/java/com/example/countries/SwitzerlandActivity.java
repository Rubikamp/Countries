package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class SwitzerlandActivity extends AppCompatActivity {

    AppCompatTextView Nestle, roche, novartis, chubb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switzerland);

        AppCompatImageView rtainSwi = findViewById(R.id.train_switzerland);
        Glide.with(this).load(PicLinks.TRAIN_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(rtainSwi);

        AppCompatImageView natureSwi = findViewById(R.id.nature_switzerland);
        Glide.with(this).load(PicLinks.NATURE_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(natureSwi);

        AppCompatImageView cloudSwi = findViewById(R.id.clouds_switzerland);
        Glide.with(this).load(PicLinks.CLOUD_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cloudSwi);

        AppCompatImageView bridgeSwi = findViewById(R.id.bridge_switzerland);
        Glide.with(this).load(PicLinks.BRIDGE_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeSwi);

        AppCompatImageView homeSwi = findViewById(R.id.homes_switzerland);
        Glide.with(this).load(PicLinks.HOME_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeSwi);

        AppCompatImageView nesdoaUni = findViewById(R.id.nesdoa_Switzerland);
        Glide.with(this).load(PicLinks.NESDOA_UNI_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nesdoaUni);

        AppCompatImageView dmalopUni = findViewById(R.id.dmalop_Switzerland);
        Glide.with(this).load(PicLinks.DMALOP_UNI_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(dmalopUni);

        AppCompatImageView nalokiUni = findViewById(R.id.naloki_Switzerland);
        Glide.with(this).load(PicLinks.NALOKI_UNI_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nalokiUni);

        AppCompatImageView laniokd = findViewById(R.id.laniokd_Switzerland);
        Glide.with(this).load(PicLinks.LANIOKD_UNI_SWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(laniokd);


        Nestle = findViewById(R.id.Nestle);
        Nestle.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NESTLE_URL))));

        roche = findViewById(R.id.roche);
        roche.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ROCHE_URL))));

        novartis = findViewById(R.id.novartis);
        novartis.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NAVARIST_URL))));

        chubb = findViewById(R.id.chubb);
        chubb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.CHUB_URL))));


    }
}