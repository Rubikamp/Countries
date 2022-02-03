package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class AustraliaActivity extends AppCompatActivity {

    private AppCompatTextView telstra, anz, nab, westPac, cslAustralia, netBank, rioTinto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        telstra = findViewById(R.id.telstra);
        telstra.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.telstra.com.au/aboutus/our-company"))));

        anz = findViewById(R.id.anz);
        anz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unepfi.org/member/australia-new-zealand-banking-group-limited-anz/"))));

        nab = findViewById(R.id.nab);
        nab.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nab.com.au/about-us"))));

        westPac = findViewById(R.id.westpac);
        westPac.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.westpac.com.au/about-westpac/westpac-group/company-overview/our-history/"))));

        cslAustralia = findViewById(R.id.csl);
        cslAustralia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cslplasma.com/about-csl-plasma"))));

        netBank = findViewById(R.id.netbank);
        netBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bworldonline.com/netbank-a-banking-as-a-service-platform-launched-in-the-philippines/"))));

        rioTinto = findViewById(R.id.rio_tinto);
        rioTinto.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.riotinto.com/about/business"))));

        AppCompatImageView sidney = findViewById(R.id.sidney);
        Glide.with(this).load("https://images.pexels.com/photos/1697309/pexels-photo-1697309.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sidney);

        AppCompatImageView darkSea = findViewById(R.id.dark_see);
        Glide.with(this).load("https://images.pexels.com/photos/8030263/pexels-photo-8030263.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(darkSea);


        AppCompatImageView bridgeAustralia = findViewById(R.id.bridge_australia);
        Glide.with(this).load("https://images.pexels.com/photos/1680247/pexels-photo-1680247.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeAustralia);


        AppCompatImageView streetAustralia = findViewById(R.id.street_australia);
        Glide.with(this).load("https://images.pexels.com/photos/6123221/pexels-photo-6123221.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(streetAustralia);


        AppCompatImageView fallAustralia = findViewById(R.id.fall_australia);
        Glide.with(this).load("https://images.pexels.com/photos/5876663/pexels-photo-5876663.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fallAustralia);

        AppCompatImageView monash = findViewById(R.id.monash);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1495561384.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(monash);

        AppCompatImageView melBurn = findViewById(R.id.mellburne);
        Glide.with(this).load("https://img.emg-services.net/institutes/institute3393/uom-header.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(melBurn);


        AppCompatImageView sydney = findViewById(R.id.sydney);
        Glide.with(this).load("https://p7q8s5f8.rocketcdn.me/wp-content/uploads/2019/07/uni-sydney.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sydney);


        AppCompatImageView wales = findViewById(R.id.wales);
        Glide.with(this).load("https://teanabroad.org/wp-content/uploads/2018/04/UNSW-Media-8-min.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(wales);


    }
}