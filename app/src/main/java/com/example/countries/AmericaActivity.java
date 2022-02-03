package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class AmericaActivity extends AppCompatActivity {
    AppCompatTextView amazon, microsoft, walmart, costco, tesla, apple, google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        amazon = findViewById(R.id.amazon_us);
        amazon.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ordermentum.com/blog/what-is-amazon"))));

        microsoft = findViewById(R.id.microsoft);
        microsoft.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.britannica.com/topic/Microsoft-Corporation"))));

        walmart = findViewById(R.id.walmart);
        walmart.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://corporate.walmart.com/about"))));

        costco = findViewById(R.id.Costco);
        costco.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.britannica.com/topic/Costco"))));

        tesla = findViewById(R.id.tesla);
        tesla.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tesla.com/about"))));

        apple = findViewById(R.id.apple);
        apple.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newworldencyclopedia.org/entry/Apple_Inc."))));

        google = findViewById(R.id.google);
        google.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search/howsearchworks/mission/"))));


        AppCompatImageView whiteHouse=findViewById(R.id.white_house);
        Glide.with(this).load("https://i.pinimg.com/736x/c7/5c/e1/c75ce1ad67382bba705d94d37b0ca9bd.jpg").into(whiteHouse);

        AppCompatImageView bridgeAmerica = findViewById(R.id.bridge_america);
        Glide.with(this).load("https://images.pexels.com/photos/5432863/pexels-photo-5432863.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(bridgeAmerica);

        AppCompatImageView castleAmerica = findViewById(R.id.castle_america);
        Glide.with(this).load("https://images.pexels.com/photos/3428289/pexels-photo-3428289.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(castleAmerica);

        AppCompatImageView libertyAmerica = findViewById(R.id.librety_america);
        Glide.with(this).load("https://images.pexels.com/photos/8543252/pexels-photo-8543252.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(libertyAmerica);

        AppCompatImageView mountainAmerica = findViewById(R.id.mountain_america);
        Glide.with(this).load("https://images.pexels.com/photos/5429569/pexels-photo-5429569.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(mountainAmerica);

        AppCompatImageView antwerp = findViewById(R.id.antwerp);
        Glide.with(this).load("https://th.bing.com/th/id/R.014cfaf7bc9a15e190b129c894f5210c?rik=fHdBxzC%2BGrZvFA&pid=ImgRaw&r=0").into(antwerp);

        AppCompatImageView harvard = findViewById(R.id.harvard);
        Glide.with(this).load("https://media.glassdoor.com/l/77/d1/ca/78/harvard-university.jpg").into(harvard);

        AppCompatImageView cornell = findViewById(R.id.cornell);
        Glide.with(this).load("https://cdnapisec.kaltura.com/p/537811/thumbnail/entry_id/1_7vli4o6f/width/1280/height/720").into(cornell);

        AppCompatImageView coloubia = findViewById(R.id.coloumbia);
        Glide.with(this).load("https://static01.nyt.com/images/2020/03/08/nyregion/08xp-columbia1/08xp-columbia1-videoSixteenByNineJumbo1600.jpg").into(coloubia);

    }
}