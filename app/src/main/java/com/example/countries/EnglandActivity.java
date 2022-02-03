package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

public class EnglandActivity extends AppCompatActivity {

    private AppCompatTextView bats, glaxoSmith, astraZenca, hsbc, diageo, shell, unilever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        bats = findViewById(R.id.bats);
        bats.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjuprmTkOP1AhUS8xQKHWA5ABgQFnoECEAQAQ&url=https%3A%2F%2Fwww.reuters.com%2Fcompanies%2FBATS.L&usg=AOvVaw1TV-AN1oX4vBh5ZIf_HDtk"))));

        glaxoSmith = findViewById(R.id.glaxo_smith_kline);
        glaxoSmith.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiu9bPJkOP1AhUTEhQKHTLYCBkQFnoECDAQAQ&url=https%3A%2F%2Fwww.drugwatch.com%2Fmanufacturers%2Fglaxosmithkline%2F&usg=AOvVaw15RTESjWxEOTU4iEFW9UUl"))));

        astraZenca = findViewById(R.id.astra_zeneca);
        astraZenca.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiJ-c7OkeP1AhUIjhQKHShICRkQFnoECCIQAQ&url=https%3A%2F%2Fwww.drugwatch.com%2Fmanufacturers%2Fastrazeneca%2F&usg=AOvVaw1DJRssJIVHoEebg8L7_1ZJ"))));

        hsbc = findViewById(R.id.hsbc);
        hsbc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi7zoemkuP1AhUgDWMBHbYkBhkQFnoECAYQAQ&url=https%3A%2F%2Fwww.about.hsbc.co.uk%2F&usg=AOvVaw08YZhYchQw1Lm4182WKqAt"))));

        diageo = findViewById(R.id.diageo);
        diageo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi9nb3MkuP1AhU74eAKHeqlARgQjBB6BAgWEAE&url=https%3A%2F%2Fwww.diageo.com%2Fen%2Four-business%2Fwho-we-are%2F&usg=AOvVaw3MgOuN03GfIN5DCt8na12Y"))));

        shell = findViewById(R.id.shell);
        shell.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwihmN75kuP1AhWLHRQKHY9UCxkQFnoECAcQAQ&url=https%3A%2F%2Fwww.shell.com%2Fabout-us.html&usg=AOvVaw0rYAeR8jBAkSK511jjCWz3"))));

        unilever = findViewById(R.id.unilever);
        unilever.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwim4rW5k-P1AhUJsxQKHY9EDxcQFnoECFkQAQ&url=https%3A%2F%2Fwww.unilever.com%2Fnews%2Fnews-search%2F2020%2Fseven-things-you-may-not-know-about-unilever%2F&usg=AOvVaw0z7tGfmFRMnElOHZpVYYs3"))));


        AppCompatImageView busUk = findViewById(R.id.bus_uk);
        Glide.with(this).load("https://images.pexels.com/photos/163037/london-street-phone-cabin-163037.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(busUk);

        AppCompatImageView bridgeUk = findViewById(R.id.bridge_uk);
        Glide.with(this).load("https://images.pexels.com/photos/51363/london-tower-bridge-bridge-monument-51363.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(bridgeUk);

        AppCompatImageView castleUk = findViewById(R.id.castle_uk);
        Glide.with(this).load("https://images.pexels.com/photos/1837592/pexels-photo-1837592.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castleUk);

        AppCompatImageView rocksUk = findViewById(R.id.rocks_uk);
        Glide.with(this).load("https://images.pexels.com/photos/800532/pexels-photo-800532.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(rocksUk);

        AppCompatImageView crousel = findViewById(R.id.Carousel_uk);
        Glide.with(this).load("https://images.pexels.com/photos/800532/pexels-photo-800532.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(crousel);

        AppCompatImageView imperial = findViewById(R.id.imperial);
        Glide.with(this).load("http://ezapply.ir/sliders/slider_1536856930.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imperial);

        AppCompatImageView collegeLondon = findViewById(R.id.college_london);
        Glide.with(this).load("https://www.ox.ac.uk/sites/files/oxford/styles/ow_large_feature/s3/field/field_image_main/b_AllSoulsquad.jpg?itok=tTcH-5ix").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(collegeLondon);

        AppCompatImageView oxfordUni = findViewById(R.id.oxford);
        Glide.with(this).load("https://www.imperial.ac.uk/ImageCropToolT4/imageTool/uploaded-images/0000_191111_autumn_library_queens_lawn_001--tojpeg_1583940105577_x1.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(oxfordUni);

        AppCompatImageView manchester = findViewById(R.id.manchester);
        Glide.with(this).load("https://v9d5g3j5.rocketcdn.me/undergraduate-international-study/wp-content/uploads/sites/47/2018/03/england-manchester-university-entrance-16x9-960x540.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(manchester);
    }

}