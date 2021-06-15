package com.example.lesson5_2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Date;



public class TimeService extends Service {

    private final IBinder timeBinder = new TimeBinder();


    public TimeService() {

    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return timeBinder;
    }

    public class TimeBinder extends Binder {
        TimeService getService() {
            return TimeService.this;
        }
    }


    public String getCurrentTime() {


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String currentDate = simpleDateFormat.format(new Date());
        return currentDate;
    }


}