package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;


public class BelgiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belgium);

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