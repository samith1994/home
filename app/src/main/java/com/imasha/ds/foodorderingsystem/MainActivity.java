package com.imasha.ds.foodorderingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    LinearLayout sampleOne;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Burger Bump");

        sampleOne = findViewById(R.id.sample_one);
        sampleOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent checkoutIntent = new Intent(MainActivity.this, FoodOrderActivity.class);
                startActivity(checkoutIntent);
            }
        });


    }
}
