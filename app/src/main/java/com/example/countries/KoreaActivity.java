package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class KoreaActivity extends AppCompatActivity {

    private AppCompatTextView samsung, skHynix, lgChem, naver, hyundai, coupang, kakao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea);

        samsung = findViewById(R.id.samsung);
        samsung.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjx6sv9t-P1AhVPDWMBHZjkDBgQFnoECDUQAQ&url=https%3A%2F%2Fwww.samsung.com%2Flevant%2Fabout-us%2Fcompany-info%2F&usg=AOvVaw1uhxwicwGYB4erzqHjwpVw"))));

        skHynix = findViewById(R.id.sk_hynix);
        skHynix.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwilloygueP1AhVDEWMBHajnBxkQFnoECFkQAQ&url=https%3A%2F%2Fwww.skhynix.com%2F&usg=AOvVaw3ZZG_GXxU97zpqKosUsF25"))));

        lgChem = findViewById(R.id.lg_chem);
        lgChem.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjMoazRueP1AhV0A2MBHXtKBBkQFnoECAcQAQ&url=https%3A%2F%2Fwww.lgchem.com%2Fcompany%2Fcompany-information%2Fabout&usg=AOvVaw0ZRWSuDxJRWQ3V5htw2Dph"))));

        naver = findViewById(R.id.naver);
        naver.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwju7pLwueP1AhUJnhQKHT5JDxkQFnoECA8QAw&url=https%3A%2F%2Fwww.navercorp.com%2Fen%2Fnaver%2Fcompany&usg=AOvVaw2q66NShkmChktb_X3NGW3g"))));

        hyundai = findViewById(R.id.hyundai);
        hyundai.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjJsrT_ueP1AhUQnhQKHR7VCRkQFnoECD4QAQ&url=https%3A%2F%2Fwww.hyundai.com%2Fworldwide%2Fen%2Ffooter%2Fcorporate%2Fhistory%2F2021-2025&usg=AOvVaw1e0R19pWwuW9h4rFlcU1Vl"))));

        coupang = findViewById(R.id.coupang);
        coupang.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiAkbSquuP1AhUI8BQKHUD_AhkQFnoECDgQAQ&url=https%3A%2F%2Fir.aboutcoupang.com%2FEnglish%2Fhome%2Fdefault.aspx&usg=AOvVaw3JthwBwzIfwJjk1RLyVHW3"))));

        kakao = findViewById(R.id.kakao);
        kakao.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjhs-rTuuP1AhUC5OAKHR62BhkQFnoECC4QAQ&url=https%3A%2F%2Fasia.nikkei.com%2FCompanies%2FKakao-Corp&usg=AOvVaw1_QdJmuM_9Z4W8y_RVP4Xp"))));


        AppCompatImageView castleKorea = findViewById(R.id.castle_korea);
        Glide.with(this).load("https://media.istockphoto.com/photos/gyeongbokgung-palace-and-the-blue-house-seoul-south-korea-picture-id855354520?k=20&m=855354520&s=612x612&w=0&h=a0ywFwuj2uc0CwBGDxTZTf9zASGs5x0F93-iUIDO4oY=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleKorea);

        AppCompatImageView cityKorea = findViewById(R.id.city_korea);
        Glide.with(this).load("https://images.pexels.com/photos/373290/pexels-photo-373290.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(cityKorea);

        AppCompatImageView roofKorea = findViewById(R.id.roof_korea);
        Glide.with(this).load("https://images.unsplash.com/photo-1642258031095-14ecc31d0d53?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y2hhbmdkZW9rZ3VuZyUyMHBhbGFjZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(roofKorea);

        AppCompatImageView towerKorea = findViewById(R.id.tower_korea);
        Glide.with(this).load("https://images.pexels.com/photos/1663383/pexels-photo-1663383.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(towerKorea);

        AppCompatImageView buildingKorea = findViewById(R.id.building_korea);
        Glide.with(this).load("https://images.pexels.com/photos/237211/pexels-photo-237211.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(buildingKorea);

        AppCompatImageView sungKorea = findViewById(R.id.sung_korea);
        Glide.with(this).load("https://i.pinimg.com/564x/57/5e/7b/575e7b3e133178fd53cb29d00b399734.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sungKorea);

        AppCompatImageView seoulKorea = findViewById(R.id.seoul_korea);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1563101305.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seoulKorea);

        AppCompatImageView hunkakKorea = findViewById(R.id.hunkak_korea);
        Glide.with(this).load("https://asiaexchange.org/wp-content/uploads/2020/03/Hankuk-University-of-Foreign-Studies-Seoul-South-Korea-1.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(hunkakKorea);

        AppCompatImageView yonesiKorea = findViewById(R.id.yonesi_korea);
        Glide.with(this).load("https://media-exp1.licdn.com/dms/image/C511BAQHKQDhTT_1Csg/company-background_10000/0/1525238700361?e=2159024400&v=beta&t=0HYo5gMj2Le7Oi8rJZtEzoqjtqPKxD0Fyd9nRFw9i5I").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(yonesiKorea);


    }
}