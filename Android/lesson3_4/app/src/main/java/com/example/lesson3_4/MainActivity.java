package com.example.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle Main", "onResume invoked ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle Main", "onPause invoked ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle Main", "onStop invoked ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle Main", "onRestart invoked ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle Main", "onDestroy invoked ");
    }

    public void onClick(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);


    }
}