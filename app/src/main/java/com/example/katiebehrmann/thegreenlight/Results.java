package com.example.katiebehrmann.thegreenlight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView yourResults;
    private int counter;
    private TextView header;
    private TextView explanation;
    private TextView bottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        yourResults = (TextView) findViewById(R.id.yourResults);
        header = (TextView) findViewById(R.id.realreason);
        explanation = (TextView) findViewById(R.id.festival);
        bottomText = (TextView) findViewById(R.id.bechdel);

        int b = getIntent().getExtras().getInt("BECHDEL");
        int n = getIntent().getExtras().getInt("NONBECHDEL");


        yourResults.setText(b + " of your Greenlighted movies PASSED the Bechdel Test" + "\n\n"
                + n + " of your Greenlighted movies FAILED the Bechdel Test");
        counter = 0;
    }

    public void findOutMore(View view) {
        counter = counter + 1;

        if (counter == 1) {
            header.setText("");
            explanation.setText("");
            yourResults.setText(R.string.three_criteria);
            bottomText.setText("In a study of 6,116 movies, only 57% met these criteria.\nFurthermore, passing the Bechdel Test still does not ensure fair, non-sexist representation of women in film");
        }

        if (counter > 1) {
            Intent i = new Intent(this, Explore.class);
            startActivity(i);
        }

    }
}
