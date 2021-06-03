package com.example.lesson2_2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* detta skriver över tidigare views
        TextView newText = new TextView(this);


        newText.setText("Text från koden");

        setContentView(newText);
*/

        TextView newText2 = new TextView(this);

        newText2.setText("Text från koden på bättre vis");

        ConstraintLayout layout = findViewById(R.id.layoutMain);

        layout.addView(newText2);

        for (int i = 0; i < 10; i++) {

            TextView newTextLoop = new TextView(this);
            newTextLoop.setText("Text" + i);
            layout.addView(newTextLoop);
// inte så passade i en ConstraintLayout
        }


// man kan andra design från java
        layout.setBackgroundColor(Color.RED);
// bättre men funkar inte jellybean
     /*   if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            layout.setBackgroundColor(getColor(R.color.purple_200));
        }*/
    }

}