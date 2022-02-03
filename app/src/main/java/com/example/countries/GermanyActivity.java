package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

public class GermanyActivity extends AppCompatActivity {


    private AppCompatTextView volkswagen, daimler, allianz, bmw, siemens, bosch, uniper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        volkswagen = findViewById(R.id.volkswagen);
        volkswagen.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjJ64HLm-P1AhUSlBQKHTVzCBkQFnoECAcQAw&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FVolkswagen-Group&usg=AOvVaw07ckSBUJpcYmb17AcHGZ3H"))));

        daimler = findViewById(R.id.daimler);
        daimler.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiywer2m-P1AhUp5eAKHX2oDxkQFnoECAQQAQ&url=https%3A%2F%2Fwww.daimler.com%2Fcompany%2F&usg=AOvVaw2g-LgFpLn1VuQ06aWGSHsT"))));

        allianz = findViewById(R.id.allianz);
        allianz.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjEtr27nOP1AhWeDWMBHfgLCRkQFnoECDoQAQ&url=https%3A%2F%2Fwww.allianz.com%2Fen%2Fabout-us%2Fwho-we-are.html&usg=AOvVaw2tmmZ6UdwOH25ucvNGuRGi"))));

        bmw = findViewById(R.id.bmw);
        bmw.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiUwIzxnOP1AhVfBGMBHcJ_CeMQFnoECAcQAQ&url=https%3A%2F%2Fwww.bmwgroup.com%2Fen%2Fcompany.html&usg=AOvVaw225An1TZ5oOXGQQD0IF6lJ"))));

        siemens = findViewById(R.id.siemens);
        siemens.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj51ofNneP1AhUJtxQKHVRrAhkQtwJ6BAgHEAM&url=https%3A%2F%2Fnew.siemens.com%2Fmea%2Fen%2Fcompany%2Fabout.html&usg=AOvVaw0xmXGfosiwJuy2q0gU9qXo"))));

        bosch = findViewById(R.id.bosch);
        bosch.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj67JycnuP1AhV8A2MBHa8YABkQFnoECAcQAQ&url=https%3A%2F%2Fwww.bosch.com%2Fcompany%2F&usg=AOvVaw01Y6g6RZPIUj3zpLYOcxjh"))));

        uniper = findViewById(R.id.uniper);
        uniper.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiLg93KnuP1AhVAA2MBHSMwCBkQFnoECD4QAQ&url=https%3A%2F%2Fwww.uniper.energy%2Fcompany%2Fabout-us&usg=AOvVaw3LFDVKlqer7NcH165Pt6ZW"))));


        AppCompatImageView castleGermany = findViewById(R.id.castle_germany);
        Glide.with(this).load("https://images.pexels.com/photos/1119972/pexels-photo-1119972.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleGermany);

        AppCompatImageView placeGermany = findViewById(R.id.place_germany);
        Glide.with(this).load("https://images.pexels.com/photos/756688/pexels-photo-756688.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(placeGermany);

        AppCompatImageView bridgeGermany = findViewById(R.id.bridge_germany);
        Glide.with(this).load("https://images.pexels.com/photos/161849/cologne-dom-night-architecture-161849.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeGermany);

        AppCompatImageView darkBridgeGermany = findViewById(R.id.dark_bridge_germany);
        Glide.with(this).load("https://media-exp1.licdn.com/dms/image/C4D1BAQE8ubnlTvSYJA/company-background_10000/0/1542967605407?e=2159024400&v=beta&t=z68RyZx0HUQGJCemBZeFsreu_4fVk0klhAY8EZxgVGk").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(darkBridgeGermany);

        AppCompatImageView blueCastleGermany = findViewById(R.id.blue_castle_germany);
        Glide.with(this).load("https://images.pexels.com/photos/65567/pexels-photo-65567.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(blueCastleGermany);

        AppCompatImageView heideGermany = findViewById(R.id.heide_germany);
        Glide.with(this).load("https://images.unsplash.com/photo-1567806740800-c6d7be4a17dc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YmVybGluJ3MlMjBtdXNldW0lMjBpc2xhbmR8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(heideGermany);

        AppCompatImageView berlinGermany = findViewById(R.id.berlin_germany);
        Glide.with(this).load("https://i.pinimg.com/564x/3a/77/0b/3a770be07336db2e84b487d7ecccab40.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(berlinGermany);

        AppCompatImageView muchanGermany = findViewById(R.id.munchan_germany);
        Glide.with(this).load("https://i.pinimg.com/564x/62/0c/2f/620c2f778587179eaad52ab4abea82c0.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(muchanGermany);

        AppCompatImageView frieGermany = findViewById(R.id.frie_germany);
        Glide.with(this).load("https://api.mygermanuniversity.com/images/university_images/58a2fc6ed39fd083f55d4182bf88826d_sE485COkThPX1568691791.png").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(frieGermany);


    }
}