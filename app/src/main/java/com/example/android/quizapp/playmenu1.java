package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playmenu1 extends Activity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmenu1);

         button1 = (Button) findViewById(R.id.a);
         button2 = (Button) findViewById(R.id.b);
         button3 = (Button) findViewById(R.id.c);
         button4 = (Button) findViewById(R.id.d);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score=1;
                openplaymenu2();


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score=0;
                openplaymenu2();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score=0;
                openplaymenu2();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score=0;
                openplaymenu2();

            }
        });
    }

    public void openplaymenu2(){




        Intent intent = new Intent(this, playmenu2.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }


}
