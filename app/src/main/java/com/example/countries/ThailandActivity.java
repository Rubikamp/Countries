package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class ThailandActivity extends AppCompatActivity {

    AppCompatTextView ptt, cpAll, siam, thai, skanska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thailand);

        AppCompatImageView riverThailand = findViewById(R.id.river_thailand);
        Glide.with(this).load(PicLinks.RIVER_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverThailand);

        AppCompatImageView bridgeThailand = findViewById(R.id.bridge_thailand);
        Glide.with(this).load(PicLinks.BRIDGE_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeThailand);

        AppCompatImageView fishThailand = findViewById(R.id.fish_thailand);
        Glide.with(this).load(PicLinks.FISH_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fishThailand);

        AppCompatImageView shopThailand = findViewById(R.id.shop_thailand);
        Glide.with(this).load(PicLinks.SHOP_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(shopThailand);

        AppCompatImageView castleThailand = findViewById(R.id.castle_thailand);
        Glide.with(this).load(PicLinks.CASTLE_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleThailand);

        AppCompatImageView jiandkUni = findViewById(R.id.jiandk_thailand);
        Glide.with(this).load(PicLinks.JIANDK_UNI_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(jiandkUni);

        AppCompatImageView naaklspeUni = findViewById(R.id.naaklspe_thailand);
        Glide.with(this).load(PicLinks.NAAKLSPE_UNI_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(naaklspeUni);

        AppCompatImageView naolamUni = findViewById(R.id.naolam_thailand);
        Glide.with(this).load(PicLinks.NAOLAKI_UNI_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(naolamUni);

        AppCompatImageView nsusnaUni = findViewById(R.id.nsusna_thailand);
        Glide.with(this).load(PicLinks.NSUSA_UNI_THAILAND_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nsusnaUni);


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