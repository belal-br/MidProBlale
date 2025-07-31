package com.example.midproblale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buy1 = findViewById(R.id.but_buycar1);
        Button buy2 = findViewById(R.id.but_buycar2);
        Button buy3 = findViewById(R.id.but_buycar3);
        Button setting = findViewById(R.id.but_setting);
        Button sales = findViewById(R.id.but_sales);


        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Buy Rolls Royce",Toast.LENGTH_LONG).show();
            }
        });
        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Buy Ford Mustang",Toast.LENGTH_LONG).show();
            }
        });
        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Buy Tesla",Toast.LENGTH_LONG).show();
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Setting.class);
                startActivity(i);
            }
        });
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SalesCar.class);
                startActivity(i);
            }
        });

    }
}