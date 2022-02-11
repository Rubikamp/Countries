package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class KoreaActivity extends AppCompatActivity {
    AppCompatTextView samsung, skHynix, lgChem, naver, hyundai, coupang, kakao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea);

        AppCompatImageView castleKorea = findViewById(R.id.castle_korea);
        Glide.with(this).load(PicLinks.CASTLE_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleKorea);

        AppCompatImageView cityKorea = findViewById(R.id.city_korea);
        Glide.with(this).load(PicLinks.CITY_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityKorea);

        AppCompatImageView roofKorea = findViewById(R.id.roof_korea);
        Glide.with(this).load(PicLinks.ROOF_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(roofKorea);

        AppCompatImageView towerKorea = findViewById(R.id.tower_korea);
        Glide.with(this).load(PicLinks.TOWER_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerKorea);

        AppCompatImageView buildingKorea = findViewById(R.id.building_korea);
        Glide.with(this).load(PicLinks.BUILDING_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(buildingKorea);

        AppCompatImageView sungUni = findViewById(R.id.sung_korea);
        Glide.with(this).load(PicLinks.SUNG_KOREA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sungUni);

        AppCompatImageView seoulUni = findViewById(R.id.seoul_korea);
        Glide.with(this).load(PicLinks.SEOUL_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seoulUni);

        AppCompatImageView hunkakUni = findViewById(R.id.hunkak_korea);
        Glide.with(this).load(PicLinks.HUNKAK_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(hunkakUni);

        AppCompatImageView yonesiUni = findViewById(R.id.yonesi_korea);
        Glide.with(this).load(PicLinks.YONESI_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(yonesiUni);


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