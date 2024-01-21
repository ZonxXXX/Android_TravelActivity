package com.example.travelactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start1(View v){
        Intent intent = new Intent(this, Reastauront.class);
        startActivity(intent);
    }
    public void start2(View v){
        Intent intent = new Intent(this, Hotel.class);
        startActivity(intent);
    }
    public void start3(View v){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }
    public void start4(View v){
        Intent intent = new Intent(this, Lake.class);
        startActivity(intent);
    }
    public void start5(View v){
        Intent intent = new Intent(this, Mountain.class);
        startActivity(intent);
    }
}