package com.rickhuisman.chipviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rickhuisman.chipviewtest.Chip.Chip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createChip("Foo Bar");
        createChip("John Doe");
        createChip("Test Test");
    }

    private void createChip(String text) {
        Chip chip = new Chip(this);
        chip.setHasIcon(true);
        chip.setChipIcon("https://www.google.nl/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");

        chip.setClosable(true);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(10, 10, 10, 10);

        chip.setLayoutParams(lp);

        chip.setChipText(text);

        LinearLayout chipContainer = findViewById(R.id.container);
        chipContainer.addView(chip);
    }
}
