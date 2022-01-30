package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class BrazilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView imageViewGlide=findViewById(R.id.rio_mountain_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/6580703/pexels-photo-6580703.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.waterfall_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/3889927/pexels-photo-3889927.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.see_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/975761/pexels-photo-975761.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);


        imageViewGlide = findViewById(R.id.mountain_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/1659438/pexels-photo-1659438.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.beach_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/10323141/pexels-photo-10323141.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.saopal_uni);
        Glide.with(this).load("https://aware.thi.de/fileadmin/daten/AWARE/Netzwerk_Partner/USP_by_Marcos_Santos.png").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.state_uni);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/en/thumb/6/67/Fcm-unicamp.jpg/800px-Fcm-unicamp.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.brasilla);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Universidade_de_Bras%C3%ADlia_Instituto_Central_de_Ci%C3%AAncias_Minhoc%C3%A3o_corredor.JPG/1024px-Universidade_de_Bras%C3%ADlia_Instituto_Central_de_Ci%C3%AAncias_Minhoc%C3%A3o_corredor.JPG").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.parana);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/8/8f/Universidade_Federal_do_Paran%C3%A1.jpg").into(imageViewGlide);

    }

}