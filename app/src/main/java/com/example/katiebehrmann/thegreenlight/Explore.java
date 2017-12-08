package com.example.katiebehrmann.thegreenlight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Explore extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

    }

    public void nowWhat(View view) {
        Intent d = new Intent(this, FinalScreen.class);
        startActivity(d);
    }

}

