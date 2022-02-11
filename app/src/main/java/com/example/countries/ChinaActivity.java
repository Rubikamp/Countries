package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {

    AppCompatTextView tencent, kweichow, alibaba, icbc, catl, meituan, petroChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        AppCompatImageView bridgeChina = findViewById(R.id.waterloo);
        Glide.with(this).load(PicLinks.BRIDGE_CHINA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeChina);

        AppCompatImageView castleChina = findViewById(R.id.castle_china);
        Glide.with(this).load(PicLinks.CASTLE_CHINA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleChina);

        AppCompatImageView riverChina = findViewById(R.id.river_china);
        Glide.with(this).load(PicLinks.RIVER_CHINA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverChina);

        AppCompatImageView greenChina = findViewById(R.id.green_china);
        Glide.with(this).load(PicLinks.GREEN_CHINA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(greenChina);

        AppCompatImageView cityChina = findViewById(R.id.city_china);
        Glide.with(this).load(PicLinks.CITY_CHINA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityChina);

        AppCompatImageView tsiUni = findViewById(R.id.tsin_uni);
        Glide.with(this).load(PicLinks.TSI_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tsiUni);

        AppCompatImageView fudenUni = findViewById(R.id.fuden);
        Glide.with(this).load(PicLinks.FUDEN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fudenUni);

        AppCompatImageView pekingUni = findViewById(R.id.peking);
        Glide.with(this).load(PicLinks.PEKING_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(pekingUni);

        AppCompatImageView wuhanUni = findViewById(R.id.wuhan);
        Glide.with(this).load(PicLinks.WUHAN_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(wuhanUni);


        tencent = findViewById(R.id.tencent);
        tencent.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TENCENT_URL))));

        kweichow = findViewById(R.id.kweichow_koutai);
        kweichow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KWEICHOW_MOUTAI_URL))));

        alibaba = findViewById(R.id.alibaba);
        alibaba.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALIBABA_URL))));

        icbc = findViewById(R.id.icbc);
        icbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ICBC_URL))));

        catl = findViewById(R.id.catl);
        catl.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.CATL_URL))));

        meituan = findViewById(R.id.meituan);
        meituan.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MEITUAN_URL))));

        petroChina = findViewById(R.id.petro_china);
        petroChina.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PETROCHINA_URL))));


    }
}