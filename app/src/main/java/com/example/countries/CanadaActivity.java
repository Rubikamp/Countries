package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class CanadaActivity extends AppCompatActivity {
    AppCompatTextView westJet, mcCain, timHortons, shoppers, bombardier, saputo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_canada);


        westJet = findViewById(R.id.west_jet);
        westJet.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.WESTJET_URL))));

        mcCain = findViewById(R.id.mccain);
        mcCain.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MCCAIN_URL))));

        timHortons = findViewById(R.id.hortons);
        timHortons.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HORTONS_URL))));

        shoppers = findViewById(R.id.shoppers);
        shoppers.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHOPPERS_URL))));

        bombardier = findViewById(R.id.bombardier_inc);
        bombardier.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BOMBARDIER_INC_URL))));

        saputo = findViewById(R.id.saputo);
        saputo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SAPUTO_URL))));


        AppCompatImageView niagara = findViewById(R.id.niagara);
        Glide.with(this).load("https://images.pexels.com/photos/3490963/pexels-photo-3490963.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(niagara);

        AppCompatImageView toewerCanada = findViewById(R.id.tower_canada);
        Glide.with(this).load("https://images.pexels.com/photos/6180722/pexels-photo-6180722.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(toewerCanada);

        AppCompatImageView castleCanada = findViewById(R.id.castle_canada);
        Glide.with(this).load("https://images.unsplash.com/photo-1613492696654-ac73fac71893?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fG9sZCUyMHF1ZWJlY3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleCanada);

        AppCompatImageView hillTower = findViewById(R.id.hill_tower);
        Glide.with(this).load("https://images.unsplash.com/photo-1633200505614-543c8cde791c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8b3R0YXdhJ3MlMjBwYXJsaWFtZW50JTIwaGlsbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(hillTower);

        AppCompatImageView seaCanada = findViewById(R.id.see_canada);
        Glide.with(this).load("https://images.unsplash.com/photo-1580764330070-254c5303f202?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmF5JTIwb2YlMjBmdW5keXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seaCanada);

        AppCompatImageView toronto = findViewById(R.id.toronto);
        Glide.with(this).load("https://i.pinimg.com/564x/d2/c9/65/d2c965bb8d7666bfc5e21da133dd075e.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(toronto);

        AppCompatImageView alberta = findViewById(R.id.alberta);
        Glide.with(this).load("https://i.pinimg.com/564x/f1/03/0d/f1030dc26e678ea8bef5abaa9bf39e6e.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(alberta);

        AppCompatImageView british = findViewById(R.id.british);
        Glide.with(this).load("https://www.grad.ubc.ca/sites/default/files/image/news/phd-tracking-image-1200x630_0.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(british);

        AppCompatImageView waterLoo = findViewById(R.id.waterloo);
        Glide.with(this).load("https://uwaterloo.ca/news/sites/ca.news/files/styles/feature_large/public/dsc_1602_full_res_1.jpg?itok=-F8flulW").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterLoo);


    }
}