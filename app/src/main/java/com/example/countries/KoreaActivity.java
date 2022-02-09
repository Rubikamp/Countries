package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class KoreaActivity extends AppCompatActivity {
    AppCompatTextView samsung, skHynix, lgChem, naver, hyundai, coupang, kakao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea);


        samsung = findViewById(R.id.samsung);
        samsung.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SAMSUNG_URL))));

        skHynix = findViewById(R.id.sk_hynix);
        skHynix.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SK_HYNIX_URL))));

        lgChem = findViewById(R.id.lg_chem);
        lgChem.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.LG_CHEM_URL))));

        naver = findViewById(R.id.naver);
        naver.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NAVAR_URL))));

        hyundai = findViewById(R.id.hyundai);
        hyundai.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HYUNDAI_URL))));

        coupang = findViewById(R.id.coupang);
        coupang.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.COUPANG_URL))));

        kakao = findViewById(R.id.kakao);
        kakao.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KAKO_URL))));

    }
}