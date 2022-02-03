package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;


public class BelgiumActivity extends AppCompatActivity {

    private AppCompatTextView abInBev, kbcBank, ageAs, solVaySA, deXia, ucb, umiCore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belgium);

        abInBev = findViewById(R.id.ab_inbev);
        abInBev.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://fortune.com/company/anheuser-busch-inbev/"))));

        kbcBank = findViewById(R.id.kbc_bank);
        kbcBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.banktrack.org/bank/kbc"))));

        ageAs = findViewById(R.id.ageas);
        ageAs.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ageas.co.uk/about-ageas/who-we-are/"))));

        solVaySA = findViewById(R.id.solvaySA);
        solVaySA.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globaldata.com/company-profile/solvay-sa/"))));

        deXia = findViewById(R.id.dexia);
        deXia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globaldata.com/company-profile/solvay-sa/"))));

        ucb = findViewById(R.id.ucb);
        ucb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reuters.com/companies/UCB.BR"))));

        umiCore = findViewById(R.id.umicore);
        umiCore.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reuters.com/companies/UCB.BR"))));


        AppCompatImageView farmCastle = findViewById(R.id.farm_castle);
        Glide.with(this).load("https://images.pexels.com/photos/5272985/pexels-photo-5272985.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(farmCastle);

        AppCompatImageView castleCity = findViewById(R.id.castle_city_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/3254729/pexels-photo-3254729.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleCity);

        AppCompatImageView castle = findViewById(R.id.castle_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/6678595/pexels-photo-6678595.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castle);

        AppCompatImageView river = findViewById(R.id.river_belgium);
        Glide.with(this).load("https://images.pexels.com/photos/5499900/pexels-photo-5499900.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(river);

        AppCompatImageView city = findViewById(R.id.belgium_city);
        Glide.with(this).load("https://images.pexels.com/photos/7245252/pexels-photo-7245252.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(city);

        AppCompatImageView libre = findViewById(R.id.libre_belgium);
        Glide.with(this).load("https://th.bing.com/th/id/R.8d49e8815eadbb521e5258ebfe22df6a?rik=UhKLNa%2FAGkRkxw&pid=ImgRaw&r=0").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(libre);

        AppCompatImageView ghent = findViewById(R.id.ghent);
        Glide.with(this).load("https://www.educate-nigeria.com/wp-content/uploads/2019/01/Master-Mind-Scholarships-At-Ghent-University-Belgium-2019.jpeg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ghent);

        AppCompatImageView louvian = findViewById(R.id.louvian);
        Glide.with(this).load("https://th.bing.com/th/id/R.7c748c6dccd1b70764a081d6199b77d3?rik=9e2vxcWWIsg0Vg&pid=ImgRaw&r=0").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(louvian);

        AppCompatImageView kuUni = findViewById(R.id.ku_university);
        Glide.with(this).load("https://media.nature.com/full/natcar/branding_images/19887/original/KU-Leuven_branded.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(kuUni);


    }
}