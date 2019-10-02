package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addPoint(View view) {
        // Receive a view and find which one of the buttons that sent the action
        char team = 'a';
        int newScore = 0;
        switch (view.getId()) {
            case R.id.freeThrowButton:
                newScore = 1;
                break;
            case R.id.twoPointsButton:
                newScore = 2;
                break;
            case R.id.threePointsButton:
                newScore = 3;
                break;
            case R.id.freeThrowButtonB:
                team = 'b';
                newScore = 1;
                break;
            case R.id.twoPointsButtonB:
                team = 'b';
                newScore = 2;
                break;
            case R.id.threePointsButtonB:
                team = 'b';
                newScore = 3;
                break;
        }
        // Test if it is team 'A' or 'B'
        TextView scoreView;
        if (team == 'a') {
            scoreView = findViewById(R.id.team_a_score);
        } else {
            scoreView = findViewById(R.id.team_b_score);
        }
        //Updates the value of the TextView
        scoreView.setText(String.valueOf(newScore + Integer.parseInt(scoreView.getText().toString())));

    }

    public void resetPoints(View view) {
        TextView scoreView;
        scoreView = findViewById(R.id.team_a_score);
        scoreView.setText("0");
        scoreView = findViewById(R.id.team_b_score);
        scoreView.setText("0");
    }
}
