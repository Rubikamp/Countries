package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class CanadaActivity extends AppCompatActivity {
    AppCompatTextView westJet, mcCain, timHortons, shoppers, bombardier, saputo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);


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