package com.example.lesson3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editName, editEmail, editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editTextTextPersonName);
        editEmail = findViewById(R.id.editTextTextEmailAddress);
        editNumber = findViewById(R.id.editTextPhone);

    }

    public void onClick(View view) {

// send name
    /*    Intent intent = new Intent(this, SendActivity.class);
        String editNameValue = editName.getText().toString();
        intent.putExtra("editName", editNameValue);
        startActivity(intent);*/

        Intent intent = new Intent(this, SendActivity.class);


        String editNameValue = editName.getText().toString();
        String editEmailValue = editEmail.getText().toString();
        String editNumberValue = editNumber.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("editName", editNameValue);
        bundle.putString("editEmail", editEmailValue);
        bundle.putString("editNumber", editNumberValue);

        intent.putExtra("editBundle", bundle);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // kill the old act
        startActivity(intent);

      // change the standard Transition
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
}