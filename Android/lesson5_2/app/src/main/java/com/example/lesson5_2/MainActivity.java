package com.example.lesson5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson5_2.TimeService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTime;
    private TextView timeView;
    TimeService timeService;
    boolean timeServiceBound = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = findViewById(R.id.getTime);
        timeView = findViewById(R.id.timeView);


        btnTime.setOnClickListener(this);


        Intent intent = new Intent(this, TimeService.class);

        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
        // automatically create the service as long as the binding exists.

    }

    @Override
    public void onClick(View v) {


        Log.d("btn", "onClick: " + timeServiceBound);
        if (timeServiceBound) {
            String curTime = timeService.getCurrentTime();

            timeView.setText(curTime);
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
        timeServiceBound = false;
    }


    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            TimeService.TimeBinder binder = (TimeService.TimeBinder) service;
            timeService = binder.getService();
            timeServiceBound = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

            timeServiceBound = false;
        }
    };


}