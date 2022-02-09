package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class BrazilActivity extends AppCompatActivity {
    AppCompatTextView petroBras, valeCompany, bancoSantader, ambev, itauUnibanco, bancoBradesco, nuHoldings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        petroBras = findViewById(R.id.petro_bras);
        petroBras.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PETRO_BARS_URL))));

        valeCompany = findViewById(R.id.vale_company);
        valeCompany.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VALE_COMPANY_URL))));

        bancoSantader = findViewById(R.id.banco_santander);
        bancoSantader.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BANCO_SANTANDER_URL))));

        ambev = findViewById(R.id.ambev);
        ambev.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AMBEV_URL))));

        itauUnibanco = findViewById(R.id.itau_unibanco);
        itauUnibanco.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ITAU_UNIBANCO_URL))));

        bancoBradesco = findViewById(R.id.banco_bradesco);
        bancoBradesco.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BANCO_BRADESCO_URL))));

        nuHoldings = findViewById(R.id.nu_holdings);
        nuHoldings.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NU_HOLDINGS_URL))));

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