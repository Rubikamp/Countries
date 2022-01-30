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
        Glide.with(this).load("https://images.pexels.com/photos/5272985/pexels-photo-5272985.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.farm_castle);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_city_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/3254729/pexels-photo-3254729.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/6678595/pexels-photo-6678595.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.river_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/5499900/pexels-photo-5499900.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.belgium_city);
        Glide.with(this).load("https://images.pexels.com/photos/7245252/pexels-photo-7245252.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.libre_belgium);
        Glide.with(this).load("https://th.bing.com/th/id/R.8d49e8815eadbb521e5258ebfe22df6a?rik=UhKLNa%2FAGkRkxw&pid=ImgRaw&r=0").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.ghent);
        Glide.with(this).load("https://www.educate-nigeria.com/wp-content/uploads/2019/01/Master-Mind-Scholarships-At-Ghent-University-Belgium-2019.jpeg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.louvian);
        Glide.with(this).load("https://th.bing.com/th/id/R.7c748c6dccd1b70764a081d6199b77d3?rik=9e2vxcWWIsg0Vg&pid=ImgRaw&r=0").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.ku_university);
        Glide.with(this).load("https://media.nature.com/full/natcar/branding_images/19887/original/KU-Leuven_branded.jpg").into(imageViewGlide);


    }
}