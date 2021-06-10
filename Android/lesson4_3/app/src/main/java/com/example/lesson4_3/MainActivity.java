package com.example.lesson4_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView setText;
    Button setBtn;
    EditText editSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setText = findViewById(R.id.setText);
        setBtn = findViewById(R.id.button);
        editSet = findViewById(R.id.editSet);

        setBtn.setOnClickListener(this::onClick);
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        setText.setText(sharedPreferences.getString("setText","Nothing fund"));

    }

    private void onClick(View view) {

        setText.setText(editSet.getText());
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("setText",setText.getText().toString());
        editor.apply();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // save stuff
        outState.putString("setText", setText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //Get what is saved
        setText.setText(savedInstanceState.getString("setText"));
    }


}