package com.example.rybackpo.starratingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ratings;
    private CheckBox stars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratings = (LinearLayout) findViewById(R.id.rating);

        for(int i = 1; i <= 5; i++){
            stars = (CheckBox) ratings.findViewWithTag(String.valueOf(i));
            stars.setOnClickListener(starsListener);
        }
    }

    private View.OnClickListener starsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());

            for(int i = 1; i <= tag; i++){
                stars = (CheckBox) ratings.findViewWithTag(String.valueOf(i));
                stars.setChecked(true);
            }

            for(int i = tag + 1; i <= 5; i++){
                stars = (CheckBox) ratings.findViewWithTag(String.valueOf(i));
                stars.setChecked(false);
            }
        }
    };
}
