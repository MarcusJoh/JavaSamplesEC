package com.example.lesson4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView setText;
 Button setBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setText= findViewById(R.id.setText);
        setBtn= findViewById(R.id.button);

        setBtn.setOnClickListener(this::onClick);



        String dogName = SampleObject.INSTANCE.getDogName();

        Log.d("kotlin", "onCreate: " + dogName);


        SampleObject.INSTANCE.setDogName("Jason");


        Log.d("kotlin", "onCreate: " + SampleObject.INSTANCE.getDogName());



        Log.d("kotlin", "onCreate: " + SampleObject.INSTANCE.runKot());

        CoroSample.Companion.coro();




        Log.d("kotlin", "Some other stuff");
    }



    public void onClick(View v) {
        Log.d("kotlin", "Click");

         CoroSample.Companion.setWorld(setText);


          Log.d("kotlin", "onCreate: " + CoroSample.Companion.coroAsync());
    }
}

