package com.example.scorecountingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_A_Score = 0;
    int team_B_Score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void A_plus3Score(View view){
        team_A_Score += 3;
        displayA(team_A_Score);
    }
    public void A_plus2Score(View view){
        team_A_Score += 2;
        displayA(team_A_Score);
    }
    public void A_plus1Score(View view){
        team_A_Score += 1;
        displayA(team_A_Score);
    }
    public void B_plus3Score(View view){
        team_B_Score += 3;
        displayB(team_B_Score);
    }
    public void B_plus2Score(View view){
        team_B_Score += 2;
        displayB(team_B_Score);
    }
    public void B_plus1Score(View view){
        team_B_Score += 1;
        displayB(team_B_Score);
    }

    public void displayA(int num){
        TextView score = (TextView) findViewById(R.id.textView4);
        score.setText(String.valueOf(num));
    }
    public void displayB(int num){
        TextView score = (TextView) findViewById(R.id.textView5);
        score.setText(String.valueOf(num));
    }
    public void reset(View view){
        team_A_Score=0;
        team_B_Score=0;
        displayA(team_A_Score);
        displayB(team_B_Score);
    }

}