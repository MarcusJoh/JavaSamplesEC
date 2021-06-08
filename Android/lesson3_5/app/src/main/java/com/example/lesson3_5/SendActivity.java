package com.example.lesson3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {

    TextView textName, textNumber, textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        textName = findViewById(R.id.textName);
        textNumber = findViewById(R.id.textNumber);
        textEmail = findViewById(R.id.textEmail);

        Intent intent = getIntent();
        /* String editNameValue = intent.getStringExtra("editName");

        Log.d("intent", "onCreate: " + editNameValue);*/


        Bundle editBundle = intent.getBundleExtra("editBundle");
        String editNameValue = editBundle.getString("editName");
        String editEmailValue = editBundle.getString("editEmail");
        String editNumberValue = editBundle.getString("editNumber");


        textName.setText(editNameValue);

        textEmail.setText(editEmailValue);
        textNumber.setText(editNumberValue);


    }
}