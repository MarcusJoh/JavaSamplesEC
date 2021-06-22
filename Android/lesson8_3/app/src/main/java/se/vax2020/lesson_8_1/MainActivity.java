package se.vax2020.lesson_8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button readBtn;
    private EditText editRead;
    TextToSpeech toSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editRead = findViewById(R.id.editRead);
        readBtn = findViewById(R.id.readBtn);


        readBtn.setOnClickListener(this);

        toSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                try {
                    toSpeech.setLanguage(new Locale("sv", "SE"));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("speak", "onInit: " + TextToSpeech.ERROR);
                }
            }
        });

    }

    @Override
    public void onClick(View v) {


        String toRead = editRead.getText().toString();

        toSpeech.speak(toRead, TextToSpeech.QUEUE_FLUSH, null);


    }

    @Override
    protected void onStop() {
        super.onStop();
        toSpeech.stop();
        toSpeech.shutdown();
    }
}