package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        AppCompatImageView imageViewGlide=findViewById(R.id.bridge_china);
        Glide.with(this).load("https://images.pexels.com/photos/2412603/pexels-photo-2412603.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_china);
        Glide.with(this).load("https://images.unsplash.com/photo-1603120527222-33f28c2ce89e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dGhlJTIwZm9yYmlkZGVuJTIwY2l0eXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.river_china);
        Glide.with(this).load("https://images.unsplash.com/photo-1544158033-8b3ff400ee20?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dGhlJTIwc3VtbWVyJTIwcGFsYWNlJTJDJTIwYmVpamluZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.green_china);
        Glide.with(this).load("https://images.pexels.com/photos/235648/pexels-photo-235648.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.city_china);
        Glide.with(this).load("https://images.pexels.com/photos/745243/pexels-photo-745243.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.tsin_uni);
        Glide.with(this).load("https://www.timeshighereducation.com/sites/default/files/institution/header_image/profile_2017_-_header_-_tsinghua_uni.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.fuden);
        Glide.with(this).load("https://www.china-admissions.com/wp-content/uploads/2020/02/Fudan-Campus-02-scaled-e1604586273696.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.peking);
        Glide.with(this).load("https://media-cdn.tripadvisor.com/media/photo-s/04/83/13/5e/peking-university-beijing.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.wuhan);
        Glide.with(this).load("https://news.cgtn.com/news/2020-06-07/Live-Graduating-students-at-Wuhan-University-can-return-in-batches-R8mvhkVn2g/img/9e14f7850cc744aa985096fa959c4251/9e14f7850cc744aa985096fa959c4251.jpeg").into(imageViewGlide);


    }
}