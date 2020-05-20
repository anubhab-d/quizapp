package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playmenu5 extends Activity {



    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmenu5);

         button1 = (Button) findViewById(R.id.a5);
         button2 = (Button) findViewById(R.id.b5);
         button3 = (Button) findViewById(R.id.c5);
         button4 = (Button) findViewById(R.id.d5);

        Intent i = getIntent();
        score= i.getIntExtra("score4", 0);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openscore();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=0;
                openscore();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=0;
                openscore();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=1;
                openscore();
            }
        });
    }

    public void openscore(){

        Intent intent = new Intent(this, score.class);
        intent.putExtra("score5", score);
        startActivity(intent);
    }
}

