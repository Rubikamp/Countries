package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class BrazilActivity extends AppCompatActivity {
    AppCompatTextView petroBras, valeCompany, bancoSantader, ambev, itauUnibanco, bancoBradesco, nuHoldings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView rioMountain = findViewById(R.id.rio_mountain_brazil);
        Glide.with(this).load(PicLinks.RIO_MOUNTAIN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(rioMountain);

        AppCompatImageView waterFall = findViewById(R.id.waterfall_brazil);
        Glide.with(this).load(PicLinks.WATER_FALL_BRZ_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterFall);

        AppCompatImageView seaBrazil = findViewById(R.id.sea_brazil);
        Glide.with(this).load(PicLinks.SEA_BRZ_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seaBrazil);

        AppCompatImageView mountainBrazil = findViewById(R.id.mountain_brazil);
        Glide.with(this).load(PicLinks.MOUNTAIN_BRZ_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainBrazil);

        AppCompatImageView beachBrazil = findViewById(R.id.beach_brazil);
        Glide.with(this).load(PicLinks.BEACH_BRZ_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(beachBrazil);

        AppCompatImageView saopalUni = findViewById(R.id.saopal_uni);
        Glide.with(this).load(PicLinks.SAOPAL_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(saopalUni);

        AppCompatImageView stateUni = findViewById(R.id.state_uni);
        Glide.with(this).load(PicLinks.STATE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(stateUni);

        AppCompatImageView brasillaUni = findViewById(R.id.brasilla);
        Glide.with(this).load(PicLinks.BRASILLA_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(brasillaUni);

        AppCompatImageView paranaUni = findViewById(R.id.parana);
        Glide.with(this).load(PicLinks.PARANA_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(paranaUni);


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


    }

}