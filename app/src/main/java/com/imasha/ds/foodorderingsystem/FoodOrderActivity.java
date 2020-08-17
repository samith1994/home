package com.imasha.ds.foodorderingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodOrderActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button addCartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");

        addCartBtn = findViewById(R.id.add_cart_btn);
        addCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkoutIntent = new Intent(FoodOrderActivity.this, CheckoutActivity.class);
                startActivity(checkoutIntent);
            }
        });
    }
}
