package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class EnglandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatImageView imageViewGlide=findViewById(R.id.bus_uk);
        Glide.with(this).load("https://images.pexels.com/photos/163037/london-street-phone-cabin-163037.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.bridge_uk);
        Glide.with(this).load("https://images.pexels.com/photos/51363/london-tower-bridge-bridge-monument-51363.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.castle_uk);
        Glide.with(this).load("https://images.pexels.com/photos/1837592/pexels-photo-1837592.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.rocks_uk);
        Glide.with(this).load("https://images.pexels.com/photos/1448136/pexels-photo-1448136.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.Carousel_uk);
        Glide.with(this).load("https://images.pexels.com/photos/800532/pexels-photo-800532.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.imperial);
        Glide.with(this).load("https://v9d5g3j5.rocketcdn.me/undergraduate-international-study/wp-content/uploads/sites/47/2018/03/england-manchester-university-entrance-16x9-960x540.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.college_london);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1536856930.jpg").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.oxford);
        Glide.with(this).load("https://www.ox.ac.uk/sites/files/oxford/styles/ow_large_feature/s3/field/field_image_main/b_AllSoulsquad.jpg?itok=tTcH-5ix").into(imageViewGlide);

        imageViewGlide = findViewById(R.id.manchester);
        Glide.with(this).load("https://www.imperial.ac.uk/ImageCropToolT4/imageTool/uploaded-images/0000_191111_autumn_library_queens_lawn_001--tojpeg_1583940105577_x1.jpg").into(imageViewGlide);
    }

}