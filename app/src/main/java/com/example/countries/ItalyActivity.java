package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ItalyActivity extends AppCompatActivity {

    AppCompatTextView assicurazioniGenerali, exor, uniCredit, eni, intesaSanpaolo, posteItaliane, generali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        assicurazioniGenerali = findViewById(R.id.Assicurazioni_Generali);
        assicurazioniGenerali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ASSICURAZIONI_URL))));

        exor = findViewById(R.id.Exor);
        exor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.EXOR_URL))));

        uniCredit = findViewById(R.id.UniCredit);
        uniCredit.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNICREDIT_URL))));

        eni = findViewById(R.id.eni);
        eni.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ENI_URL))));

        intesaSanpaolo = findViewById(R.id.Intesa_Sanpaolo);
        intesaSanpaolo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.INTESA_SANPAOLAO_URL))));

        posteItaliane = findViewById(R.id.Poste_italiane);
        posteItaliane.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.POSTE_ITALIANE_URL))));

        generali = findViewById(R.id.Generali);
        generali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GENERALI_URL))));
    }
}