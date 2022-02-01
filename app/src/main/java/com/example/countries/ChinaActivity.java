package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        AppCompatImageView imageViewGlide=findViewById(R.id.bridge_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.river_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.green_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.city_china);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.tsin_uni);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.fuden);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.peking);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.wuhan);
        Glide.with(this).load("").into(imageViewGlide);


    }
}