package com.example.farmbb;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    Button DoubleRoom;
    Button Barn;
    Button Hut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookpage);

        DoubleRoom = (Button) findViewById(R.id.DoubleRoom);


        DoubleRoom.setOnClickListener(new View.OnClickListener(){
         @Override
            public void onClick(View v){
            Intent Loadpage = new Intent(MainActivity2.this, doubleRoom.class);
            startActivity(Loadpage);
        }

        });

        Barn = (Button) findViewById(R.id.Barn);

        Barn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Loadpage = new Intent(MainActivity2.this, Barn.class);
                startActivity(Loadpage);
            }
        });

        Hut = (Button) findViewById(R.id.ShepherdsHut);

        Hut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loadpage = new Intent(MainActivity2.this, shepherdshut.class);
                startActivity(Loadpage);

            }
        });


    }
}