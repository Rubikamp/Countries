package com.example.countries;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;


public class SwedenActivity extends AppCompatActivity {
    AppCompatTextView ericsson, essity, handm, ikea, skanska;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweden);

        AppCompatImageView castleSweden = findViewById(R.id.castle_sweden);
        Glide.with(this).load(PicLinks.CASTLE_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleSweden);

        AppCompatImageView elevatorSweden = findViewById(R.id.elevator_sweden);
        Glide.with(this).load(PicLinks.ELEVATOR_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(elevatorSweden);

        AppCompatImageView homeSweden = findViewById(R.id.home_sweden);
        Glide.with(this).load(PicLinks.HOME_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(homeSweden);

        AppCompatImageView redElevatorSweden = findViewById(R.id.red_elevator_sweden);
        Glide.with(this).load(PicLinks.RED_ELEVATOR_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(redElevatorSweden);

        AppCompatImageView treeWallSweden = findViewById(R.id.tree_wall_sweden);
        Glide.with(this).load(PicLinks.TREE_WALL_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(treeWallSweden);

        AppCompatImageView roytoUni = findViewById(R.id.royto_sweden);
        Glide.with(this).load(PicLinks.ROYTO_UNI_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(roytoUni);

        AppCompatImageView bienmaUni = findViewById(R.id.bienma_sweden);
        Glide.with(this).load(PicLinks.BIENMA_UNI_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bienmaUni);

        AppCompatImageView niamdlaUni = findViewById(R.id.niamdla_sweden);
        Glide.with(this).load(PicLinks.NIAMDLA_UNI_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(niamdlaUni);

        AppCompatImageView mkowpleUni = findViewById(R.id.mkowple_sweden);
        Glide.with(this).load(PicLinks.MKOWPLE_UNI_SWEDEN_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(mkowpleUni);


        ericsson = findViewById(R.id.ericsson);
        ericsson.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ERICSSON_URL))));

        essity = findViewById(R.id.essity);
        essity.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.ESSITY_URL))));

        handm = findViewById(R.id.handm);
        handm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.HANDM_URL))));

        ikea = findViewById(R.id.ikea);
        ikea.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.IKEA_URL))));

        skanska = findViewById(R.id.skanska);
        skanska.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.SHANSKA_URL))));

    }
}