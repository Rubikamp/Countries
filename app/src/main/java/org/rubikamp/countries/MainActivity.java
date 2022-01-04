package org.rubikamp.countries;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import org.rubikamp.countries.details.EnglandActivity;
import org.rubikamp.countries.details.FranceActivity;
import org.rubikamp.countries.details.GermanActivity;
import org.rubikamp.countries.details.NetherlandActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardViewEngland, cardViewFrance, cardViewNetherland, cardViewGermany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewEngland = findViewById(R.id.cardview_england);
        cardViewFrance = findViewById(R.id.cardview_france);
        cardViewNetherland = findViewById(R.id.cardview_netherland);
        cardViewGermany = findViewById(R.id.cardview_germany);

        cardViewEngland.setOnClickListener(this);
        cardViewFrance.setOnClickListener(this);
        cardViewNetherland.setOnClickListener(this);
        cardViewGermany.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cardview_england:
                startActivity(new Intent(MainActivity.this, EnglandActivity.class));
                break;

            case R.id.cardview_france:
                startActivity(new Intent(MainActivity.this, FranceActivity.class));
                break;
            case R.id.cardview_netherland:
                startActivity(new Intent(MainActivity.this, NetherlandActivity.class));
                break;
            case R.id.cardview_germany:
                startActivity(new Intent(MainActivity.this, GermanActivity.class));
                break;

            default:
                Toast.makeText(this, "No Country selected!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.exit_to_left_slide);
    }
}