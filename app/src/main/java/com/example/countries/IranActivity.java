package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class IranActivity extends AppCompatActivity {

    private AppCompatTextView khalijeIran, mellatIran, melliBank, ghadirIran, parsianBnk, tejaratBank, parsianOil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iran);

        khalijeIran = findViewById(R.id.khalije_iran);
        khalijeIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pgpicc.com/"))));

        mellatIran = findViewById(R.id.mellat_iran);
        mellatIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiPoo6ooeP1AhVQD2MBHf9SAhkQFnoECAYQAQ&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FBank_Mellat&usg=AOvVaw0F1mbnITzxVEQf-_1Gdjkx"))));

        melliBank = findViewById(R.id.melli_bank);
        melliBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjh5KfzoeP1AhWD7eAKHd14ABkQFnoECAYQAQ&url=https%3A%2F%2Fwww.mellibank.com%2FAboutUs&usg=AOvVaw0tcW56vou9suWwO192uN9e"))));

        ghadirIran = findViewById(R.id.ghadir_iran);
        ghadirIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiAzfyUouP1AhX3D2MBHYGwARkQFnoECA8QAw&url=https%3A%2F%2Fwww.ghadir-group.com%2FENHome%2FAbout&usg=AOvVaw3GDDn0e2yy_I13l22NYn05"))));

        parsianBnk = findViewById(R.id.parsian_bank);
        parsianBnk.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiD_fizouP1AhVQcBQKHcPgBRgQFnoECAUQAQ&url=https%3A%2F%2Fen.parsian-bank.ir%2F&usg=AOvVaw1c0UGJO3X-BO4xyTFtCrYI"))));

        tejaratBank = findViewById(R.id.tejarat_bank);
        tejaratBank.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiJ17aCo-P1AhUkBmMBHTrGBBkQFnoECC8QAQ&url=https%3A%2F%2Fwww.emis.com%2Fphp%2Fcompany-profile%2FIR%2FBank_Tejarat__Public_Joint_Stock___%25D8%25A8%25D9%2586%25D9%2583_%25D8%25AA%25D8%25AC%25D8%25A7%25D8%25B1%25D8%25A9__en_2359574.html&usg=AOvVaw2TJh_IyXbFuhFKywq-LigC"))));

        parsianOil = findViewById(R.id.parsian_oil);
        parsianOil.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiPyMi4o-P1AhVCAmMBHSHUCBgQFnoECAcQAQ&url=http%3A%2F%2Fparsian-oil.com%2Fen%2F&usg=AOvVaw3UhH_aPPdbalKAD4g0hY4_"))));


        AppCompatImageView bridgeIran = findViewById(R.id.bridge_iran);
        Glide.with(this).load("https://images.unsplash.com/photo-1573594958180-e34e7396c3e1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGJyaWRnZXMlMjBvZiUyMGlzZmFoYW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeIran);

        AppCompatImageView azadiTower = findViewById(R.id.tower_azadi_iran);
        Glide.with(this).load("https://images.pexels.com/photos/6768496/pexels-photo-6768496.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(azadiTower);

        AppCompatImageView castleIran = findViewById(R.id.castle_iran);
        Glide.with(this).load("https://media.istockphoto.com/photos/bukhara-sunset-poi-kalon-minaret-mir-arab-madrasah-in-uzbekistan-picture-id1191593737?k=20&m=1191593737&s=612x612&w=0&h=gV8qpubxvG-8Bz4fteRbubcvaYcfs2ZJ-PgoM_dBrkw=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleIran);

        AppCompatImageView masqueIran = findViewById(R.id.masque_iran);
        Glide.with(this).load("https://media.istockphoto.com/photos/beautiful-light-at-the-pink-mosque-in-shiraz-picture-id1156391944?k=20&m=1156391944&s=612x612&w=0&h=bFJj_qHGFTB8KI4_WuxAzVXbGqcjKTr2trj2zMOKv8Y=").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(masqueIran);

        AppCompatImageView miladIran = findViewById(R.id.milad_iran);
        Glide.with(this).load("https://images.pexels.com/photos/3799150/pexels-photo-3799150.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(miladIran);

        AppCompatImageView tabrizIran = findViewById(R.id.tabriz_iran);
        Glide.with(this).load("https://tabrizu.ac.ir/images/www/fa/page/editor/2017/1488262658-1111111.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tabrizIran);

        AppCompatImageView sharifIran = findViewById(R.id.sharif_iran);
        Glide.with(this).load("https://media.tehrantimes.com/d/t/2020/11/28/3/3613813.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(sharifIran);

        AppCompatImageView tehranIran = findViewById(R.id.tehran_iran);
        Glide.with(this).load("https://media.mehrnews.com/d/2018/08/06/3/2854140.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tehranIran);

        AppCompatImageView isfahanIran = findViewById(R.id.isfahan_iran);
        Glide.with(this).load("https://media-exp1.licdn.com/dms/image/C4D1BAQHLo4QQ8-AgbA/company-background_10000/0/1519797735575?e=2159024400&v=beta&t=6dWUIcSe2g9kZUvjU5hV80sU0k7hr6sRrLbEuAV_o_g").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(isfahanIran);


    }
}