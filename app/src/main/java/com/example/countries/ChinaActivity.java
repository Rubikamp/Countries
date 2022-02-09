package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {

    AppCompatTextView tencent, kweichow, alibaba, icbc, catl, meituan, petroChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);



        tencent = findViewById(R.id.tencent);
        tencent.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TENCENT_URL))));

        kweichow = findViewById(R.id.kweichow_koutai);
        kweichow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.KWEICHOW_MOUTAI_URL))));

        alibaba = findViewById(R.id.alibaba);
        alibaba.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ALIBABA_URL))));

        icbc = findViewById(R.id.icbc);
        icbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ICBC_URL))));

        catl = findViewById(R.id.catl);
        catl.setOnClickListener(v -> startActivity(new Intent( Intent.ACTION_VIEW, Uri.parse(PicLinks.CATL_URL))));

        meituan = findViewById(R.id.meituan);
        meituan.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MEITUAN_URL))));

        petroChina = findViewById(R.id.petro_china);
        petroChina.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PETROCHINA_URL))));


    }
}