package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Finall_upload_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finall_upload_screen);

        getSupportActionBar().setTitle("Uploaded successfully");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}