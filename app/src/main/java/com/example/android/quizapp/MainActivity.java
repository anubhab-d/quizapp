package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.start);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openAcitivity2();

            }
        });


    }

    public void openAcitivity2(){

        Intent intent = new Intent(this, playmenu1.class);
        startActivity(intent);
    }
}
