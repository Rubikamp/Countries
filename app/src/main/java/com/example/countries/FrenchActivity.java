package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class FrenchActivity extends AppCompatActivity {
    AppCompatTextView lvmh, lOreal, hermes, dior, sanofi, kering, bnp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);


        lvmh = findViewById(R.id.lvmh);
        lvmh.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi3-_ODleP1AhVKOBoKHXXWDpwQFnoECDsQAQ&url=https%3A%2F%2Fwww.mhdkk.com%2Fen%2Fabout%2Flvmh%2F&usg=AOvVaw1a6Sz2J0Z1JmvMcE-CXvYq"))));

        lOreal = findViewById(R.id.LOERAL);
        lOreal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.LOERAL_URL))));

        hermes = findViewById(R.id.Hermes);
        hermes.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HERMES_URL))));

        dior = findViewById(R.id.dior);
        dior.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIOR_URL))));

        sanofi = findViewById(R.id.sanofi);
        sanofi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SANOFI_URL))));

        kering = findViewById(R.id.kering);
        kering.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KERING_URL))));

        bnp = findViewById(R.id.bnp);
        bnp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BNP_URL))));




    }
}