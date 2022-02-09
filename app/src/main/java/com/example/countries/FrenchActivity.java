package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class FrenchActivity extends AppCompatActivity {
    AppCompatTextView lvmh, lOreal, hermes, dior, sanofi, kering, bnp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);


        lvmh = findViewById(R.id.LVMH);
        lvmh.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi3-_ODleP1AhVKOBoKHXXWDpwQFnoECDsQAQ&url=https%3A%2F%2Fwww.mhdkk.com%2Fen%2Fabout%2Flvmh%2F&usg=AOvVaw1a6Sz2J0Z1JmvMcE-CXvYq"))));

        lOreal = findViewById(R.id.LOERAL);
        lOreal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.LOERAL_URL))));

        hermes = findViewById(R.id.Hermes);
        hermes.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HERMES_URL))));

        dior = findViewById(R.id.Dior);
        dior.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIOR_URL))));

        sanofi = findViewById(R.id.Sanofi);
        sanofi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SANOFI_URL))));

        kering = findViewById(R.id.Kering);
        kering.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KERING_URL))));

        bnp = findViewById(R.id.BNP);
        bnp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BNP_URL))));


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