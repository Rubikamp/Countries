package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private AppCompatImageView america,belgium,brazil,australia,canada,china,french,germany,iran,japan,italy,korean,netherlands,norway,spain,sweden,switzerland,thailand,turkey,uk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          america= findViewById(R.id.cardView_america);
          belgium=findViewById(R.id.cardView_belgium);
          brazil=findViewById(R.id.cardView_brazil);
          australia=findViewById(R.id.cardView_australia);
          canada=findViewById(R.id.cardView_canada);
          china=findViewById(R.id.cardView_china);
          french=findViewById(R.id.cardView_french);
          germany=findViewById(R.id.cardView_germany);
          iran=findViewById(R.id.cardView_iran);
          japan=findViewById(R.id.cardView_japan);
          italy=findViewById(R.id.cardView_italy);
          korean=findViewById(R.id.cardView_korean);
          netherlands=findViewById(R.id.cardView_netherlands);
          norway=findViewById(R.id.cardView_norway);
          spain=findViewById(R.id.cardView_spain);
          sweden=findViewById(R.id.cardView_sweden);
          switzerland=findViewById(R.id.cardView_switzerland);
          thailand=findViewById(R.id.cardView_thailand);
          turkey=findViewById(R.id.cardView_turkey);
          uk=findViewById(R.id.cardView_uk);


        america.setOnClickListener(this);
        belgium.setOnClickListener(this);
        brazil.setOnClickListener(this);
        australia.setOnClickListener(this);
        canada.setOnClickListener(this);
        china.setOnClickListener(this);
        french.setOnClickListener(this);
        germany.setOnClickListener(this);
        iran.setOnClickListener(this);
        japan.setOnClickListener(this);
        italy.setOnClickListener(this);
        korean.setOnClickListener(this);
        norway.setOnClickListener(this);
        netherlands.setOnClickListener(this);
        turkey.setOnClickListener(this);
        uk.setOnClickListener(this);
        sweden.setOnClickListener(this);
        thailand.setOnClickListener(this);
        switzerland.setOnClickListener(this);
        spain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardView_america:
                Intent americaIntenet=new Intent(MainActivity.this, AmericaActivity.class);
                startActivity(americaIntenet);
                break;
            case R.id.cardView_australia:
                Intent australiaIntent=new Intent(MainActivity.this,AustraliaActivity.class);
                startActivity(australiaIntent);
                break;
            case R.id.cardView_belgium:
                Intent belgiumIntent=new Intent(MainActivity.this, BelgiumActivity.class);
                startActivity(belgiumIntent);
                break;
            case R.id.cardView_brazil:
                Intent brazilIntent=new Intent(MainActivity.this,BrazilActivity.class);
                startActivity(brazilIntent);
                break;
            case R.id.cardView_canada:
                Intent canadaIntent=new Intent(MainActivity.this,CanadaActivity.class);
                startActivity(canadaIntent);
                break;
            case R.id.cardView_china:
                Intent chinaIntent=new Intent(MainActivity.this,ChinaActivity.class);
                startActivity(chinaIntent);
                break;
            case R.id.cardView_french:
                Intent frenchIntent=new Intent(MainActivity.this,FrenchActivity.class);
                startActivity(frenchIntent);
                break;
            case R.id.cardView_germany:
                Intent germanyIntent=new Intent(MainActivity.this,GermanyActivity.class);
                startActivity(germanyIntent);
                break;
            case R.id.cardView_iran:
                Intent iranIntent=new Intent(MainActivity.this,IranActivity.class);
                startActivity(iranIntent);
                break;
            case R.id.cardView_italy:
                Intent italyIntent=new Intent(MainActivity.this,ItalyActivity.class);
                startActivity(italyIntent);
                break;
            case R.id.cardView_japan:
                Intent japanIntent=new Intent(MainActivity.this,JapanActivity.class);
                startActivity(japanIntent);
                break;
            case R.id.cardView_korean:
                Intent koreanIntent=new Intent(MainActivity.this,KoreaActivity.class);
                startActivity(koreanIntent);
                break;
            case R.id.cardView_netherlands:
                Intent netherlandsIntent=new Intent(MainActivity.this,NetherlandsActivity.class);
                startActivity(netherlandsIntent);
                break;
            case R.id.cardView_norway:
                Intent norwayIntent=new Intent(MainActivity.this,NorwayActivity.class);
                startActivity(norwayIntent);
                break;
            case R.id.cardView_spain:
                Intent spainIntent=new Intent(MainActivity.this,SpainActivity.class);
                startActivity(spainIntent);
                break;
            case R.id.cardView_sweden:
                Intent swedenIntent=new Intent(MainActivity.this,SwedenActivity.class);
                startActivity(swedenIntent);
                break;
            case R.id.cardView_switzerland:
                Intent switzerlandIntent=new Intent(MainActivity.this,SwitzerlandActivity.class);
                startActivity(switzerlandIntent);
                break;
            case R.id.cardView_thailand:
                Intent thailandIntent=new Intent(MainActivity.this,ThailandActivity.class);
                startActivity(thailandIntent);
                break;
            case R.id.cardView_uk:
                Intent ukIntent=new Intent(MainActivity.this,EnglandActivity.class);
                startActivity(ukIntent);
                break;
            case R.id.cardView_turkey:
                Intent turkeyIntent=new Intent(MainActivity.this,TurkeyActivity.class);
                startActivity(turkeyIntent);
                break;
            default:
                Toast.makeText(MainActivity.this, "NO OPTION", Toast.LENGTH_SHORT).show();



        }

    }
}