package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class ThailandActivity extends AppCompatActivity {

     AppCompatTextView ptt, cpAll, siam, thai, skanska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thailand);

        ptt = findViewById(R.id.ptt);
        ptt.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.PTT_URL))));

        cpAll = findViewById(R.id.cp_all);
        cpAll.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.CP_URL))));

        siam = findViewById(R.id.siam);
        siam.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SIAM_URL))));

        thai = findViewById(R.id.thai);
        thai.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.THAI_URL))));

        skanska = findViewById(R.id.skanska);
        skanska.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHANSKAMA_URL))));



    }
}