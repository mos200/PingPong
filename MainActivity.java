package com.example.android.pingpong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamAtotalScore = 0;
    int teamBscore = 0;
    int teamBtotalScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pointForA(View view) {
        teamAscore = teamAscore + 1;
        displayForTeamA(teamAscore);
        if (teamAscore >= 10){
            teamAscore = 0;
            teamAtotalScore = teamAtotalScore + 1;
            displaytotalTeamA(teamAtotalScore);
        }
    }

    public void pointForB(View view) {
        teamBscore = teamBscore + 1;
        displayForTeamB(teamBscore);
        if (teamBscore >= 10){
            teamBscore = 0;
            teamBtotalScore = teamBtotalScore + 1;
            displaytotalTeamB(teamBtotalScore);
        }
    }

    public void resetScore(View view) {
        teamAscore = 0;
        teamAtotalScore = 0;
        teamBscore = 0;
        teamBtotalScore = 0;
        displayForTeamA(teamAscore);
        displaytotalTeamA(teamAtotalScore);
        displayForTeamB(teamBscore);
        displaytotalTeamB(teamBtotalScore);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }
    public void displaytotalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreAt);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void displaytotalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreBt);
        scoreView.setText(String.valueOf(score));
    }



}
