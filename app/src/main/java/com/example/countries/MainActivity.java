package com.example.countries;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

=======
>>>>>>> origin/Hasti
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

<<<<<<< HEAD
    private AppCompatImageView america,belgium,brazil,australia,canada,china,french,germany,iran,japan,italy,korean,netherlands,norway,spain,sweden,switzerland,thailand,turkey,uk;
    private CardView cardviewSwitzerland, cardviewSweden,cardviewThailand,cardviewUk,cardviewAmerica,cardviewBelgium, cardviewBrazil, cardviewAustralia, cardviewCanada, cardviewChina, cardviewFrench, cardviewGermany, cardviewIran, cardviewJapan, cardviewItaly, cardviewKorean, cardviewNetherlands, cardviewNorway,cardviewTurkey, cardviewSpain;
=======
    private AppCompatImageView america, belgium, brazil, australia, canada, china, french, germany, iran, japan, italy, korean, netherlands, norway, spain, sweden, switzerland, thailand, turkey, uk;
    private CardView cardviewAmerica, cardviewBelgium, cardviewBrazil, cardviewAustralia, cardviewCanada, cardviewChina, cardviewFrench, cardviewGermany, cardviewIran, cardviewJapan, cardviewItaly, cardviewKorean, cardviewNetherlands, cardviewNorway, cardviewSpain;

>>>>>>> origin/Hasti
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
<<<<<<< HEAD
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
=======
        america = findViewById(R.id.imageview_america);
        belgium = findViewById(R.id.imageview_belgium);
        brazil = findViewById(R.id.imageview_brazil);
        australia = findViewById(R.id.imageview_australia);
        canada = findViewById(R.id.imageview_canada);
        china = findViewById(R.id.imageview_china);
        french = findViewById(R.id.imageview_french);
        germany = findViewById(R.id.imageview_germany);
        iran = findViewById(R.id.imageview_iran);
        japan = findViewById(R.id.imageview_japan);
        italy = findViewById(R.id.imageview_italy);
        korean = findViewById(R.id.imageview_korean);
        netherlands = findViewById(R.id.imageview_netherlands);
        norway = findViewById(R.id.imageview_norway);
        spain = findViewById(R.id.imageview_spain);
        sweden = findViewById(R.id.imageview_sweden);
        switzerland = findViewById(R.id.imageview_switzerland);
        thailand = findViewById(R.id.imageview_thailand);
        turkey = findViewById(R.id.imageview_turkey);
        uk = findViewById(R.id.imageview_uk);
>>>>>>> origin/Hasti


        cardviewAmerica= findViewById(R.id.cardView_america);


        cardviewAmerica.setOnClickListener(this);
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
<<<<<<< HEAD
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
=======
        switch (view.getId()) {
            case R.id.cardView_america:
                Intent americaIntent = new Intent(MainActivity.this, AmericaActivity.class);
                startActivity(americaIntent);
                break;
            case R.id.cardView_australia:
                Intent australiaIntent = new Intent(MainActivity.this, AustraliaActivity.class);
                startActivity(australiaIntent);
                break;
            case R.id.cardView_belgium:
                Intent belgiumIntent = new Intent(MainActivity.this, BelgiumActivity.class);
                startActivity(belgiumIntent);
                break;
            case R.id.cardView_brazil:
                Intent brazilIntent = new Intent(MainActivity.this, BrazilActivity.class);
                startActivity(brazilIntent);
                break;
            case R.id.cardView_canada:
                Intent canadaIntent = new Intent(MainActivity.this, CanadaActivity.class);
                startActivity(canadaIntent);
                break;
            case R.id.cardView_china:
                Intent chinaIntent = new Intent(MainActivity.this, ChinaActivity.class);
                startActivity(chinaIntent);
                break;
            case R.id.cardView_french:
                Intent frenchIntent = new Intent(MainActivity.this, FrenchActivity.class);
                startActivity(frenchIntent);
                break;
            case R.id.cardView_germany:
                Intent germanyIntent = new Intent(MainActivity.this, GermanyActivity.class);
                startActivity(germanyIntent);
                break;
            case R.id.cardView_iran:
                Intent iranIntent = new Intent(MainActivity.this, IranActivity.class);
                startActivity(iranIntent);
                break;
            case R.id.cardView_italy:
                Intent italyIntent = new Intent(MainActivity.this, ItalyActivity.class);
                startActivity(italyIntent);
                break;
            case R.id.cardView_japan:
                Intent japanIntent = new Intent(MainActivity.this, JapanActivity.class);
                startActivity(japanIntent);
                break;
            case R.id.cardView_korean:
                Intent koreanIntent = new Intent(MainActivity.this, KoreaActivity.class);
                startActivity(koreanIntent);
                break;
            case R.id.cardView_netherlands:
                Intent netherlandsIntent = new Intent(MainActivity.this, NetherlandsActivity.class);
                startActivity(netherlandsIntent);
                break;
            case R.id.cardView_norway:
                Intent norwayIntent = new Intent(MainActivity.this, NorwayActivity.class);
                startActivity(norwayIntent);
                break;
            case R.id.cardView_spain:
                Intent spainIntent = new Intent(MainActivity.this, SpainActivity.class);
                startActivity(spainIntent);
                break;
            case R.id.cardView_sweden:
                Intent swedenIntent = new Intent(MainActivity.this, SwedenActivity.class);
                startActivity(swedenIntent);
                break;
            case R.id.cardView_switzerland:
                Intent switzerlandIntent = new Intent(MainActivity.this, SwitzerlandActivity.class);
                startActivity(switzerlandIntent);
                break;
            case R.id.cardView_thailand:
                Intent thailandIntent = new Intent(MainActivity.this, ThailandActivity.class);
                startActivity(thailandIntent);
                break;
            case R.id.cardView_uk:
                Intent ukIntent = new Intent(MainActivity.this, EnglandActivity.class);
                startActivity(ukIntent);
                break;
            case R.id.cardView_turkey:
                Intent turkeyIntent = new Intent(MainActivity.this, TurkeyActivity.class);
>>>>>>> origin/Hasti
                startActivity(turkeyIntent);
                break;
            default:
                Toast.makeText(MainActivity.this, "NO OPTION", Toast.LENGTH_SHORT).show();
        }

    }
}