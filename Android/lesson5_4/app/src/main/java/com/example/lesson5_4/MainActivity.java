package com.example.lesson5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCloud;
    private TextView cloudLimit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cloudLimit = findViewById(R.id.cloudLimit);
        btnCloud = findViewById(R.id.button);
        btnCloud.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        String getURL = "https://api.openweathermap.org/data/2.5/weather?q=malmo,se&APPID=099eff339f56d6a29a9823857b2f2671&mode=json";


        RequestQueue queue = Volley.newRequestQueue(this);

      /*  Strings for testing
      StringRequest stringRequest = new StringRequest(Request.Method.GET, getURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("volley", "onResponse: "+response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                cloudLimit.setText("That didn't work!");
                Log.d("volley", "onErrorResponse: "+error);
            }
        });*/


        JsonObjectRequest JsonRequest = new JsonObjectRequest(Request.Method.GET, getURL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {


                        Log.d("volley", "onResponse: " + response.toString());

                        try {
                            JSONArray weather = response.getJSONArray("weather");
                            Log.d("volley", "onResponse: " + weather.toString());
                            for (int i = 0; i < weather.length(); i++) {

                                JSONObject weatherJSONObject = weather.getJSONObject(i); // its only 0 long
                                Log.d("volley", "onResponse: " +  weatherJSONObject.getString("description"));
                                cloudLimit.setText(weatherJSONObject.getString("description"));

                            }





                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                cloudLimit.setText("That didn't work!");
                Log.d("volley", "onErrorResponse: " + error);
            }
        });

// Add the request to the RequestQueue.
        queue.add(JsonRequest);


        Log.d("btn", "onClick: ");

    }
}