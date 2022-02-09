package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {
    AppCompatTextView tencent, kweichow, alibaba, icbc, catl, meituan, petroChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);


        tencent = findViewById(R.id.Tencent);
        tencent.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TENCENT_URL))));

        kweichow = findViewById(R.id.Kweichow_Moutai);
        kweichow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KWEICHOW_MOUTAI_URL))));

        alibaba = findViewById(R.id.Alibaba);
        alibaba.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALIBABA_URL))));

        icbc = findViewById(R.id.ICBC);
        icbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ICBC_URL))));

        catl = findViewById(R.id.CATL);
        catl.setOnClickListener(v -> startActivity(new Intent( Intent.ACTION_VIEW, Uri.parse(PicLinks.CATL_URL))));

        meituan = findViewById(R.id.Meituan);
        meituan.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MEITUAN_URL))));

        petroChina = findViewById(R.id.PetroChina);
        petroChina.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PETROCHINA_URL))));


        AppCompatImageView imageViewGlide=findViewById(R.id.bridge_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.river_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.green_china);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.city_china);
        Glide.with(this).load("").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.tsin_uni);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.fuden);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.peking);
        Glide.with(this).load("").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.wuhan);
        Glide.with(this).load("").into(imageViewGlide);


    }
}