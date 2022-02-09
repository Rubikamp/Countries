package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class AmericaActivity extends AppCompatActivity {
    AppCompatTextView amazon, microsoft, walmart, costco, tesla, apple, google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);


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