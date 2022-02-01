package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class AmericaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView imageViewGlide=findViewById(R.id.white_house);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.bridge_america);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_america);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.librety_america);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.mountain_america);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.antwerp);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.harvard);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.cornell);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.coloumbia);
        Glide.with(this).load("").into(imageViewGlide);

    }
}