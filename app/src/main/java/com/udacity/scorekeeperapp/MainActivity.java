package com.udacity.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewScoreTeamA;
    TextView textViewScoreTeamB;
    TextView textViewFoulsTeamA;
    TextView textViewFoulsTeamB;
    int scoreTeamA;
    int scoreTeamB;
    int foulsTeamA;
    int foulsTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewScoreTeamA = (TextView) findViewById(R.id.team_a_score_textview);
        textViewScoreTeamB = (TextView) findViewById(R.id.team_b_score_textview);
        textViewFoulsTeamA = (TextView) findViewById(R.id.team_a_fouls_textview);
        textViewFoulsTeamB = (TextView) findViewById(R.id.team_b_fouls_textview);
        reset();
    }

    public void addPointTeamA(View view) {
        scoreTeamA++;
        displayScoreAndFouls();
    }

    public void addFoulTeamA(View view) {
        foulsTeamA++;
        displayScoreAndFouls();
    }

    public void addPointTeamB(View view) {
        scoreTeamB++;
        displayScoreAndFouls();
    }

    public void addFoulTeamB(View view) {
        foulsTeamB++;
        displayScoreAndFouls();
    }

    private void displayScoreAndFouls() {
        textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
        textViewScoreTeamB.setText(String.valueOf(scoreTeamB));
        textViewFoulsTeamA.setText(String.valueOf(foulsTeamA));
        textViewFoulsTeamB.setText(String.valueOf(foulsTeamB));
    }

    public void reset() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreAndFouls();
    }

    public void resetScore(View view) {
        reset();
    }
}
