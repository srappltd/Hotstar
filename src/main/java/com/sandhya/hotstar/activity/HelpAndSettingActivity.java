package com.sandhya.hotstar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sandhya.hotstar.R;

public class HelpAndSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and_setting);

        ImageView imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(view -> {
            onBackPressed();
        });

    }
}