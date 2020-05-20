package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playmenu3 extends Activity {



    Button button1;
    Button button2;
    Button button3;
    Button button4;

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmenu3);

         button1 = (Button) findViewById(R.id.a3);
         button2 = (Button) findViewById(R.id.b3);
         button3 = (Button) findViewById(R.id.c3);
         button4 = (Button) findViewById(R.id.d3);


        Intent i = getIntent();
        score= i.getIntExtra("score2", 0);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=1;
                openplaymenu4();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu4();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu4();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu4();
            }
        });
    }

    public void openplaymenu4(){

        Intent intent = new Intent(this, playmenu4.class);
        intent.putExtra("score3", score);
        startActivity(intent);
    }
}
