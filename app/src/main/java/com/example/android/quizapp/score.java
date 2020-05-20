package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class score extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        TextView textView = (TextView) findViewById(R.id.youscored);
        int n = getIntent().getIntExtra("score5", 0);
        textView.setText(""+n + "/5");



        Button button = (Button) findViewById(R.id.tryagain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmain();
            }
        });


    }

    public void openmain(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
