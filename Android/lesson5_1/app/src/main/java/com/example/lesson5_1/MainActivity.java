package com.example.lesson5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnGo, btnStop;
    private TextView serviceStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnGo = findViewById(R.id.btn_go);
        btnStop = findViewById(R.id.btn_stop);
        serviceStatus = findViewById(R.id.statusText);

// more ways to make onClicks
        btnGo.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if (v == btnGo && !isPlayServiceRunning()) {
            Log.d("btn", "onClick: GO" + isPlayServiceRunning());
            startService(new Intent(this, PlayService.class));


        } else if (v == btnStop && isPlayServiceRunning()) {
            Log.d("btn", "onClick: STOP");
            stopService(new Intent(new Intent(this, PlayService.class)));
        }


    }

    private boolean isPlayServiceRunning() {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (PlayService.class.getName().equals(service.service.getClassName())) {
                serviceStatus.setText("OFF");
                return true;
            }
        }
        serviceStatus.setText("ON");
        return false;
    }
}