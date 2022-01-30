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
        Glide.with(this).load("https://images.pexels.com/photos/699466/pexels-photo-699466.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_french);
        Glide.with(this).load("https://images.pexels.com/photos/705764/pexels-photo-705764.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.street_french);
        Glide.with(this).load("https://images.pexels.com/photos/3073666/pexels-photo-3073666.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.home_french);
        Glide.with(this).load("https://images.pexels.com/photos/2792025/pexels-photo-2792025.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.nature_french);
        Glide.with(this).load("https://images.pexels.com/photos/708447/pexels-photo-708447.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.paris_uni);
        Glide.with(this).load("https://i.pinimg.com/564x/90/c1/f3/90c1f36115f3f3fe82a444d2acf25370.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.bonone_paris);
        Glide.with(this).load("https://i.pinimg.com/564x/7e/49/4e/7e494e7b1d4394f957a7e6a0f6a9b15c.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.uni_defrench);
        Glide.with(this).load("https://i.pinimg.com/564x/71/be/5e/71be5e0e5b474feba4bbaf0d19e67aec.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.strabon);
        Glide.with(this).load("https://www.euroculturemaster.eu/uploads/bestanden/cae2dc85-01d0-5946-8150-aa97ee4eef8d/3072380221/RS48555_Palais_universitaire_3523-lpr.jpg").into(imageViewGlide);



    }
}