package org.rubikamp.countries.details;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.rubikamp.countries.R;

public class EnglandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.enter_from_left_slide, R.anim.exit_to_right_slide);
    }
}