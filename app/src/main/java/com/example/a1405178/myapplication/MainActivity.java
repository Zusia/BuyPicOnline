package com.example.a1405178.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button regHome;
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regHome=(Button)findViewById(R.id.Customer);

        regHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Customer.class);
                startActivity(intent);
            }
        });

        b1=findViewById(R.id.Customer);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });
        b2=findViewById(R.id.Admin);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Customer.class);
                startActivity(intent);
            }
        });

        b3=findViewById(R.id.VArt);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Gallery.class);
                startActivity(intent);
            }
        });
        b4=findViewById(R.id.Contact);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ContactUs.class);
                startActivity(intent);
            }
        });
        b5=findViewById(R.id.Payment);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Payment.class);
                startActivity(intent);
            }
        });
        b6=findViewById(R.id.AboutUs);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent);
            }
        });
    }

    }
