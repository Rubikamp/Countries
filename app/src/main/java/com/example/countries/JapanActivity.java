package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class JapanActivity extends AppCompatActivity {
    AppCompatTextView toyotaMotor, mitsubishi, hondaMotor, itochu, sony, hitachi, nipponTelegraph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);


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