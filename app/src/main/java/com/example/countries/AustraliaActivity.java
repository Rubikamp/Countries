package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class AustraliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);


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