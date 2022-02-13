package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class GermanyActivity extends AppCompatActivity {
    AppCompatTextView volkswagen, daimler, allianz, bmw, siemens, bosch, uniper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        AppCompatImageView castleGermany = findViewById(R.id.castle_germany);
        Glide.with(this).load(PicLinks.CASTLE_GERMANY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleGermany);

        AppCompatImageView placeGermany = findViewById(R.id.place_germany);
        Glide.with(this).load(PicLinks.PLACE_GERMANY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(placeGermany);

        AppCompatImageView bridgeGermany = findViewById(R.id.bridge_germany);
        Glide.with(this).load(PicLinks.BRIDGE_GERMANY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeGermany);

        AppCompatImageView darkBridgeGermany = findViewById(R.id.dark_bridge_germany);
        Glide.with(this).load(PicLinks.DARK_BRIDGE_GERMANY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(darkBridgeGermany);

        AppCompatImageView blueCastle = findViewById(R.id.blue_castle_germany);
        Glide.with(this).load(PicLinks.BLUE_CASTLE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(blueCastle);

        AppCompatImageView heideGermanyUni = findViewById(R.id.heide_germany);
        Glide.with(this).load(PicLinks.HEID_GERMANY_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(heideGermanyUni);

        AppCompatImageView berlinUni = findViewById(R.id.berlin_germany);
        Glide.with(this).load(PicLinks.BERLIN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(berlinUni);

        AppCompatImageView munchanUni = findViewById(R.id.munchan_germany);
        Glide.with(this).load(PicLinks.MUNCHAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(munchanUni);

        AppCompatImageView frieUni = findViewById(R.id.frie_germany);
        Glide.with(this).load(PicLinks.FRIE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(frieUni);


        volkswagen = findViewById(R.id.volkswagen);
        volkswagen.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOLKSWAGEN_URL))));

        daimler = findViewById(R.id.DIAMLER);
        daimler.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIAMLER_URL))));

        allianz = findViewById(R.id.allianz);
        allianz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALLIANZ_URL))));

        bmw = findViewById(R.id.bmw);
        bmw.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BMW_URL))));

        siemens = findViewById(R.id.siemens);
        siemens.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SIEMENS_URL))));

        bosch = findViewById(R.id.bosch);
        bosch.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BOSCH_URL))));

        uniper = findViewById(R.id.uniper);
        uniper.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNIPER_URL))));

    }
}