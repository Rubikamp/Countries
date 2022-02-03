package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class ThailandActivity extends AppCompatActivity {

    private AppCompatTextView ptt, cpAll, siam, thai, skanska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thailand);

        ptt = findViewById(R.id.ptt);
        ptt.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjFxY2-1eP1AhUJLBoKHU9kB2kQFnoECAoQAQ&url=https%3A%2F%2Fwww.pttplc.com%2Fen%2FAbout.aspx&usg=AOvVaw1QyVOlH0AS14TI1fgxR56_"))));

        cpAll = findViewById(R.id.cp_all);
        cpAll.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiouqvG1eP1AhUCx4UKHV1FAP0QFnoECFAQAQ&url=https%3A%2F%2Fwww.cpall.co.th%2Fen%2Fcompany-information&usg=AOvVaw3KmtDCDu3_b9k9ESvJUm3l"))));

        siam = findViewById(R.id.siam);
        siam.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiLte7f1eP1AhUMyYUKHYXLDhYQFnoECAUQAw&url=https%3A%2F%2Fwww.siam.org%2Fabout-siam&usg=AOvVaw2vUmaSPKBd8ZBkif2ENFPL"))));

        thai = findViewById(R.id.thai);
        thai.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjV58Xn1eP1AhUix4UKHfiWBXsQFnoECB8QAQ&url=https%3A%2F%2Fwww.thaiairways.com%2Fen_IE%2Fabout_thai%2Fcompany_profile%2Findex.page%3F&usg=AOvVaw3vEmCKC1aYQQNJYnbhkDir"))));

        skanska = findViewById(R.id.skanska);
        skanska.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjG3_721eP1AhUD14UKHdNGCCUQFnoECEYQAQ&url=https%3A%2F%2Fwww.usa.skanska.com%2Fwho-we-are%2Fabout-skanska%2F&usg=AOvVaw0IzMZxdh9X8zREhMp0PwsF"))));


        AppCompatImageView river = findViewById(R.id.river_thailand);
        Glide.with(this).load("https://images.pexels.com/photos/2108831/pexels-photo-2108831.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(river);

        AppCompatImageView bridge = findViewById(R.id.bridge_thailand);
        Glide.with(this).load("https://images.pexels.com/photos/753885/pexels-photo-753885.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridge);

        AppCompatImageView fish = findViewById(R.id.fish_thailand);
        Glide.with(this).load("https://images.pexels.com/photos/3538236/pexels-photo-3538236.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(fish);

        AppCompatImageView shop = findViewById(R.id.shop_thailand);
        Glide.with(this).load("https://media.istockphoto.com/photos/sunday-market-walking-street-picture-id613547878?k=20&m=613547878&s=612x612&w=0&h=OdjPVGtKtbsDaf3zt4m2GV0SFkmG1yhmsZQ2uVqXJ3s=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(shop);

        AppCompatImageView castle = findViewById(R.id.castle_thailand);
        Glide.with(this).load("https://images.pexels.com/photos/460376/pexels-photo-460376.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castle);

        AppCompatImageView jiandk = findViewById(R.id.jiandk_thailand);
        Glide.with(this).load("https://www.bu.ac.th/uploads/faculty/contact/20170915153322_s0Vdj5MSXnzbBe1_QDWMgaFyGWvhtzR.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(jiandk);

        AppCompatImageView naklspe = findViewById(R.id.naaklspe_thailand);
        Glide.with(this).load("https://www.chula.ac.th/wp-content/uploads/2018/01/chula-faculty-arts-hero-desktop-1024x640.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(naklspe);

        AppCompatImageView naolam = findViewById(R.id.naolam_thailand);
        Glide.with(this).load("http://www.rocapply.com/assets/pictures/universities/San%20Francisco/Prince-of-songkla-header.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(naolam);

        AppCompatImageView nsusna = findViewById(R.id.nsusna_thailand);
        Glide.with(this).load("https://9968c6ef49dc043599a5-e151928c3d69a5a4a2d07a8bf3efa90a.ssl.cf2.rackcdn.com/672578.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nsusna);

    }
}