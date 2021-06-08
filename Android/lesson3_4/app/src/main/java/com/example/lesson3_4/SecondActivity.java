package com.example.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle SEC", "onStart invoked ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle SEC", "onResume invoked ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle SEC", "onPause invoked ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle SEC", "onStop invoked ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle SEC", "onRestart invoked ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle SEC", "onDestroy invoked ");
    }

    public void onClick(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // if activity is in the stack call it
        startActivity(intent);


    }


}