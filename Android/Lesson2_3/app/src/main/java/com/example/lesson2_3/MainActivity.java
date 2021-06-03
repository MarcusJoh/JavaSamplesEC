package com.example.lesson2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText vibNumber = findViewById(R.id.editTextNumber);
        Log.d("Vib", "onClick: " + vibNumber.getText());

        Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        int vibAsNum = Integer.parseInt(vibNumber.getText().toString());
        vib.vibrate(vibAsNum);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vib.vibrate(VibrationEffect.createOneShot(vibAsNum, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            vib.vibrate(vibAsNum);
        }
    }


}