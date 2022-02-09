package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SwedenActivity extends AppCompatActivity {

    AppCompatTextView ericsson, essity, handm, ikea, skanska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweden);

        ericsson = findViewById(R.id.Ericsson);
        ericsson.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ERICSSON_URL))));

        essity = findViewById(R.id.Essity);
        essity.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ESSITY_URL))));

        handm = findViewById(R.id.Handm);
        handm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HANDM_URL))));

        ikea = findViewById(R.id.IKEA);
        ikea.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.IKEA_URL))));

        skanska = findViewById(R.id.Skanska);
        skanska.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHANSKA_URL))));
    }
}