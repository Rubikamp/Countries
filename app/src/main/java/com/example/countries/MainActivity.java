package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private AppCompatImageView america,belgium,brazil,australia,canada,china,french,germany,iran,japan,italy,korean,netherlands,norway,spain,sweden,switzerland,thailand,turkey,uk;
    private CardView cardviewSwitzerland, cardviewSweden,cardviewThailand,cardviewUk,cardviewAmerica,cardviewBelgium, cardviewBrazil, cardviewAustralia, cardviewCanada, cardviewChina, cardviewFrench, cardviewGermany, cardviewIran, cardviewJapan, cardviewItaly, cardviewKorean, cardviewNetherlands, cardviewNorway,cardviewTurkey, cardviewSpain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
          america= findViewById(R.id.ImageView_america);
          belgium=findViewById(R.id.ImageView_belgium);
          brazil=findViewById(R.id.ImageView_brazil);
          australia=findViewById(R.id.ImageView_australia);
          canada=findViewById(R.id.ImageView_canada);
          china=findViewById(R.id.ImageView_china);
          french=findViewById(R.id.ImageView_french);
          germany=findViewById(R.id.ImageView_germany);
          iran=findViewById(R.id.ImageView_iran);
          japan=findViewById(R.id.ImageView_japan);
          italy=findViewById(R.id.ImageView_italy);
          korean=findViewById(R.id.ImageView_korean);
          netherlands=findViewById(R.id.ImageView_netherlands);
          norway=findViewById(R.id.ImageView_norway);
          spain=findViewById(R.id.ImageView_spain);
          sweden=findViewById(R.id.ImageView_sweden);
          switzerland=findViewById(R.id.ImageView_switzerland);
          thailand=findViewById(R.id.ImageView_thailand);
          turkey=findViewById(R.id.ImageView_turkey);
          uk=findViewById(R.id.ImageView_uk);


        cardviewAmerica= findViewById(R.id.ImageView_america);
        cardviewBelgium= findViewById(R.id.ImageView_belgium);
        cardviewBrazil= findViewById(R.id.ImageView_brazil);
        cardviewAustralia= findViewById(R.id.ImageView_australia);
        cardviewCanada= findViewById(R.id.ImageView_canada);
        cardviewChina= findViewById(R.id.ImageView_china);
        cardviewFrench= findViewById(R.id.ImageView_french);
        cardviewGermany= findViewById(R.id.ImageView_germany);
        cardviewIran= findViewById(R.id.ImageView_iran);
        cardviewJapan= findViewById(R.id.ImageView_japan);
        cardviewItaly= findViewById(R.id.ImageView_italy);
        cardviewKorean= findViewById(R.id.ImageView_korean);
        cardviewNorway= findViewById(R.id.ImageView_norway);
        cardviewNetherlands= findViewById(R.id.ImageView_netherlands);
        cardviewTurkey= findViewById(R.id.ImageView_turkey);
        cardviewUk= findViewById(R.id.ImageView_uk);
        cardviewSweden= findViewById(R.id.ImageView_sweden);
        cardviewThailand= findViewById(R.id.ImageView_thailand);
        cardviewSpain= findViewById(R.id.ImageView_spain);
        cardviewSwitzerland= findViewById(R.id.ImageView_switzerland);


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
            case R.id.cardviewAmerica:
                Intent americaIntenet=new Intent(MainActivity.this, AmericaActivity.class);
                startActivity(americaIntenet);
                break;
            case R.id.cardviewAustralia:
                Intent australiaIntent=new Intent(MainActivity.this,AustraliaActivity.class);
                startActivity(australiaIntent);
                break;
            case R.id.cardviewBelgium:
                Intent belgiumIntent=new Intent(MainActivity.this, BelgiumActivity.class);
                startActivity(belgiumIntent);
                break;
            case R.id.cardviewBrazil:
                Intent brazilIntent=new Intent(MainActivity.this,BrazilActivity.class);
                startActivity(brazilIntent);
                break;
            case R.id.cardviewCanada:
                Intent canadaIntent=new Intent(MainActivity.this,CanadaActivity.class);
                startActivity(canadaIntent);
                break;
            case R.id.cardviewChina:
                Intent chinaIntent=new Intent(MainActivity.this,ChinaActivity.class);
                startActivity(chinaIntent);
                break;
            case R.id.cardviewFrench:
                Intent frenchIntent=new Intent(MainActivity.this,FrenchActivity.class);
                startActivity(frenchIntent);
                break;
            case R.id.cardviewGermany:
                Intent germanyIntent=new Intent(MainActivity.this,GermanyActivity.class);
                startActivity(germanyIntent);
                break;
            case R.id.cardviewIran:
                Intent iranIntent=new Intent(MainActivity.this,IranActivity.class);
                startActivity(iranIntent);
                break;
            case R.id.cardviewItaly:
                Intent italyIntent=new Intent(MainActivity.this,ItalyActivity.class);
                startActivity(italyIntent);
                break;
            case R.id.cardviewJapan:
                Intent japanIntent=new Intent(MainActivity.this,JapanActivity.class);
                startActivity(japanIntent);
                break;
            case R.id.cardviewKorean:
                Intent koreanIntent=new Intent(MainActivity.this,KoreaActivity.class);
                startActivity(koreanIntent);
                break;
            case R.id.cardviewNetherlands:
                Intent netherlandsIntent=new Intent(MainActivity.this,NetherlandsActivity.class);
                startActivity(netherlandsIntent);
                break;
            case R.id.cardviewNorway:
                Intent norwayIntent=new Intent(MainActivity.this,NorwayActivity.class);
                startActivity(norwayIntent);
                break;
            case R.id.cardviewSpain:
                Intent spainIntent=new Intent(MainActivity.this,SpainActivity.class);
                startActivity(spainIntent);
                break;
            case R.id.cardviewSweden:
                Intent swedenIntent=new Intent(MainActivity.this,SwedenActivity.class);
                startActivity(swedenIntent);
                break;
            case R.id.cardviewSwitzerland:
                Intent switzerlandIntent=new Intent(MainActivity.this,SwitzerlandActivity.class);
                startActivity(switzerlandIntent);
                break;
            case R.id.cardviewThailand:
                Intent thailandIntent=new Intent(MainActivity.this,ThailandActivity.class);
                startActivity(thailandIntent);
                break;
            case R.id.cardviewUk:
                Intent ukIntent=new Intent(MainActivity.this,EnglandActivity.class);
                startActivity(ukIntent);
                break;
            case R.id.cardviewTurkey:
                Intent turkeyIntent=new Intent(MainActivity.this,TurkeyActivity.class);
                startActivity(turkeyIntent);
                break;
            default:
                Toast.makeText(MainActivity.this, "NO OPTION", Toast.LENGTH_SHORT).show();



        }

    }
}