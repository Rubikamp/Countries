package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class TurkeyActivity extends AppCompatActivity {

    private AppCompatTextView erdemir, enka, kocHolding, izdemir, garantiBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        erdemir = findViewById(R.id.erdemir);
        erdemir.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiy3eKb2uP1AhUrzYUKHYI3CDEQFnoECAYQAQ&url=https%3A%2F%2Fwww.erdemir.com.tr%2Fhomepage%2F&usg=AOvVaw2IDzRHT8kZ1TIFdpxj_qsc"))));

        enka = findViewById(R.id.enka);
        enka.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiq8ZOo2uP1AhWsyoUKHehaDGsQFnoECAYQAQ&url=https%3A%2F%2Fwww.enka.com%2Fabout-us%2Fcompany-profile%2F&usg=AOvVaw0p4qVubkNDzbl017G5C2T_"))));

        kocHolding = findViewById(R.id.koc_holding);
        kocHolding.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj9id2y2uP1AhWyyIUKHaLdC9YQFnoECAcQAQ&url=https%3A%2F%2Fwww.koc.com.tr%2Fen&usg=AOvVaw1dSFqFyvKS0B8eSbqkxfOI"))));

        izdemir = findViewById(R.id.izmir);
        izdemir.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiKsPbh2uP1AhWV3oUKHf4fAukQFnoECCwQAQ&url=https%3A%2F%2Fwww.listcompany.org%2FIzmir_Near_Turkey.html&usg=AOvVaw21moOfkeQFoMC3VsIT_qe8"))));

        garantiBank = findViewById(R.id.garantiBank);
        garantiBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi_l-Hr2uP1AhVErxoKHRiwAmMQFnoECAUQAQ&url=https%3A%2F%2Fwww.garantibbva.com.tr%2Fen%2Four_company%2Fabout_garanti%2Fgarantibank.page&usg=AOvVaw3uWIVGF5RECu2fWRGNV6U6"))));


        AppCompatImageView river = findViewById(R.id.river_turkey);
        Glide.with(this).load("https://images.pexels.com/photos/1836580/pexels-photo-1836580.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(river);

        AppCompatImageView city = findViewById(R.id.city_turkey);
        Glide.with(this).load("https://images.pexels.com/photos/2048865/pexels-photo-2048865.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(city);

        AppCompatImageView sky = findViewById(R.id.sky_turkey);
        Glide.with(this).load("https://images.pexels.com/photos/2668314/pexels-photo-2668314.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sky);

        AppCompatImageView bridge = findViewById(R.id.bridge_turkey);
        Glide.with(this).load("https://images.pexels.com/photos/45189/pexels-photo-45189.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridge);

        AppCompatImageView sea = findViewById(R.id.sea_turkey);
        Glide.with(this).load("https://media.istockphoto.com/photos/aerial-view-of-beautiful-yachts-and-boats-on-the-sea-at-sunset-in-picture-id1323653944?k=20&m=1323653944&s=612x612&w=0&h=FEWJqavvJdnxnljcQsr3s8Qsf8VYniB0aQjAGJTKimE=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sea);

        AppCompatImageView istanbul = findViewById(R.id.istanbul_uni);
        Glide.with(this).load("https://kms.jadaliyya.com/Images/357x383xo/bogzzici211104120116755~.png").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(istanbul);

        AppCompatImageView ankara = findViewById(R.id.ankara_turkey);
        Glide.with(this).load("https://soha-education.ir/wp-content/uploads/2021/04/222.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ankara);

        AppCompatImageView anadolu = findViewById(R.id.anadolu_turkey);
        Glide.with(this).load("https://media-exp1.licdn.com/dms/image/C4D1BAQEHyEg1gsglRw/company-background_10000/0/1607503912500?e=2159024400&v=beta&t=k5M-D1xBmeYqvgEJYa2M6J8s3NWjBYDEaq1gIXZizrU").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(anadolu);

        AppCompatImageView bogaz = findViewById(R.id.bogazici_turkey);
        Glide.with(this).load("https://ar.welovebuzz.com/wp-content/uploads/2018/08/ba%CC%82timent-d-universite%CC%81-d-istanbul-turquie-34519338.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bogaz);


    }
}