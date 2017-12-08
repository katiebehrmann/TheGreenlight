package com.example.katiebehrmann.thegreenlight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayGame extends AppCompatActivity {

    private ImageView movie;
    private TextView movieCopy;
    private TextView title;
    private int bechdel;
    private int nonBechdel;
    private int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        movie = (ImageView) findViewById(R.id.movie_image);
        movieCopy = (TextView) findViewById(R.id.movie_copy);
        title = (TextView) findViewById(R.id.titleofmovie);

        counter = 0;
        bechdel = 0;
        nonBechdel = 0;
    }

    public void greenLight(View view) {
        counter = counter + 1;
        if (counter == 1) {
            movie.setImageResource(R.drawable.valleys);
            movieCopy.setText(R.string.bounty_valley);
            title.setText("The Keeper of Trees");
            bechdel = bechdel + 1;
        }

        if (counter == 2) {
            movie.setImageResource(R.drawable.para);
            movieCopy.setText(R.string.paranormal_paralegal);
            title.setText("Paranormal Paralegal");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 3) {
            movie.setImageResource(R.drawable.dna);
            movieCopy.setText(R.string.life_molecule);
            title.setText("The Life Molecule");
            bechdel = bechdel + 1;
        }

        if (counter == 4) {
            movie.setImageResource(R.drawable.jeremy);
            movieCopy.setText(R.string.meet_jeremy);
            title.setText("Meet Jeremy");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 5) {
            movie.setImageResource(R.drawable.priest);
            movieCopy.setText(R.string.miranda_priestess);
            title.setText("Miranda, Priestess of the Midwest");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 6) {
            movie.setImageResource(R.drawable.ink);
            movieCopy.setText(R.string.family_ink);
            title.setText("Family, Inkorporated");
            bechdel = bechdel + 1;
        }

        if (counter == 7) {
            movie.setImageResource(R.drawable.winkle);
            movieCopy.setText(R.string.winkle_me);
            title.setText("Winkle and Me");
            bechdel = bechdel + 1;
        }
        if (counter == 8) {
            movie.setImageResource(R.drawable.winhard);
            movieCopy.setText(R.string.win_hard);
            title.setText("Win Hard");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 9) {
            movie.setImageResource(R.drawable.carry);
            movieCopy.setText(R.string.carry_that_weight);
            title.setText("Carry That Weight");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 10) {
            movie.setImageResource(R.drawable.worldnet);
            movieCopy.setText(R.string.vortex);
            title.setText("The Vortex");
            bechdel = bechdel + 1;
        }

        if (counter == 11) {
            movie.setImageResource(R.drawable.coney);
            movieCopy.setText(R.string.coney_island);
            title.setText("The Coney Island Six");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 12) {
            movie.setImageResource(R.drawable.caught);
            movieCopy.setText(R.string.caught_in_middle);
            title.setText("Caught in the Middle");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 13) {
            movie.setImageResource(R.drawable.software);
            movieCopy.setText(R.string.software_sky);
            title.setText("Software in the Sky");
            nonBechdel = nonBechdel + 1;
        }
        if (counter == 14) {
            movie.setImageResource(R.drawable.escape);
            movieCopy.setText(R.string.escape_woods);
            title.setText("Escape the Woods");
            bechdel = bechdel + 1;
        }

        if (counter == 15) {
            movie.setImageResource(R.drawable.gak);
            movieCopy.setText(R.string.greatest_mistake);
            title.setText("Gak and Fizzle III: The Greatest Mistake");
            bechdel = bechdel + 1;
        }

        if (counter == 16) {
            movie.setImageResource(R.drawable.war);
            movieCopy.setText(R.string.war_on_time);
            title.setText("The War on Time");
            nonBechdel = nonBechdel + 1;
        }

        if (counter == 17) {
            bechdel = bechdel + 1;
            Intent i = new Intent(this, Results.class);
            i.putExtra("BECHDEL", bechdel);
            i.putExtra("NONBECHDEL", nonBechdel);
            startActivity(i);

        }

    }

    public void redLight(View view) {
        counter = counter + 1;
        if (counter == 1) {
            movie.setImageResource(R.drawable.valleys);
            movieCopy.setText(R.string.bounty_valley);
            title.setText("The Keeper of Trees");
        }

        if (counter == 2) {
            movie.setImageResource(R.drawable.para);
            movieCopy.setText(R.string.paranormal_paralegal);
            title.setText("Paranormal Paralegal");
        }

        if (counter == 3) {
            movie.setImageResource(R.drawable.dna);
            movieCopy.setText(R.string.life_molecule);
            title.setText("The Life Molecule");
        }

        if (counter == 4) {
            movie.setImageResource(R.drawable.jeremy);
            movieCopy.setText(R.string.meet_jeremy);
            title.setText("Meet Jeremy");
        }

        if (counter == 5) {
            movie.setImageResource(R.drawable.priest);
            movieCopy.setText(R.string.miranda_priestess);
            title.setText("Miranda, Priestess of the Midwest");
        }
        if (counter == 6) {
            movie.setImageResource(R.drawable.ink);
            movieCopy.setText(R.string.family_ink);
            title.setText("Family, Inkorporated");
        }

        if (counter == 7) {
            movie.setImageResource(R.drawable.winkle);
            movieCopy.setText(R.string.winkle_me);
            title.setText("Winkle and Me");
        }

        if (counter == 8) {
            movie.setImageResource(R.drawable.winhard);
            movieCopy.setText(R.string.win_hard);
            title.setText("Win Hard");
        }

        if (counter == 9) {
            movie.setImageResource(R.drawable.carry);
            movieCopy.setText(R.string.carry_that_weight);
            title.setText("Carry That Weight");
        }

        if (counter == 10) {
            movie.setImageResource(R.drawable.worldnet);
            movieCopy.setText(R.string.vortex);
            title.setText("The Vortex");
        }

        if (counter == 11) {
            movie.setImageResource(R.drawable.coney);
            movieCopy.setText(R.string.coney_island);
            title.setText("The Coney Island Six");
        }

        if (counter == 12) {
            movie.setImageResource(R.drawable.caught);
            movieCopy.setText(R.string.caught_in_middle);
            title.setText("Caught in the Middle");
        }

        if (counter == 13) {
            movie.setImageResource(R.drawable.software);
            movieCopy.setText(R.string.software_sky);
            title.setText("Software in the Sky");
        }

        if (counter == 14) {
            movie.setImageResource(R.drawable.escape);
            movieCopy.setText(R.string.escape_woods);
            title.setText("Escape the Woods");
        }

        if (counter == 15) {
            movie.setImageResource(R.drawable.gak);
            movieCopy.setText(R.string.greatest_mistake);
            title.setText("Gak and Fizzle III: The Greatest Mistake");
        }

        if (counter == 16) {
            movie.setImageResource(R.drawable.war);
            movieCopy.setText(R.string.war_on_time);
            title.setText("The War on Time");
        }

        if (counter == 17) {
            Intent i = new Intent(this, Results.class);
            i.putExtra("BECHDEL", bechdel);
            i.putExtra("NONBECHDEL", nonBechdel);
            startActivity(i);

        }

    }
}
