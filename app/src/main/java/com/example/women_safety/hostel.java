package com.example.women_safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hostel extends AppCompatActivity {

    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);
    btn1 = (Button)findViewById(R.id.btn1);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent int1= new Intent(hostel.this, hostel2.class);
            startActivity(int1);
        }
    });
    }
}
