package com.example.farmbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shepherdshut extends AppCompatActivity {


    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shepherdshut);

        book = (Button) findViewById(R.id.Book3);

        book.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent signUp = new Intent(shepherdshut.this, pay.class);
                startActivity(signUp);

            }

        });

    }
}