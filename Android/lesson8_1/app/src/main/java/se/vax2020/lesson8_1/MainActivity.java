package se.vax2020.lesson8_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseDatabase database;

    private TextView valueText;
    private Button setBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        valueText = findViewById(R.id.valueText);
        setBtn = findViewById(R.id.setBtn);
        setBtn.setOnClickListener(this);



        database = FirebaseDatabase.getInstance();

      // pointer to what to change/get
        DatabaseReference reference = database.getReference("Value");

        //reference.setValue("Hej");



        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                String getValue = String.valueOf(snapshot.getValue());
                Log.d("fBase", "onDataChange: "+ getValue);

                valueText.setText(getValue);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.d("fBase", "onCancelled: " + error);

            }
        });





    }

    @Override
    public void onClick(View v) {

        DatabaseReference reference = database.getReference("Value");

        reference.setValue("Hej från knappen");


        // Ref for the main path, child for the sub paths
         reference = database.getReference("Values").child("first");
         reference.setValue("newValue");





    }
}