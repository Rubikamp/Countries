package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class NetherlandsActivity extends AppCompatActivity {

    private AppCompatTextView unilever, royal, ing, aegon, rabobank, philips, ahold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netherlands);

        unilever = findViewById(R.id.unilever_ne);
        unilever.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjO5-CRveP1AhW6AGMBHXKrAhkQFnoECDgQAQ&url=https%3A%2F%2Fwww.unilever.com%2Four-company%2F&usg=AOvVaw0Hx25tmqgSQrQp6sbXOU3K"))));

        royal = findViewById(R.id.royal);
        royal.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjx6ffDveP1AhWQB2MBHQgvCBcQFnoECCUQAQ&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FRoyal-Dutch-Shell-PLC&usg=AOvVaw0tIfM4063suK4Fx1SgQ3Zm"))));

        ing = findViewById(R.id.ing);
        ing.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjS-4WXvuP1AhU6AWMBHb1XCpgQFnoECAcQAw&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FING-Group-NV&usg=AOvVaw1AgezB6z0iKVokCDgIIFUo"))));

        aegon = findViewById(R.id.aegon);
        aegon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi_u_qsvuP1AhWNMBQKHUaQBRkQFnoECAoQAw&url=https%3A%2F%2Fwww.aegon.com%2Fabout%2Fwhat-we-do%2Four-businesses%2Fnetherlands%2F&usg=AOvVaw0oTg9H9xjc3To1hWESVUy-"))));

        rabobank = findViewById(R.id.rabobank);
        rabobank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjdw_DJvuP1AhXxDWMBHViZARkQFnoECA0QAw&url=https%3A%2F%2Fwww.rabobank.com%2Fen%2Flocate-us%2Feurope%2Fnetherlands.html&usg=AOvVaw3ts_s1WfFHTuZ75Ed5GLPm"))));

        philips = findViewById(R.id.philips);
        philips.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjM8I7nvuP1AhUO_RQKHZMGDxgQFnoECAYQAQ&url=https%3A%2F%2Fwww.philips.com%2Fa-w%2Fabout.html&usg=AOvVaw1reZztdbeFIHJDnk4jgnHc"))));

        ahold = findViewById(R.id.ahold);
        ahold.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi_vsiBv-P1AhVdBWMBHc0CDhkQFnoECCgQAQ&url=https%3A%2F%2Fwww.aholddelhaize.com%2F&usg=AOvVaw11yAPIV6SQe0KQ44XwQZ_Y"))));


        AppCompatImageView riverNetherlands = findViewById(R.id.river_netherlands);
        Glide.with(this).load("https://images.pexels.com/photos/2031706/pexels-photo-2031706.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverNetherlands);

        AppCompatImageView waterfallNetherlands = findViewById(R.id.waterfall_netherlands);
        Glide.with(this).load("https://images.pexels.com/photos/208733/pexels-photo-208733.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterfallNetherlands);

        AppCompatImageView buildingNetherlands = findViewById(R.id.building_netherlands);
        Glide.with(this).load("https://images.pexels.com/photos/600622/pexels-photo-600622.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(buildingNetherlands);

        AppCompatImageView boatNetherlands = findViewById(R.id.boat_netherlands);
        Glide.with(this).load("https://images.pexels.com/photos/3414040/pexels-photo-3414040.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(boatNetherlands);

        AppCompatImageView castleNetherlands = findViewById(R.id.castle_netherlands);
        Glide.with(this).load("https://images.pexels.com/photos/6122261/pexels-photo-6122261.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleNetherlands);

        AppCompatImageView ameNetherlands = findViewById(R.id.ame_netherlands);
        Glide.with(this).load("https://www.overseaseducationlane.com/university_galary_images/galary_image_2_1610690412.jpeg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ameNetherlands);

        AppCompatImageView riverUni = findViewById(R.id.river_uni);
        Glide.with(this).load("https://umcure2020-04a2dd4.aldryn-media.com/filer_public_thumbnails/filer_public/84/75/8475603b-4368-4237-8785-82d585231859/ac_gebouw.jpg__1170x0_q90_subsampling-2_upscale.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(riverUni);

        AppCompatImageView vrijeNetherlands = findViewById(R.id.vrije_netherlands);
        Glide.with(this).load("https://unigis.net/wp-content/uploads/2016/03/vrije-universiteit-amsterdam.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(vrijeNetherlands);

        AppCompatImageView georgiaUni = findViewById(R.id.georgia_uni);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1520973247.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(georgiaUni);


    }
}