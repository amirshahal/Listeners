package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_example);
        button.setOnClickListener(this);

        /*
        Button button = findViewById(R.id.button_example);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked",
                        Toast.LENGTH_LONG).show();
            }
        });

         */
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_example)
        Toast.makeText(getApplicationContext(), "CLICKED",
                Toast.LENGTH_LONG).show();

    }
}