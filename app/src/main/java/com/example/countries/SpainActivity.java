package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class SpainActivity extends AppCompatActivity {

    private AppCompatTextView inditex, iberdrola, santander, amadeus, naturgy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);

        inditex = findViewById(R.id.inditex);
        inditex.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjk85X7x-P1AhWJzIUKHWdFDJIQFnoECAUQAw&url=https%3A%2F%2Fwww.inditex.com%2Fabout-us%2Fwho-we-are&usg=AOvVaw2SbhaVgDzLkQZcBY-kNYip"))));

        iberdrola = findViewById(R.id.iberdrola);
        iberdrola.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjcxv6wyOP1AhWhx4UKHXlsAhsQFnoECAUQAQ&url=https%3A%2F%2Fwww.iberdrola.com%2Fabout-us&usg=AOvVaw0jsHSBrjJbAB7L_OaD4Uku"))));

        santander = findViewById(R.id.santander);
        santander.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjozI3LyOP1AhVPOBoKHf0ZBYsQFnoECAgQAQ&url=https%3A%2F%2Fwww.santander.com%2Fen%2Fabout-us&usg=AOvVaw2OREbW4CRKYE46nFdc6uUH"))));

        amadeus = findViewById(R.id.amadeus);
        amadeus.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjdrsfqyOP1AhVuxYUKHXxHDZsQFnoECAQQAw&url=https%3A%2F%2Famadeus.com%2Fen%2Fabout&usg=AOvVaw3l1ml1L4fd5hBBJAw8rdFV"))));

        naturgy = findViewById(R.id.naturgy);
        naturgy.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwixxPr4yOP1AhUN3IUKHbgYA6oQFnoECFEQAQ&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FNaturgy&usg=AOvVaw2VxRWUxVMsrGIJq0jsqCeO"))));


        AppCompatImageView whitePlace = findViewById(R.id.white_place);
        Glide.with(this).load("https://images.pexels.com/photos/256150/pexels-photo-256150.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(whitePlace);

        AppCompatImageView castle = findViewById(R.id.castle_spain);
        Glide.with(this).load("https://images.unsplash.com/photo-1606085979455-b99c5c96a462?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FuJTIwbG9yZW56byUyMGRlJTIwZWwlMjBlc2NvcmlhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(castle);

        AppCompatImageView tower = findViewById(R.id.tower_spain);
        Glide.with(this).load("https://images.pexels.com/photos/8298825/pexels-photo-8298825.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tower);

        AppCompatImageView home = findViewById(R.id.home_spain);
        Glide.with(this).load("https://images.pexels.com/photos/8306444/pexels-photo-8306444.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(home);

        AppCompatImageView ninej = findViewById(R.id.ninej_spain);
        Glide.with(this).load("https://images.pexels.com/photos/10431543/pexels-photo-10431543.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ninej);

        AppCompatImageView tiken = findViewById(R.id.tiken_spain);
        Glide.with(this).load("https://www.timeshighereducation.com/sites/default/files/resize/remote/135290799f20147a7d92badad3b5b957-620x413.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(tiken);

        AppCompatImageView nierm = findViewById(R.id.nierm_spain);
        Glide.with(this).load("https://utrecht-network.org/wp-content/uploads/2015/06/Valencia-Web.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(nierm);

        AppCompatImageView ekromd = findViewById(R.id.ekromd_spain);
        Glide.with(this).load("https://www.ntnu.edu/documents/1297014369/1298821756/Madrid+ciudad_universitaria_0-1.jpg/761db70b-1cc9-6727-69a8-fafc6699d378?t=1617806150305&imagePreview=1").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(ekromd);

        AppCompatImageView denke = findViewById(R.id.denke_spain);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/9/9f/UNIVERSIDAD_DE_BARCELONA_%2814%29.JPG").placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(denke);


    }
}