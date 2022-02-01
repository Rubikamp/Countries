package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class FrenchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);


        AppCompatImageView imageViewGlide=findViewById(R.id.tower_french);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_french);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.street_french);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.home_french);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.nature_french);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.paris_uni);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.bonone_paris);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.uni_defrench);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.strabon);
        Glide.with(this).load("").into(imageViewGlide);



    }
}