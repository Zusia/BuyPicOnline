package com.example.a1405178.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gallery extends AppCompatActivity {

    TextView t1,t2;
    ImageButton im1,im2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        im1=(ImageButton)findViewById(R.id.image1);
        im2=(ImageButton)findViewById(R.id.image2);

    }

}
