package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class playmenu2 extends Activity {


    Button button1;
    Button button2;
    Button button3;
    Button button4;

    int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmenu2);

         button1 = (Button) findViewById(R.id.a2);
         button2 = (Button) findViewById(R.id.b2);
         button3 = (Button) findViewById(R.id.c2);
         button4 = (Button) findViewById(R.id.d2);

        Intent i = getIntent();
        score= i.getIntExtra("score", 0);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=0;
                openplaymenu3();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=0;
                openplaymenu3();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=0;
                openplaymenu3();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score+=1;
                openplaymenu3();
            }
        });



    }

    public void openplaymenu3(){

        Intent intent = new Intent(this, playmenu3.class);
        intent.putExtra("score2", score);
        startActivity(intent);
    }
}

