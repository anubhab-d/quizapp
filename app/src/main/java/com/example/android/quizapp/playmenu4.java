package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playmenu4 extends Activity {



    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmenu4);

         button1 = (Button) findViewById(R.id.a4);
         button2 = (Button) findViewById(R.id.b4);
         button3 = (Button) findViewById(R.id.c4);
         button4 = (Button) findViewById(R.id.d4);

        Intent i = getIntent();
        score= i.getIntExtra("score3", 0);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu5();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=1;
                openplaymenu5();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu5();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score+=0;
                openplaymenu5();
            }
        });
    }

    public void openplaymenu5(){

        Intent intent = new Intent(this, playmenu5.class);
        intent.putExtra("score4", score);
        startActivity(intent);
    }
}
