package com.example.women_safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button wom;
    private Button mess;
    private Button hostel;
    private Button hotel;
    private Button hospital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        wom = (Button)findViewById(R.id.women);
        wom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(HomePage.this, women.class);
                startActivity(int1);
            }
        });

        mess = (Button)findViewById(R.id.mbtn);
        hostel = (Button)findViewById(R.id.hbtn);
        hotel = (Button)findViewById(R.id.fbtn);
        hospital =(Button)findViewById(R.id.gbtn);

        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(HomePage.this, mess.class);
                startActivity(int2);
            }
        });
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(HomePage.this, hostel.class);
                startActivity(int3);

            }
        });

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(HomePage.this, hotel.class);
                startActivity(int4);
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(HomePage.this, hospital.class);
                startActivity(int5);
            }
        });


            }
}
