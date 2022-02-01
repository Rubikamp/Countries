package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class BrazilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView imageViewGlide=findViewById(R.id.rio_mountain_brazil);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.waterfall_brazil);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.see_brazil);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.mountain_brazil);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.beach_brazil);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.saopal_uni);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.state_uni);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.brasilla);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.parana);
        Glide.with(this).load("").into(imageViewGlide);

    }

}