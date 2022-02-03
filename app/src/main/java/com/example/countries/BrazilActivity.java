package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class BrazilActivity extends AppCompatActivity {

    private AppCompatTextView petroBras, valeCompany, bancoSantader, ambev, itauUnibanco, bancoBradesco, nuHoldings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        petroBras = findViewById(R.id.petro_bras);
        petroBras.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://petrobras.com.br/en/about-us/"))));

        valeCompany = findViewById(R.id.vale_company);
        valeCompany.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vale.com/en/aboutvale/pages/default.aspx"))));

        bancoSantader = findViewById(R.id.banco_santander);
        bancoSantader.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bancosantander.es/en/espacio-mifid"))));

        ambev = findViewById(R.id.ambev);
        ambev.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ri.ambev.com.br/en/overview/history/"))));

        itauUnibanco = findViewById(R.id.itau_unibanco);
        itauUnibanco.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.itau.com/history"))));

        bancoBradesco = findViewById(R.id.banco_bradesco);
        bancoBradesco.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.banktrack.org/bank/banco_bradesco"))));

        nuHoldings = findViewById(R.id.nu_holdings);
        nuHoldings.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reuters.com/companies/NU.N"))));


        AppCompatImageView rioMountain = findViewById(R.id.rio_mountain_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/6580703/pexels-photo-6580703.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(rioMountain);

        AppCompatImageView waterFall = findViewById(R.id.waterfall_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/3889927/pexels-photo-3889927.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(waterFall);

        AppCompatImageView seaBrazil = findViewById(R.id.see_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/975761/pexels-photo-975761.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(seaBrazil);

        AppCompatImageView mountainBrazil = findViewById(R.id.mountain_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/1659438/pexels-photo-1659438.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mountainBrazil);

        AppCompatImageView beachBrazil = findViewById(R.id.beach_brazil);
        Glide.with(this).load("https://images.pexels.com/photos/10323141/pexels-photo-10323141.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(beachBrazil);

        AppCompatImageView saopalUni = findViewById(R.id.saopal_uni);
        Glide.with(this).load("https://aware.thi.de/fileadmin/daten/AWARE/Netzwerk_Partner/USP_by_Marcos_Santos.png").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(saopalUni);

        AppCompatImageView stateUni = findViewById(R.id.state_uni);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/en/thumb/6/67/Fcm-unicamp.jpg/800px-Fcm-unicamp.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(stateUni);

        AppCompatImageView basilla = findViewById(R.id.brasilla);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Universidade_de_Bras%C3%ADlia_Instituto_Central_de_Ci%C3%AAncias_Minhoc%C3%A3o_corredor.JPG/1024px-Universidade_de_Bras%C3%ADlia_Instituto_Central_de_Ci%C3%AAncias_Minhoc%C3%A3o_corredor.JPG").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(basilla);

        AppCompatImageView parana = findViewById(R.id.parana);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/8/8f/Universidade_Federal_do_Paran%C3%A1.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(parana);

    }

}