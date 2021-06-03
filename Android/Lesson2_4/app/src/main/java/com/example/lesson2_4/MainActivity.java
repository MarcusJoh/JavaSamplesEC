package com.example.lesson2_4;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor sensor;
    private TextView Xtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Xtext= findViewById(R.id.TextX);


        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        Log.d("ACC", "onSensorChanged: ");
         // kolla om en Acl finns.
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            double Xval=event.values[0];
            Xtext.setText( String.valueOf(Xval));

        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}