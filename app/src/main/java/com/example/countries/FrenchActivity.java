package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class FrenchActivity extends AppCompatActivity {
    AppCompatTextView lvmh, lOreal, hermes, dior, sanofi, kering, bnp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);

        AppCompatImageView towerFrench = findViewById(R.id.tower_french);
        Glide.with(this).load(PicLinks.TOWER_FRENCH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerFrench);

        AppCompatImageView castleFrench = findViewById(R.id.castle_french);
        Glide.with(this).load(PicLinks.CASTLE_FRENCH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleFrench);

        AppCompatImageView streetFrench = findViewById(R.id.street_french);
        Glide.with(this).load(PicLinks.STREET_FRENCH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(streetFrench);

        AppCompatImageView homeFrench = findViewById(R.id.home_french);
        Glide.with(this).load(PicLinks.HOME_FRENCH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeFrench);

        AppCompatImageView natureFrench = findViewById(R.id.nature_french);
        Glide.with(this).load(PicLinks.NATURE_FRENCH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(natureFrench);

        AppCompatImageView parisUni = findViewById(R.id.paris_uni);
        Glide.with(this).load(PicLinks.PARIS_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(parisUni);

        AppCompatImageView bononeUni = findViewById(R.id.bonone_paris);
        Glide.with(this).load(PicLinks.BONONE_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bononeUni);

        AppCompatImageView defrenchUni = findViewById(R.id.uni_defrench);
        Glide.with(this).load(PicLinks.DEFRENCH_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(defrenchUni);

        AppCompatImageView strabonUni = findViewById(R.id.strabon);
        Glide.with(this).load(PicLinks.STRABON_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(strabonUni);


        lvmh = findViewById(R.id.lvmh);
        lvmh.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi3-_ODleP1AhVKOBoKHXXWDpwQFnoECDsQAQ&url=https%3A%2F%2Fwww.mhdkk.com%2Fen%2Fabout%2Flvmh%2F&usg=AOvVaw1a6Sz2J0Z1JmvMcE-CXvYq"))));

        lOreal = findViewById(R.id.LOERAL);
        lOreal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.LOERAL_URL))));

        hermes = findViewById(R.id.Hermes);
        hermes.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HERMES_URL))));

        dior = findViewById(R.id.dior);
        dior.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIOR_URL))));

        sanofi = findViewById(R.id.sanofi);
        sanofi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SANOFI_URL))));

        kering = findViewById(R.id.kering);
        kering.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KERING_URL))));

        bnp = findViewById(R.id.bnp);
        bnp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BNP_URL))));


    }
}