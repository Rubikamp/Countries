package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class AustraliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);


        AppCompatImageView imageViewGlide=findViewById(R.id.sidney);
        Glide.with(this).load("https://images.pexels.com/photos/1697309/pexels-photo-1697309.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.dark_see);
        Glide.with(this).load("https://images.pexels.com/photos/8030263/pexels-photo-8030263.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.bridge_australia);
        Glide.with(this).load("https://images.pexels.com/photos/1680247/pexels-photo-1680247.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.street_australia);
        Glide.with(this).load("https://images.pexels.com/photos/6123221/pexels-photo-6123221.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.fall_australia);
        Glide.with(this).load("https://images.pexels.com/photos/5876663/pexels-photo-5876663.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.monash);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1495561384.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.mellburne);
        Glide.with(this).load("https://img.emg-services.net/institutes/institute3393/uom-header.jpg").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.sydney);
        Glide.with(this).load("https://p7q8s5f8.rocketcdn.me/wp-content/uploads/2019/07/uni-sydney.jpg").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.wales);
        Glide.with(this).load("https://teanabroad.org/wp-content/uploads/2018/04/UNSW-Media-8-min.jpg").into(imageViewGlide);


    }
}