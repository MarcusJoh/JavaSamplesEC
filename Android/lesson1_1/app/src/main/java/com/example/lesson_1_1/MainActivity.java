package com.example.lesson_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate: Not Hello world quite yet");
        TextView helloThere= (TextView) findViewById(R.id.hello);
        //TextView helloThere= findViewById(R.id.hello);
        helloThere.setText("Now its hello world");

    }
}