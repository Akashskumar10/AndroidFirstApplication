package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText c1,c2;
    AppCompatButton b1,b2;
    String getUserName,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(EditText)findViewById(R.id.username);
        c2=(EditText)findViewById(R.id.password);
        b1=(AppCompatButton)findViewById(R.id.button);
        b2=(AppCompatButton)findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getUserName=c1.getText().toString();
                getPassword=c2.getText().toString();
                Toast.makeText(getApplicationContext(),getUserName,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);

            }
        });
    }
}