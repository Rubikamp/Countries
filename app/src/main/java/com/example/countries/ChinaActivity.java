package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class ChinaActivity extends AppCompatActivity {
    private AppCompatTextView tencent, kweichow, alibaba, icbc, catl, meituan, petroChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        tencent = findViewById(R.id.tencent);
        tencent.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwis37XOh-P1AhVr6uAKHcJhDxgQFnoECCMQAQ&url=https%3A%2F%2Fdbpedia.org%2Fpage%2FTencent&usg=AOvVaw0PEAwqLWQdyhsOHskrt8Au"))));

        kweichow = findViewById(R.id.kweichow_koutai);
        kweichow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwijrO-xiOP1AhUO_RQKHZMGDxgQFnoECDoQAQ&url=https%3A%2F%2Fwww.asiadragontrust.co.uk%2Fen%2Fcompany-profiles%2Fkweichow-moutai&usg=AOvVaw2QDRXNwP5ZG5hHTxWG2kpM"))));

        alibaba = findViewById(R.id.alibaba);
        alibaba.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjs5aSOieP1AhVRDmMBHYkyBRkQFnoECDkQAQ&url=https%3A%2F%2Factivities.alibaba.com%2Falibaba%2Ffollowing-about-alibaba.php&usg=AOvVaw3m2ixZnBdTVqn7zsnJWmeU"))));

        icbc = findViewById(R.id.icbc);
        icbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiLk-DjieP1AhUkBmMBHTrGBBkQFnoECDMQAQ&url=https%3A%2F%2Fasia.nikkei.com%2FCompanies%2FIndustrial-Commercial-Bank-of-China-Ltd&usg=AOvVaw1f9fJPAnRzgGb1izrBQbPn"))));

        catl = findViewById(R.id.catl);
        catl.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwip1Om8iuP1AhXb6eAKHdliChkQFnoECDcQAQ&url=https%3A%2F%2Fasia.nikkei.com%2FSpotlight%2FCaixin%2FHow-China-EV-battery-king-CATL-is-defending-its-throne&usg=AOvVaw2wL3BvlkDpV7viiJXqvZ3z"))));

        meituan = findViewById(R.id.meituan);
        meituan.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj67YG8i-P1AhUID2MBHTEUBBkQFnoECAYQAQ&url=https%3A%2F%2Fabout.meituan.com%2Fen%2Fdetails&usg=AOvVaw1SNJtweCd_M9TS7sej4NHI"))));

        petroChina = findViewById(R.id.petro_china);
        petroChina.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjh6duUjOP1AhUWDmMBHQr7ARkQFnoECDsQAQ&url=http%3A%2F%2Fwww.petrochinaintl.com.cn%2Fintlen%2F&usg=AOvVaw3GpJCGu3iLHoWLmCFeynpY"))));


        AppCompatImageView bridgeChina = findViewById(R.id.bridge_china);
        Glide.with(this).load("https://images.pexels.com/photos/2412603/pexels-photo-2412603.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeChina);

        AppCompatImageView castleChina = findViewById(R.id.castle_china);
        Glide.with(this).load("https://images.unsplash.com/photo-1603120527222-33f28c2ce89e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dGhlJTIwZm9yYmlkZGVuJTIwY2l0eXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleChina);

        AppCompatImageView riverChina = findViewById(R.id.river_china);
        Glide.with(this).load("https://images.unsplash.com/photo-1544158033-8b3ff400ee20?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dGhlJTIwc3VtbWVyJTIwcGFsYWNlJTJDJTIwYmVpamluZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverChina);

        AppCompatImageView greenChina = findViewById(R.id.green_china);
        Glide.with(this).load("https://images.pexels.com/photos/235648/pexels-photo-235648.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(greenChina);

        AppCompatImageView cityChina = findViewById(R.id.city_china);
        Glide.with(this).load("https://images.pexels.com/photos/745243/pexels-photo-745243.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityChina);

        AppCompatImageView tsinUni = findViewById(R.id.tsin_uni);
        Glide.with(this).load("https://www.timeshighereducation.com/sites/default/files/institution/header_image/profile_2017_-_header_-_tsinghua_uni.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tsinUni);

        AppCompatImageView fuden = findViewById(R.id.fuden);
        Glide.with(this).load("https://www.china-admissions.com/wp-content/uploads/2020/02/Fudan-Campus-02-scaled-e1604586273696.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fuden);

        AppCompatImageView peking = findViewById(R.id.peking);
        Glide.with(this).load("https://media-cdn.tripadvisor.com/media/photo-s/04/83/13/5e/peking-university-beijing.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(peking);

        AppCompatImageView wuhan = findViewById(R.id.wuhan);
        Glide.with(this).load("https://news.cgtn.com/news/2020-06-07/Live-Graduating-students-at-Wuhan-University-can-return-in-batches-R8mvhkVn2g/img/9e14f7850cc744aa985096fa959c4251/9e14f7850cc744aa985096fa959c4251.jpeg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(wuhan);


    }
}