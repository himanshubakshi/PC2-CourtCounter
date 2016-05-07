package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTeamAScore() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void diaplayTeamBScore() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }


    public void add3PointsTeamB(View v) {
        teamBScore += 3;
        diaplayTeamBScore();
    }

    public void add2PointsTeamB(View v) {
        teamBScore += 2;
        diaplayTeamBScore();
    }

    public void add1PointTeamB(View v) {
        teamBScore += 1;
        diaplayTeamBScore();
    }


    public void add3PointsTeamA(View v) {
        teamAScore += 3;
        displayTeamAScore();
    }

    public void add2PointsTeamA(View v) {
        teamAScore += 2;
        displayTeamAScore();
    }

    public void add1PointTeamA(View v) {
        teamAScore += 1;
        displayTeamAScore();
    }

    public void resetScore(View v) {
        teamAScore = teamBScore = 0;
        displayTeamAScore();
        diaplayTeamBScore();
    }
}
