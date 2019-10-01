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
        }
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(newScore + Integer.parseInt(scoreView.getText().toString())));

    }
}
