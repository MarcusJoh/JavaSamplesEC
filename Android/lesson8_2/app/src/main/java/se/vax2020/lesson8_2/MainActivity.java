package se.vax2020.lesson8_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.RecognizerResultsIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button speakBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speakBtn = findViewById(R.id.speakBtn);

        speakBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

        startActivityForResult(intent, 0);








    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==0 && resultCode== RESULT_OK){
            ArrayList <String> results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

            Log.d("speak", "onActivityResult: " +results.get(0));


        }


    }
}