package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class SwedenActivity extends AppCompatActivity {
    private AppCompatTextView ericsson, essity, handm, ikea, skanska;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweden);

        ericsson = findViewById(R.id.ericsson);
        ericsson.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjkwffpzeP1AhVBzhoKHbpCBMAQFnoECAwQAQ&url=https%3A%2F%2Fwww.ericsson.com%2Fen%2Fabout-us&usg=AOvVaw3l-dvhjL2sfC2HFlsiE-sO"))));

        essity = findViewById(R.id.essity);
        essity.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiWz5_7zeP1AhWp4IUKHUeVDMoQFnoECAkQAQ&url=https%3A%2F%2Fwww.essity.com%2Fcompany%2Fessity-at-a-glance%2F&usg=AOvVaw1oP5o0nr5FLy2yC_KFM9qq"))));

        handm = findViewById(R.id.handm);
        handm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwidsYiNzuP1AhWE3oUKHZ5DAVIQFnoECCQQAQ&url=https%3A%2F%2Fhmgroup.com%2Fabout-us%2F&usg=AOvVaw2n7X3EOxQzWsOIeg07q5at"))));

        ikea = findViewById(R.id.ikea);
        ikea.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjL8-abzuP1AhVPOBoKHf0ZBYsQFnoECAsQAQ&url=https%3A%2F%2Fwww.ikea.com%2Fgb%2Fen%2Fthis-is-ikea%2Fabout-us%2F&usg=AOvVaw1Atn1w2f7P_6Hd5-nwPGfL"))));

        skanska = findViewById(R.id.skanska);
        skanska.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjd4aykzuP1AhUCCRoKHbY1Bm0QFnoECEYQAQ&url=https%3A%2F%2Fwww.usa.skanska.com%2Fwho-we-are%2Fabout-skanska%2F&usg=AOvVaw0IzMZxdh9X8zREhMp0PwsF"))));


        AppCompatImageView castle = findViewById(R.id.castle_sweden);
        Glide.with(this).load("https://images.pexels.com/photos/2377432/pexels-photo-2377432.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castle);

        AppCompatImageView elevater = findViewById(R.id.elevater_sweden);
        Glide.with(this).load("https://images.pexels.com/photos/2876838/pexels-photo-2876838.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(elevater);

        AppCompatImageView home = findViewById(R.id.home_sweden);
        Glide.with(this).load("https://images.pexels.com/photos/10391201/pexels-photo-10391201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(home);

        AppCompatImageView redElevator = findViewById(R.id.red_elavater_sweden);
        Glide.with(this).load("https://images.pexels.com/photos/6047763/pexels-photo-6047763.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(redElevator);

        AppCompatImageView treeWall = findViewById(R.id.tree_wall_sweden);
        Glide.with(this).load("https://images.pexels.com/photos/5759484/pexels-photo-5759484.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(treeWall);

        AppCompatImageView royto = findViewById(R.id.royto_sweden);
        Glide.with(this).load("https://ezapply.ir/sliders/slider_1495990074.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(royto);

        AppCompatImageView bienma = findViewById(R.id.bienma_sweden);
        Glide.with(this).load("https://applydoc.ir/wp-content/uploads/2020/09/1562931999-university-gothenburg-news_item_slider-t1562931999.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bienma);

        AppCompatImageView nimadla = findViewById(R.id.niamdla_sweden);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Ume%C3%A5_University_Campus_pond-2012-06-06.jpg/1200px-Ume%C3%A5_University_Campus_pond-2012-06-06.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nimadla);

        AppCompatImageView mkowple = findViewById(R.id.mkowple_sweden);
        Glide.with(this).load("https://s3.eu-north-1.amazonaws.com/images.free-apply.com/uni/gallery/lg/1075200042/c85740a7bcfc4d17ee2d7f026fd8a77989bd5ad7.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mkowple);

    }
}