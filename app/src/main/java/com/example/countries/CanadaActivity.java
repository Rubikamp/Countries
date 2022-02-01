package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class CanadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_canada);

        AppCompatImageView imageViewGlide=findViewById(R.id.niagara);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.tower_canada);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_canada);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.hill_tower);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.see_canada);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.toronto);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.alberta);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.british);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.waterloo);
        Glide.with(this).load("").into(imageViewGlide);


    }
}