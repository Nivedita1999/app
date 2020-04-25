package com.example.women_safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class rate extends AppCompatActivity {

    public Button ty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ty =(Button)findViewById(R.id.subty);
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1= new Intent(rate.this, thanks.class);
                startActivity(int1);
            }
        });
    }
}
