package com.example.women_safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Submit = (Button)findViewById(R.id.sbtbtn);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sbt();
            }
        });

    }
    private void sbt()
    {
        Intent intent = new Intent(signup.this, MainActivity.class);
        startActivity(intent);
    }
}
