package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class EnglandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView imageViewGlide=findViewById(R.id.bus_uk);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.bridge_uk);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_uk);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.rocks_uk);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.Carousel_uk);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.imperial);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.college_london);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.oxford);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.manchester);
        Glide.with(this).load("").into(imageViewGlide);
    }

}