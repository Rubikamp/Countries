package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class NorwayActivity extends AppCompatActivity {


    private AppCompatTextView equinor, telenor, aker, orkla, Kværner, total_norge, norsk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norway);


        equinor = findViewById(R.id.equinor);
        equinor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj5oZHBwuP1AhWEA2MBHdnaCRkQFnoECAUQAQ&url=https%3A%2F%2Fwww.equinor.com%2F&usg=AOvVaw1sIN3GerOhESQGOBXgE1PH"))));

        telenor = findViewById(R.id.telenor);
        telenor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjGws70wuP1AhWC3OAKHT1uChgQFnoECBEQAw&url=https%3A%2F%2Fwww.referenceforbusiness.com%2Fhistory2%2F61%2FTelenor-ASA.html&usg=AOvVaw0VoEzXz7FWkRMc7JDdYe6a"))));

        aker = findViewById(R.id.aker);
        aker.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjjts2Nw-P1AhUS8eAKHfQkBBkQFnoECDcQAQ&url=https%3A%2F%2Fwww.akersolutions.com%2F&usg=AOvVaw0-C5uZO1ya1hE2TdZ0ods2"))));

        orkla = findViewById(R.id.orkla);
        orkla.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjArcarw-P1AhXyA2MBHacmDxkQFnoECA4QAw&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FOrkla_ASA&usg=AOvVaw3I8yJA-3dxXyEjvHNkc4-Q"))));

        Kværner = findViewById(R.id.Kværner);
        Kværner.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwidhJfrw-P1AhXjDWMBHdlCDBgQFnoECEIQAQ&url=https%3A%2F%2Fwww.akersolutions.com%2F&usg=AOvVaw0-C5uZO1ya1hE2TdZ0ods2"))));

        total_norge = findViewById(R.id.total_norge);
        total_norge.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwionOyjxOP1AhVSzoUKHSdtCGoQFnoECBEQAQ&url=https%3A%2F%2Fcorporate.totalenergies.no%2F&usg=AOvVaw1mA_Ib_FKHFErXsubDEXKo"))));

        norsk = findViewById(R.id.norsk);
        norsk.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjYu6O-xOP1AhUizIUKHSkWAwMQFnoECAcQAw&url=https%3A%2F%2Fnorsk.global%2Fabout-norsk%2F&usg=AOvVaw1PUAA3LyjCZK7T60il4zOy"))));


        AppCompatImageView farmNorway = findViewById(R.id.farm_norway);
        Glide.with(this).load("https://images.pexels.com/photos/1559821/pexels-photo-1559821.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(farmNorway);

        AppCompatImageView skyNorway = findViewById(R.id.sky_norway);
        Glide.with(this).load("https://images.pexels.com/photos/1674624/pexels-photo-1674624.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(skyNorway);

        AppCompatImageView mountainNorway = findViewById(R.id.mountain_norway);
        Glide.with(this).load("https://images.pexels.com/photos/1647962/pexels-photo-1647962.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainNorway);

        AppCompatImageView cityNorway = findViewById(R.id.city_norway);
        Glide.with(this).load("https://media.istockphoto.com/photos/tromso-harbour-norway-picture-id1033240454?k=20&m=1033240454&s=612x612&w=0&h=vedjwAkpMtS2Y1-qTgGPSupDzMd718m9X37Dh7eYqUU=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityNorway);

        AppCompatImageView homeNorway = findViewById(R.id.home_norway);
        Glide.with(this).load("https://images.pexels.com/photos/356632/pexels-photo-356632.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeNorway);

        AppCompatImageView tottalUni = findViewById(R.id.tottal_norway);
        Glide.with(this).load("https://www.uib.no/sites/w3.uib.no/files/styles/content_main/public/media/uib_bilde.jpg?itok=TqRP8SMz&timestamp=1579195073").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tottalUni);

        AppCompatImageView birgenNorway = findViewById(R.id.birgen_norway);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/3/31/Oslo_Universitet_2.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(birgenNorway);

        AppCompatImageView tinkenNorway = findViewById(R.id.tinken_norway);
        Glide.with(this).load("https://p5g5m8i4.rocketcdn.me/wp-content/uploads/2021/06/University-of-Agder.png").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tinkenNorway);

        AppCompatImageView bonesUni = findViewById(R.id.bones_norway);
        Glide.with(this).load("https://ezapply.ir/sliders/slider_1519406152.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bonesUni);


    }
}