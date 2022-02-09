package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class SwitzerlandActivity extends AppCompatActivity {

    private AppCompatTextView Nestlé, roche, novartis, chubb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switzerland);


        Nestlé = findViewById(R.id.Nestlé);
        Nestlé.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiRx6H30eP1AhXRyIUKHYYSDqoQFnoECDoQAQ&url=https%3A%2F%2Fwww.nestle.com%2Faboutus&usg=AOvVaw3jcmdFgRlFSaRMJtkq7eMp"))));

        roche = findViewById(R.id.roche);
        roche.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiAsu-J0uP1AhXQyIUKHTf7DWIQFnoECCsQAQ&url=https%3A%2F%2Fwww.roche.com%2Fabout.htm&usg=AOvVaw3WnVDPDKDsLMJ0A6_M0-Ep"))));

        novartis = findViewById(R.id.novartis);
        novartis.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiDjIii0uP1AhUJ4YUKHTSIBxkQtwJ6BAgIEAM&url=https%3A%2F%2Fwww.novartis.com%2Fabout&usg=AOvVaw3gTzDQtR_jWCynznnIcl5U"))));

        chubb = findViewById(R.id.chubb);
        chubb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwje47Cr0uP1AhUJ3hoKHbARDlsQtwJ6BAgFEAM&url=https%3A%2F%2Fwww.chubb.com%2Fus-en%2Fabout-chubb%2Fwho-we-are.aspx&usg=AOvVaw3qVQBzcYVRAA1ikFoLdAt5"))));


        AppCompatImageView train = findViewById(R.id.train_switzerland);
        Glide.with(this).load("https://images.pexels.com/photos/773471/pexels-photo-773471.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(train);

        AppCompatImageView nature = findViewById(R.id.nature_switzerland);
        Glide.with(this).load("https://images.pexels.com/photos/922978/pexels-photo-922978.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nature);

        AppCompatImageView clouds = findViewById(R.id.clouds_switzerland);
        Glide.with(this).load("https://images.pexels.com/photos/415958/pexels-photo-415958.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(clouds);

        AppCompatImageView bridge = findViewById(R.id.bridge_switzerland);
        Glide.with(this).load("https://images.pexels.com/photos/2762921/pexels-photo-2762921.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridge);

        AppCompatImageView homes = findViewById(R.id.homes_switzerland);
        Glide.with(this).load("https://images.unsplash.com/photo-1605825831039-8b6b4199b04a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aW50ZXJsYWtlbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homes);

        AppCompatImageView nesdoa = findViewById(R.id.nesdoa_Switzerland);
        Glide.with(this).load("https://worldscholarshipforum.com/wp-content/uploads/2020/10/University-of-Zurich.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nesdoa);

        AppCompatImageView damalop = findViewById(R.id.dmalop_Switzerland);
        Glide.with(this).load("https://euroscholars.eu/images/made/64b5413671794cb5/unige_28674_840_500_s_c1_c_c.jpeg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(damalop);

        AppCompatImageView naloki = findViewById(R.id.naloki_Switzerland);
        Glide.with(this).load("https://www.wur.nl/upload/a7705f68-d597-439c-ac73-d5a854cda6c1_1.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(naloki);

        AppCompatImageView laniokd = findViewById(R.id.laniokd_Switzerland);
        Glide.with(this).load("https://scholarshipsforafricans.com/wp-content/uploads/2021/09/university-of-lausanne.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(laniokd);

    }
}