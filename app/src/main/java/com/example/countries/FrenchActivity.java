package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class FrenchActivity extends AppCompatActivity {

    private AppCompatTextView lvmh, lOreal, hermes, dior, sanofi, kering, bnp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);

        lvmh = findViewById(R.id.lvmh);
        lvmh.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi3-_ODleP1AhVKOBoKHXXWDpwQFnoECDsQAQ&url=https%3A%2F%2Fwww.mhdkk.com%2Fen%2Fabout%2Flvmh%2F&usg=AOvVaw1a6Sz2J0Z1JmvMcE-CXvYq"))));

        lOreal = findViewById(R.id.loreal);
        lOreal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjSoorrleP1AhWNz4UKHaLTAroQFnoECFwQAQ&url=https%3A%2F%2Fwww.lorealparisusa.com%2Fabout-us&usg=AOvVaw1WB9NzWiuEXs15queZCEf-"))));

        hermes = findViewById(R.id.hermes);
        hermes.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjTnOiSl-P1AhVG6RoKHbQ1Co4QFnoECAYQAQ&url=https%3A%2F%2Fwww.hermesworld.com%2Fint%2Fabout-us%2F&usg=AOvVaw0l8AqWDU7_LJ395NUSzh8k"))));

        dior = findViewById(R.id.dior);
        dior.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjnp6u2l-P1AhUizoUKHaSSB1gQFnoECEgQAQ&url=https%3A%2F%2Fwww.lvmh.com%2Fhouses%2Ffashion-leather-goods%2Fchristian-dior%2F&usg=AOvVaw3mzzTfdabkMY6kMgOfxoWN"))));

        sanofi = findViewById(R.id.sanofi);
        sanofi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjxi-GtmOP1AhXIz4UKHQ8NAfoQFnoECC4QAQ&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FSanofi-Aventis&usg=AOvVaw1QtZ0bH_Cvq2vB1i-bOhTv"))));

        kering = findViewById(R.id.kering);
        kering.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiZuru6meP1AhUG2BoKHb3AB-YQFnoECDYQAQ&url=https%3A%2F%2Fmartinroll.com%2Fresources%2Farticles%2Fstrategy%2Fkering-evolution-of-a-global-luxury-brand-company%2F&usg=AOvVaw2gQ9NVgYfeSMpwYLA_HJ17"))));

        bnp = findViewById(R.id.bnp);
        bnp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiU2dSGmuP1AhVmxYUKHXHyBrwQFnoECDMQAQ&url=https%3A%2F%2Fgroup.bnpparibas%2Fen%2Fgroup%2Four-company-purpose&usg=AOvVaw1yzcHhKkaUoKh4oiET8axr"))));


        AppCompatImageView towerFrench = findViewById(R.id.tower_french);
        Glide.with(this).load("https://images.pexels.com/photos/699466/pexels-photo-699466.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerFrench);

        AppCompatImageView castleFrench = findViewById(R.id.castle_french);
        Glide.with(this).load("https://images.pexels.com/photos/705764/pexels-photo-705764.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleFrench);

        AppCompatImageView streetFrench = findViewById(R.id.street_french);
        Glide.with(this).load("https://images.pexels.com/photos/3073666/pexels-photo-3073666.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(streetFrench);

        AppCompatImageView homeFrench = findViewById(R.id.home_french);
        Glide.with(this).load("https://images.pexels.com/photos/2792025/pexels-photo-2792025.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeFrench);

        AppCompatImageView natureFrench = findViewById(R.id.nature_french);
        Glide.with(this).load("https://images.pexels.com/photos/708447/pexels-photo-708447.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(natureFrench);

        AppCompatImageView parisUni = findViewById(R.id.paris_uni);
        Glide.with(this).load("https://i.pinimg.com/564x/90/c1/f3/90c1f36115f3f3fe82a444d2acf25370.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(parisUni);

        AppCompatImageView bononeParis = findViewById(R.id.bonone_paris);
        Glide.with(this).load("https://i.pinimg.com/564x/7e/49/4e/7e494e7b1d4394f957a7e6a0f6a9b15c.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bononeParis);

        AppCompatImageView defrenchUni = findViewById(R.id.uni_defrench);
        Glide.with(this).load("https://i.pinimg.com/564x/71/be/5e/71be5e0e5b474feba4bbaf0d19e67aec.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(defrenchUni);

        AppCompatImageView strabon = findViewById(R.id.strabon);
        Glide.with(this).load("https://www.euroculturemaster.eu/uploads/bestanden/cae2dc85-01d0-5946-8150-aa97ee4eef8d/3072380221/RS48555_Palais_universitaire_3523-lpr.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(strabon);


    }
}