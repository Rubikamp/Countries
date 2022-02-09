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

        toyotaMotor = findViewById(R.id.Toyota_Motor);
        toyotaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.TOYOTA_MOTOR_URL))));

        mitsubishi = findViewById(R.id.Mitsubishi);
        mitsubishi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.MITSUBISHI_URL))));

        hondaMotor = findViewById(R.id.Honda_Motor);
        hondaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HONDA_MOTOR_URL))));

        itochu = findViewById(R.id.Itochu);
        itochu.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ITOCHU_URL))));

        sony = findViewById(R.id.Sony);
        sony.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SONY_URL))));

        hitachi = findViewById(R.id.Hitachi);
        hitachi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HITACHI_URL))));

        nipponTelegraph = findViewById(R.id.Nippon_Telegraph);
        nipponTelegraph.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.NIPPON_TELEGRAPH_URL))));

    }
}