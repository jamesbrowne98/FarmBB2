package com.example.farmbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doubleRoom extends AppCompatActivity {

    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_room);

        book = (Button) findViewById(R.id.Book1);

        book.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent signUp = new Intent(doubleRoom.this, pay.class);
                startActivity(signUp);

            }

        });

    }
}