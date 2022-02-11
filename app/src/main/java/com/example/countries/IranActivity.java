package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class IranActivity extends AppCompatActivity {

    AppCompatTextView khalijeIran, mellatIran, melliBank, ghadirIran, parsianBnk, tejaratBank, parsianOil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iran);

        AppCompatImageView bridgeIran = findViewById(R.id.bridge_iran);
        Glide.with(this).load(PicLinks.BRIDGE_IRAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeIran);

        AppCompatImageView towerAzadi = findViewById(R.id.tower_azadi_iran);
        Glide.with(this).load(PicLinks.TOWER_AZADI_IRAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerAzadi);

        AppCompatImageView castleIran = findViewById(R.id.castle_iran);
        Glide.with(this).load(PicLinks.CASTLE_IRAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleIran);

        AppCompatImageView masque = findViewById(R.id.masque_iran);
        Glide.with(this).load(PicLinks.MASQUE_IRAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(masque);

        AppCompatImageView milanIran = findViewById(R.id.milad_iran);
        Glide.with(this).load(PicLinks.MILAD_IRAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(milanIran);

        AppCompatImageView tabrizUni = findViewById(R.id.tabriz_iran);
        Glide.with(this).load(PicLinks.TABRIZ_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tabrizUni);

        AppCompatImageView sharifUni = findViewById(R.id.sharif_iran);
        Glide.with(this).load(PicLinks.SHARIF_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sharifUni);

        AppCompatImageView tehranUni = findViewById(R.id.tehran_iran);
        Glide.with(this).load(PicLinks.TEHRAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tehranUni);

        AppCompatImageView isfahanUni = findViewById(R.id.isfahan_iran);
        Glide.with(this).load(PicLinks.ISFAHAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(isfahanUni);


        khalijeIran = findViewById(R.id.khalije_iran);
        khalijeIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KHALIJE_IRAN_URL))));

        mellatIran = findViewById(R.id.mellat_iran);
        mellatIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MELLAT_IRAN_URL))));

        melliBank = findViewById(R.id.melli_bank);
        melliBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MELLI_BANK_URL))));

        ghadirIran = findViewById(R.id.ghadir_iran);
        ghadirIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GHADIR_IRAN_URL))));

        parsianBnk = findViewById(R.id.parsian_bank);
        parsianBnk.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PARSIAN_BANK_URL))));

        tejaratBank = findViewById(R.id.tejarat_bank);
        tejaratBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TEJARAT_BANK_URL))));

        parsianOil = findViewById(R.id.parsian_oil);
        parsianOil.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PARSIAN_OIL_URL))));

    }
}