package com.example.lesson5_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNote= findViewById(R.id.button);
        btnNote.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        startService();

    }

    public void startService() {
        Intent intent  = new Intent(this, ForegrundService.class);
        ContextCompat.startForegroundService(this,intent);

    }
}