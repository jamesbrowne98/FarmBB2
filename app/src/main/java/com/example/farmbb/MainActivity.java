package com.example.farmbb;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button BookAccommodation;
    Button ManageBookings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       BookAccommodation = (Button) findViewById(R.id.BookAccommodation);

        BookAccommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent signUp = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(signUp);

           }


        });

        ManageBookings = (Button) findViewById(R.id.ManageBookings);

        ManageBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manage = new Intent(MainActivity.this, ManageBookingsActivity.class);
                startActivity(manage);
            }
        });
    }

}
