package com.example.women_safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class women extends AppCompatActivity {

    private Button rate;
    private Button loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        rate = (Button)findViewById(R.id.ratebtn);
        loc =(Button)findViewById(R.id.locbtn);

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(women.this, rate.class);
                startActivity(int1);
            }
        });

        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(women.this, loc.class);
                startActivity(int2);
            }
        });
    }
}
