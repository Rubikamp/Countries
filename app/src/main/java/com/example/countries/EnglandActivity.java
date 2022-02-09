package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class EnglandActivity extends AppCompatActivity {
    AppCompatTextView bats, glaxoSmith, astraZenca, hsbc, diageo, shell, unilever;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);

        bats = findViewById(R.id.bats);
        bats.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.BATS_URL))));

        glaxoSmith = findViewById(R.id.glaxo_smith_kline);
        glaxoSmith.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.GLAXOSMITHKLINE_URL))));

        astraZenca = findViewById(R.id.astra_zeneca);
        astraZenca.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ASTRAZENECA_URL))));

        hsbc = findViewById(R.id.hsbc);
        hsbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HCBC_URL))));

        diageo = findViewById(R.id.diageo);
        diageo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.DIAGEO_URL))));

        shell = findViewById(R.id.shell);
        shell.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHELL_URL))));

        unilever = findViewById(R.id.unilever);
        unilever.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.UNILEVER_URL))));


    }

}