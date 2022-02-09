package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class AustraliaActivity extends AppCompatActivity {
    AppCompatTextView telstra, anz, nab, westPac, cslAustralia, netBank, rioTinto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        telstra = findViewById(R.id.telstra);
        telstra.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TELSTRA_URL))));

        anz = findViewById(R.id.anz);
        anz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ANZ_URL))));

        nab = findViewById(R.id.nab);
        nab.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NAB_URL))));

        westPac = findViewById(R.id.westpac);
        westPac.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.WESTPAC_URL))));

        cslAustralia = findViewById(R.id.csl);
        cslAustralia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.CSL_URL))));

        netBank = findViewById(R.id.netbank);
        netBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NETBANK_URL))));

        rioTinto = findViewById(R.id.rio_tinto);
        rioTinto.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.RIOTINTO_URL))));


        AppCompatImageView imageViewGlide=findViewById(R.id.sidney);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.dark_see);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.bridge_australia);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.street_australia);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.fall_australia);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.monash);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.mellburne);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.sydney);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.wales);
        Glide.with(this).load("").into(imageViewGlide);


    }
}