package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class JapanActivity extends AppCompatActivity {

    private AppCompatTextView toyotaMotor, mitsubishi, hondaMotor, itochu, sony, hitachi, nipponTelegraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);

        toyotaMotor = findViewById(R.id.toyota_motor);
        toyotaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiM8oTQsOP1AhWsAGMBHaCVAhkQFnoECDgQAQ&url=https%3A%2F%2Fwww.britannica.com%2Fsummary%2FToyota-Motor-Corporation&usg=AOvVaw13qjey4xE9sF25hsxqQTec"))));

        mitsubishi = findViewById(R.id.mitsubishi);
        mitsubishi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjq3de1seP1AhWHBWMBHbfjChkQFnoECFcQAQ&url=https%3A%2F%2Fwww.mitsubishi.com%2F&usg=AOvVaw27mY9o9h1L1FUflE9UWJJN"))));

        hondaMotor = findViewById(R.id.honda_motor);
        hondaMotor.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjvxtvpseP1AhU3BGMBHSmcBRcQFnoECF4QAQ&url=https%3A%2F%2Fwww.honda.com%2Fhistory&usg=AOvVaw3uZGbnPAdYzKLMfaOrmmry"))));

        itochu = findViewById(R.id.itochu);
        itochu.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi0-b2usuP1AhUT5OAKHemMABkQFnoECBAQAw&url=http%3A%2F%2Fwww.itochu.co.jp%2Fen%2Fabout%2Fprofile%2Findex.html&usg=AOvVaw3KYVuxyaxNB7hrBkwjzzco"))));

        sony = findViewById(R.id.sony);
        sony.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwisufSZs-P1AhU_A2MBHTdWCxkQFnoECDMQAQ&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2FSony&usg=AOvVaw0p53OAiLbfVrxjowpQ8YeG"))));

        hitachi = findViewById(R.id.hitachi);
        hitachi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjW0529tOP1AhWLmRQKHe1vABkQFnoECFUQAQ&url=https%3A%2F%2Fwww.hitachicm.eu%2Fcompany-profile%2Fcompany-outline%2Fhitachi-ltd%2F&usg=AOvVaw0oteDRgxn8IWze3VbwJRU-"))));

        nipponTelegraph = findViewById(R.id.nippon_telegraph);
        nipponTelegraph.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj2o4GltuP1AhUQkxQKHY8qBxkQFnoECDcQAQ&url=https%3A%2F%2Fwww.referenceforbusiness.com%2Fhistory2%2F52%2FNippon-Telegraph-and-Telephone-Corporation.html&usg=AOvVaw26SaagVNpTIHeKLR03wz0I"))));


        AppCompatImageView treeJapan = findViewById(R.id.tree_japan);
        Glide.with(this).load("https://images.pexels.com/photos/1440476/pexels-photo-1440476.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(treeJapan);

        AppCompatImageView skyJapan = findViewById(R.id.sky_japan);
        Glide.with(this).load("https://images.pexels.com/photos/402028/pexels-photo-402028.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(skyJapan);

        AppCompatImageView cityJapan = findViewById(R.id.city_japan);
        Glide.with(this).load("https://images.pexels.com/photos/1134166/pexels-photo-1134166.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityJapan);

        AppCompatImageView mountainJapan = findViewById(R.id.mountain_japan);
        Glide.with(this).load("https://images.pexels.com/photos/347145/pexels-photo-347145.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainJapan);

        AppCompatImageView castleJapan = findViewById(R.id.castle_japan);
        Glide.with(this).load("https://images.pexels.com/photos/2187605/pexels-photo-2187605.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleJapan);

        AppCompatImageView tokyoJapan = findViewById(R.id.tokyo_japan);
        Glide.with(this).load("https://i.pinimg.com/736x/5c/ff/65/5cff656c8e5745b80880205245dfa746.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tokyoJapan);

        AppCompatImageView nihonJapan = findViewById(R.id.nihon_japan);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/3/3f/Nihon_Univ_College_of_Art_Tokyo_Japan_20110628.JPG").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nihonJapan);

        AppCompatImageView tohonoJapan = findViewById(R.id.tohono_japan);
        Glide.with(this).load("http://naseramanzadeh.ir/wp-content/uploads/2019/12/Tohoku.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tohonoJapan);

        AppCompatImageView kyishuJapan = findViewById(R.id.kyishu_japan);
        Glide.with(this).load("https://sunwah-gyln.com/wp-content/uploads/2016/03/Kyushu.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(kyishuJapan);


    }
}