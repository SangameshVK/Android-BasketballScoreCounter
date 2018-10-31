package com.example.sangamesh.courtcounter;

import android.arch.lifecycle.AndroidViewModel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer TeamAPoints = 0;
    private Integer TeamBPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamA2Points(View view) {
        TeamAPoints += 2;
        DisplayTeamA();
    }

    public void TeamA3Points(View view) {
        TeamAPoints += 3;
        DisplayTeamA();
    }

    public void TeamAFreeThrow(View view) {
        TeamAPoints += 1;
        DisplayTeamA();
    }

    public void DisplayTeamA() {
        TextView teamAScore = findViewById(R.id.TeamAScore);
        teamAScore.setText(TeamAPoints.toString());
    }

    public void TeamB2Points(View view) {
        TeamBPoints += 2;
        DisplayTeamB();
    }

    public void TeamB3Points(View view) {
        TeamBPoints += 3;
        DisplayTeamB();
    }

    public void TeamBFreeThrow(View view) {
        TeamBPoints += 1;
        DisplayTeamB();
    }

    public void DisplayTeamB() {
        TextView teamBScore = findViewById(R.id.TeamBScore);
        teamBScore.setText(TeamBPoints.toString());
    }

    public void ResetScores(View view) {
        TeamAPoints = TeamBPoints = 0;
        DisplayTeamA();
        DisplayTeamB();
    }
}
