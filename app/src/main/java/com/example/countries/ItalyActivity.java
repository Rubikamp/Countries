package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class ItalyActivity extends AppCompatActivity {

    AppCompatTextView assicurazioniGenerali, exor, uniCredit, eni, intesaSanpaolo, posteItaliane, generali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        AppCompatImageView romeItaly = findViewById(R.id.rome_italy);
        Glide.with(this).load(PicLinks.ROME_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(romeItaly);

        AppCompatImageView cityItaly = findViewById(R.id.city_italy);
        Glide.with(this).load(PicLinks.CITY_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityItaly);

        AppCompatImageView riverItaly = findViewById(R.id.river_italy);
        Glide.with(this).load(PicLinks.RIVER_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverItaly);

        AppCompatImageView towerItaly = findViewById(R.id.tower_italy);
        Glide.with(this).load(PicLinks.TOWER_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerItaly);

        AppCompatImageView castleItaly = findViewById(R.id.castle_italy);
        Glide.with(this).load(PicLinks.CASTLE_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleItaly);

        AppCompatImageView paduaUni = findViewById(R.id.padua_italy);
        Glide.with(this).load(PicLinks.PADUA_ITALY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(paduaUni);

        AppCompatImageView romeUniversity = findViewById(R.id.rome_university_italy);
        Glide.with(this).load(PicLinks.ROME_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(romeUniversity);

        AppCompatImageView milanUni = findViewById(R.id.milan_italy);
        Glide.with(this).load(PicLinks.MILAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(milanUni);

        AppCompatImageView turinUNi = findViewById(R.id.turin_italy);
        Glide.with(this).load(PicLinks.TURIN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(turinUNi);


        assicurazioniGenerali = findViewById(R.id.assicurazioni_generali);
        assicurazioniGenerali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ASSICURAZIONI_URL))));

        exor = findViewById(R.id.exor);
        exor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.EXOR_URL))));

        uniCredit = findViewById(R.id.uni_credit);
        uniCredit.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNICREDIT_URL))));

        eni = findViewById(R.id.eni);
        eni.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ENI_URL))));

        intesaSanpaolo = findViewById(R.id.intesa_sanpaolo);
        intesaSanpaolo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.INTESA_SANPAOLAO_URL))));

        posteItaliane = findViewById(R.id.poste_italiane);
        posteItaliane.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.POSTE_ITALIANE_URL))));

        generali = findViewById(R.id.generali);
        generali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GENERALI_URL))));

    }
}