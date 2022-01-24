package com.example.a1405178.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Customer extends AppCompatActivity{
    EditText CName,CPhone,CAddress,CEmail;
    Button reg;
    Register Database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Database=new Register(this);
        CName =(EditText)   findViewById(R.id.name);
        CPhone = (EditText)findViewById(R.id.Phn);
        CAddress = (EditText)findViewById(R.id.Addr);
        CEmail = (EditText)findViewById(R.id.email);
        reg=(Button)findViewById(R.id.Reg);
        AddData();


    }
    public void AddData(){
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isinerted = Database.insertData(CName.getText().toString(),CAddress.getText().toString(),CPhone.getText().toString(),CEmail.getText().toString());
                if (isinerted == true)
                    Toast.makeText(Customer.this,"Text Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Customer.this,"Text Not Inserted",Toast.LENGTH_LONG).show();
            }
        });
    }



}
