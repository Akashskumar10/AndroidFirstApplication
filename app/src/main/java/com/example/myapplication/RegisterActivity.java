package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText c1, c2, c3, c4, c5, c6;
    AppCompatButton b1, b2;
    String getName, getAddress, getEmailID, getUserName, getPassword, getConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        c1 = (EditText) findViewById(R.id.name);
        c2 = (EditText) findViewById(R.id.address);
        c3 = (EditText) findViewById(R.id.eid);
        c4 = (EditText) findViewById(R.id.username);
        c5 = (EditText) findViewById(R.id.password);
        c6=(EditText)findViewById(R.id.cp);
        b1 = (AppCompatButton) findViewById(R.id.btn);
        b2 = (AppCompatButton) findViewById(R.id.btn3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = c1.getText().toString();
                getAddress = c2.getText().toString();
                getEmailID = c3.getText().toString();
                getUserName = c4.getText().toString();
                getPassword = c5.getText().toString();
                getConfirmPassword = c6.getText().toString();
                Toast.makeText(getApplicationContext(), "registration success", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}