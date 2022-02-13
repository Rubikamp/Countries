package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class JapanActivity extends AppCompatActivity {
    AppCompatTextView toyotaMotor, mitsubishi, hondaMotor, itochu, sony, hitachi, nipponTelegraph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);

        AppCompatImageView treeJapan = findViewById(R.id.tree_japan);
        Glide.with(this).load(PicLinks.TREE_JAPAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(treeJapan);

        AppCompatImageView skyJapan = findViewById(R.id.sky_japan);
        Glide.with(this).load(PicLinks.SKY_JAPAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(skyJapan);

        AppCompatImageView cityJapan = findViewById(R.id.city_japan);
        Glide.with(this).load(PicLinks.CITY_JAPAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityJapan);

        AppCompatImageView mountainJapan = findViewById(R.id.mountain_japan);
        Glide.with(this).load(PicLinks.MOUNTAIN_JAPAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainJapan);

        AppCompatImageView castleJapan = findViewById(R.id.castle_japan);
        Glide.with(this).load(PicLinks.CASTLE_JAPAN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleJapan);

        AppCompatImageView tokyoUni = findViewById(R.id.tokyo_japan);
        Glide.with(this).load(PicLinks.TOKYO_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tokyoUni);

        AppCompatImageView nihonUni = findViewById(R.id.nihon_japan);
        Glide.with(this).load(PicLinks.NIHON_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nihonUni);

        AppCompatImageView tohonoUni = findViewById(R.id.tohono_japan);
        Glide.with(this).load(PicLinks.TOHONO_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tohonoUni);

        AppCompatImageView kyishuUni = findViewById(R.id.kyishu_japan);
        Glide.with(this).load(PicLinks.KYUSHI_UNI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(kyishuUni);


        toyotaMotor = findViewById(R.id.toyota_motor);
        toyotaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TOYOTA_MOTOR_URL))));

        mitsubishi = findViewById(R.id.mitsubishi);
        mitsubishi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MITSUBISHI_URL))));

        hondaMotor = findViewById(R.id.honda_motor);
        hondaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HONDA_MOTOR_URL))));

        itochu = findViewById(R.id.itochu);
        itochu.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ITOCHU_URL))));

        sony = findViewById(R.id.sony);
        sony.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SONY_URL))));

        hitachi = findViewById(R.id.hitachi);
        hitachi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HITACHI_URL))));

        nipponTelegraph = findViewById(R.id.nippon_telegraph);
        nipponTelegraph.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NIPPON_TELEGRAPH_URL))));

    }
}