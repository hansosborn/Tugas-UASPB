package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton gambar1 = (ImageButton) findViewById(R.id.gambar1);
        ImageButton gambar2 = (ImageButton) findViewById(R.id.gambar2);
        ImageButton gambar3 = (ImageButton) findViewById(R.id.gambar3);
        ImageButton gambar4 = (ImageButton) findViewById(R.id.gambar4);
        ImageButton wonderful = (ImageButton)  findViewById(R.id.wonderful);

        gambar1.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(intent);
            }
        });
        gambar2.setOnClickListener(new View.OnClickListener() {
                @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
                        startActivity(intent);
                    }
                });
        gambar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

        gambar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });

        wonderful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }
    }
