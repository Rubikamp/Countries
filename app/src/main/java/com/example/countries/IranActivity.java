package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class IranActivity extends AppCompatActivity {

    AppCompatTextView khalijeIran, mellatIran, melliBank, ghadirIran, parsianBnk, tejaratBank, parsianOil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iran);

        khalijeIran = findViewById(R.id.Khalije_iran);
        khalijeIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KHALIJE_IRAN_URL))));

        mellatIran = findViewById(R.id.Mellat_iran);
        mellatIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MELLAT_IRAN_URL))));

        melliBank = findViewById(R.id.Melli_bank);
        melliBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MELLI_BANK_URL))));

        ghadirIran = findViewById(R.id.Ghadir_iran);
        ghadirIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GHADIR_IRAN_URL))));

        parsianBnk = findViewById(R.id.Parsian_Bank);
        parsianBnk.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PARSIAN_BANK_URL))));

        tejaratBank = findViewById(R.id.Tejarat_Bank);
        tejaratBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TEJARAT_BANK_URL))));

        parsianOil = findViewById(R.id.Parsian_Oil);
        parsianOil.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PARSIAN_OIL_URL))));

    }
}