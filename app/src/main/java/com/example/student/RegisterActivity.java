package com.example.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
 EditText e1,e2,e3,e4,e5,e6,e7;
 AppCompatButton b2,b3;
 String getName,getAddress,getPhno,getEmail,getUsername,getPassword,getCpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText)findViewById(R.id.regname);
        e2=(EditText)findViewById(R.id.add);
        e3=(EditText)findViewById(R.id.phnum);
        e4=(EditText)findViewById(R.id.email);
        e5=(EditText)findViewById(R.id.username);
        e6=(EditText)findViewById(R.id.password);
        e7=(EditText)findViewById(R.id.cpassword);
        b2=(AppCompatButton)findViewById(R.id.reg);
        b3=(AppCompatButton)findViewById(R.id.gotologin);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                getAddress=e2.getText().toString();
                getPhno=e3.getText().toString();
                getEmail=e4.getText().toString();
                getUsername=e5.getText().toString();
                getPassword=e6.getText().toString();
                getCpassword=e7.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPhno,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getCpassword,Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });





    }
}