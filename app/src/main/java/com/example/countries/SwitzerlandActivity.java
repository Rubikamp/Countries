package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import java.io.PipedInputStream;

public class SwitzerlandActivity extends AppCompatActivity {

    AppCompatTextView Nestle, roche, novartis, chubb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switzerland);


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