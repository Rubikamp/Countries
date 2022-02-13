package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class EnglandActivity extends AppCompatActivity {
    AppCompatTextView bats, glaxoSmith, astraZenca, hsbc, diageo, shell, unilever;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);

        AppCompatImageView busUK = findViewById(R.id.bus_uk);
        Glide.with(this).load(PicLinks.BUS_UK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(busUK);

        AppCompatImageView bridgeUK = findViewById(R.id.bridge_uk);
        Glide.with(this).load(PicLinks.BRIDGE_UK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeUK);

        AppCompatImageView castleUK = findViewById(R.id.castle_uk);
        Glide.with(this).load(PicLinks.CASTLE_UK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleUK);

        AppCompatImageView rocksUK = findViewById(R.id.rocks_uk);
        Glide.with(this).load(PicLinks.ROCKS_UK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(rocksUK);

        AppCompatImageView carouselUK = findViewById(R.id.carousel_uk);
        Glide.with(this).load(PicLinks.CAROUSEL_UK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(carouselUK);

        AppCompatImageView imperialUni = findViewById(R.id.imperial);
        Glide.with(this).load(PicLinks.IMPERIAL_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imperialUni);

        AppCompatImageView collageLondon = findViewById(R.id.college_london);
        Glide.with(this).load(PicLinks.COLLAGE_LONDON_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(collageLondon);

        AppCompatImageView oxfordUni = findViewById(R.id.oxford);
        Glide.with(this).load(PicLinks.OXFORD_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(oxfordUni);

        AppCompatImageView manchesterUni = findViewById(R.id.manchester);
        Glide.with(this).load(PicLinks.MANCHESTER_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(manchesterUni);


        bats = findViewById(R.id.bats);
        bats.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BATS_URL))));

        glaxoSmith = findViewById(R.id.glaxo_smith_kline);
        glaxoSmith.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GLAXOSMITHKLINE_URL))));

        astraZenca = findViewById(R.id.astra_zeneca);
        astraZenca.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ASTRAZENECA_URL))));

        hsbc = findViewById(R.id.hsbc);
        hsbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HCBC_URL))));

        diageo = findViewById(R.id.diageo);
        diageo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIAGEO_URL))));

        shell = findViewById(R.id.shell);
        shell.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHELL_URL))));

        unilever = findViewById(R.id.unilever);
        unilever.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNILEVER_URL))));


    }

}