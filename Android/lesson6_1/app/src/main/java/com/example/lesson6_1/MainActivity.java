package com.example.lesson6_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button setBtn;
    private EditText editValue;

    private DBhelper dBhelper;

    private RecyclerView valueView;
    private  ValueAdapter valueAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setBtn = findViewById(R.id.setBtn);
        setBtn.setOnClickListener(this);
        editValue = findViewById(R.id.editValue);


        // setup the Db
        dBhelper = new DBhelper(MainActivity.this);


        // arreylist to fill into content
        ArrayList <ValueBean> valueBeans = new ArrayList<ValueBean>();

        valueBeans=  dBhelper.getValue(valueBeans);


       // setup for the  RecyclerView

        valueView = findViewById(R.id.showValue);


        valueView.setLayoutManager( new LinearLayoutManager(this));


        //ValueAdapter valueAdapter = new ValueAdapter();
         valueAdapter = new ValueAdapter(valueBeans);

        valueView.setAdapter(valueAdapter);

    }

    @Override
    public void onClick(View v) {
        Log.d("Set", "onClick: ");


        //boolean status = dBhelper.addValue("FirstValue", "Something longer");

        boolean status = dBhelper.addValue("FirstValue", editValue.getText().toString());

        Toast.makeText(this, "Value was added?: " + status, Toast.LENGTH_SHORT).show();

        // only for testing, never do a SELECT ALL
       // dBhelper.wholeTable();



    }
}