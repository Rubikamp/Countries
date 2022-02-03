package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class ItalyActivity extends AppCompatActivity {

    private AppCompatTextView assicurazioniGenerali, exor, uniCredit, eni, intesaSanpaolo, posteItaliane, generali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        assicurazioniGenerali = findViewById(R.id.assicurazioni_generali);
        assicurazioniGenerali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjFzt7_peP1AhXgAGMBHaulDBkQFnoECAUQAQ&url=https%3A%2F%2Fwww.generali.com%2F&usg=AOvVaw2KiyYfXb6UlBnbQQKe9cvl"))));

        exor = findViewById(R.id.exor);
        exor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjSkY3OpuP1AhUlB2MBHcbQCBkQFnoECFEQAQ&url=https%3A%2F%2Fwww.exor.com%2F&usg=AOvVaw0DVUV2D5QJ0ZmNiRocfXv5"))));

        uniCredit = findViewById(R.id.uni_credit);
        uniCredit.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwixpeqap-P1AhWsA2MBHXzWARkQFnoECAUQAQ&url=https%3A%2F%2Fwww.unicreditgroup.eu%2Fen.html&usg=AOvVaw01GZN9OhyZKJHHMzAGM3Ge"))));

        eni = findViewById(R.id.eni);
        eni.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiSoa7Dp-P1AhUJrhQKHfEHBxkQFnoECAwQAw&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FEni&usg=AOvVaw1qGkBKaLgQTHaUBq2rcH4E"))));

        intesaSanpaolo = findViewById(R.id.intesa_sanpaolo);
        intesaSanpaolo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjwy66KqOP1AhUEA2MBHS1YBxkQFnoECAQQAQ&url=https%3A%2F%2Fgroup.intesasanpaolo.com%2Fen%2Fabout-us&usg=AOvVaw38hfuGvWPIWsL_4vhFwWvQ"))));

        posteItaliane = findViewById(R.id.poste_italiane);
        posteItaliane.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj0t56sqOP1AhUpBWMBHb-6CBkQFnoECAMQAQ&url=https%3A%2F%2Fwww.posteitaliane.it%2Fen%2Fcompany.html&usg=AOvVaw1j0JJYIhPFt1exQOPoYPUz"))));

        generali = findViewById(R.id.generali);
        generali.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjJmOiRr-P1AhUTEhQKHTLYCBkQFnoECCQQAQ&url=https%3A%2F%2Fwww.generaliglobalcorporate.com%2Fwho-we-are%2Fgenerali-group.html&usg=AOvVaw1snXYVig-E9Hyo5-pjDh4W"))));


        AppCompatImageView romeItaly = findViewById(R.id.rome_italy);
        Glide.with(this).load("https://images.pexels.com/photos/2225439/pexels-photo-2225439.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(romeItaly);

        AppCompatImageView cityItaly = findViewById(R.id.city_italy);
        Glide.with(this).load("https://images.pexels.com/photos/3225528/pexels-photo-3225528.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityItaly);

        AppCompatImageView riverItaly = findViewById(R.id.river_italy);
        Glide.with(this).load("https://images.pexels.com/photos/3772442/pexels-photo-3772442.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverItaly);

        AppCompatImageView towerItaly = findViewById(R.id.tower_italy);
        Glide.with(this).load("https://images.pexels.com/photos/1540585/pexels-photo-1540585.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerItaly);

        AppCompatImageView castleItaly = findViewById(R.id.castle_italy);
        Glide.with(this).load("https://images.pexels.com/photos/879537/pexels-photo-879537.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleItaly);

        AppCompatImageView paduaItaly = findViewById(R.id.padua_italy);
        Glide.with(this).load("https://applyplus.org/img/University/06-12-2019-1575651674.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(paduaItaly);

        AppCompatImageView romeUni = findViewById(R.id.romeuniversity_italy);
        Glide.with(this).load("https://workandstudy.al/wp-content/uploads/2020/10/padova_italy_2_0_0.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(romeUni);

        AppCompatImageView milanItaly = findViewById(R.id.milan_italy);
        Glide.with(this).load("https://applyplus.org/img/University/06-12-2019-1575653860.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(milanItaly);

        AppCompatImageView turinItaly = findViewById(R.id.turin_italy);
        Glide.with(this).load("https://i.pinimg.com/564x/eb/e5/4a/ebe54a5618b00361ca66e5f3cd716058.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(turinItaly);


    }
}