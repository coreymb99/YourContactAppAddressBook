package com.example.yourcontactsapp_addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate Button classes so I can associate them
        //with my button widgets

        //Declare both of my buttons to the proper id
        final Button btnCorey = (Button) findViewById(R.id.btnCorey);
        Button btnStacey = (Button) findViewById(R.id.btnStacey);

        //btnCorey
        btnCorey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Corey.class));

            } // end OnClick
        }); // end Corey

        //btnStacey
        btnStacey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Stacey.class));

            } // end OnClick
        }); // end Stacey




    } // end of OnCreate
} // end of MainActivity
