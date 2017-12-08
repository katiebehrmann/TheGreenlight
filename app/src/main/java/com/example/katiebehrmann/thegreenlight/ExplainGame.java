package com.example.katiebehrmann.thegreenlight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ExplainGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_game);
    }

    public void playGameAlready(View view) {
        Intent i = new Intent(this, PlayGame.class);
        startActivity(i);
    }
}
