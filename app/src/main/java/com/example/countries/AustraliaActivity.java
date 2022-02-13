package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class AustraliaActivity extends AppCompatActivity {
    AppCompatTextView telstra, anz, nab, westPac, cslAustralia, netBank, rioTinto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        AppCompatImageView sidney = findViewById(R.id.sidney);
        Glide.with(this).load(PicLinks.SIDNEY_AUS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sidney);

        AppCompatImageView darkSea = findViewById(R.id.dark_sea);
        Glide.with(this).load(PicLinks.DARK_SEA_AUS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(darkSea);

        AppCompatImageView bridgeAus = findViewById(R.id.bridge_australia);
        Glide.with(this).load(PicLinks.BRIDGE_AUS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeAus);

        AppCompatImageView streetAus = findViewById(R.id.street_australia);
        Glide.with(this).load(PicLinks.STREET_AUS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(streetAus);

        AppCompatImageView fallAus = findViewById(R.id.fall_australia);
        Glide.with(this).load(PicLinks.FALL_AUS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fallAus);

        AppCompatImageView monashUni = findViewById(R.id.monash);
        Glide.with(this).load(PicLinks.MONASH_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(monashUni);

        AppCompatImageView mellburneUni = findViewById(R.id.mellburne);
        Glide.with(this).load(PicLinks.MELLBURNE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mellburneUni);

        AppCompatImageView sydneyUni = findViewById(R.id.sydney);
        Glide.with(this).load(PicLinks.SYDNEY_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sydneyUni);

        AppCompatImageView walesUni = findViewById(R.id.wales);
        Glide.with(this).load(PicLinks.WALES_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(walesUni);


        telstra = findViewById(R.id.telstra);
        telstra.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TELSTRA_URL))));

        anz = findViewById(R.id.anz);
        anz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ANZ_URL))));

        nab = findViewById(R.id.nab);
        nab.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NAB_URL))));

        westPac = findViewById(R.id.westpac);
        westPac.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.WESTPAC_URL))));

        cslAustralia = findViewById(R.id.csl);
        cslAustralia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.CSL_URL))));

        netBank = findViewById(R.id.netbank);
        netBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NETBANK_URL))));

        rioTinto = findViewById(R.id.rio_tinto);
        rioTinto.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.RIOTINTO_URL))));
    }
}