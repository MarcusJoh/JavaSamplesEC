package com.example.lesson2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* public void btn2(View view) {
         Log.d("btn2", "btn2: hello from the button");

     }*/
    public void onClick(View view) {

        Log.d("onClick", "onClick:" + view.getId());
        //view.getId();
        switch (view.getId()){
            case R.id.button3:
                Log.d("onClick", "btn 3");
                break;
            case R.id.button5:
                Log.d("onClick", "btn 5");
                break;
        }




    }
}