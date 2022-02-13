package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class AmericaActivity extends AppCompatActivity {
    private AppCompatTextView amazon, microsoft, walmart, costco, tesla, apple, google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        AppCompatImageView whiteHouse = findViewById(R.id.white_house);
        Glide.with(this).load(PicLinks.WHITE_HOUSE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(whiteHouse);

        AppCompatImageView bridgeAmerica = findViewById(R.id.bridge_america);
        Glide.with(this).load(PicLinks.BRIDGE_AMERICA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeAmerica);

        AppCompatImageView castleAmerica = findViewById(R.id.castle_america);
        Glide.with(this).load(PicLinks.CASTLE_AMERICA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleAmerica);

        AppCompatImageView libretyAmerica = findViewById(R.id.librety_america);
        Glide.with(this).load(PicLinks.LIBRETY_AMERICA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(libretyAmerica);

        AppCompatImageView mountainAmerica = findViewById(R.id.mountain_america);
        Glide.with(this).load(PicLinks.MOUNTAIN_AMERICA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainAmerica);

        AppCompatImageView antwerp = findViewById(R.id.antwerp);
        Glide.with(this).load(PicLinks.ANTWERP_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(antwerp);

        AppCompatImageView harvardUni = findViewById(R.id.harvard);
        Glide.with(this).load(PicLinks.HARVARD_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(harvardUni);

        AppCompatImageView cornellUni = findViewById(R.id.cornell);
        Glide.with(this).load(PicLinks.CORNELL_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cornellUni);

        AppCompatImageView coloumbiaUni = findViewById(R.id.coloumbia);
        Glide.with(this).load(PicLinks.COLOUMBIA_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(coloumbiaUni);


        amazon = findViewById(R.id.amazon_us);
        amazon.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.AMAZON_URL))));

        microsoft = findViewById(R.id.microsoft);
        microsoft.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MICROSOFT_URL))));

        walmart = findViewById(R.id.walmart);
        walmart.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.WALMART_URL))));

        costco = findViewById(R.id.Costco);
        costco.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.COSTCO_URL))));

        tesla = findViewById(R.id.tesla);
        tesla.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TESLA_URL))));

        apple = findViewById(R.id.apple);
        apple.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.APPLE_URL))));

        google = findViewById(R.id.google);
        google.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GOOGLE_URL))));
    }
}