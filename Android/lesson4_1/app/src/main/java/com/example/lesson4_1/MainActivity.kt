package com.example.lesson4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //vars
        // val = static
        // var = can change

        val STATIC_NUMBER: Int = 42

        // STATIC_NUMBER=32; // does not work

        var normalInt: Int = 32
        normalInt = 43; // ; can be used, but does nothing


        //  var sampleString: String= null // does not work, null cant be set normally
        var otherSting: String? = null // makes the var nullable


        Log.d("Kotlin", STATIC_NUMBER.toString() + " " + normalInt + "" + otherSting)

        //  Log.d("Kotlin", "$STATIC_NUMBER $normalInt$otherSting")

        if (normalInt > 32) {
            Log.d("Kotlin", "IF is the same as normal ")
        }

        // statements can be done as expressions similar to JS

        val ifAsExpress: String = if (normalInt > 32) {
            "if"
        } else {
            "else"
        }
        // want works with more "complex" statements

        Log.d("Kotlin", ifAsExpress)








        logValue()

        Log.d("Kotlin", "onCreate: " + makeLog())


        val sampleClass = SampleClass()
        sampleClass.HELLO_STRING
//object are a bit like in JS
        Log.d("Kotlin", "onCreate: " + sampleObject.dogName)
        sampleObject.dogName = "billy"
// and as with js object are a live
        Log.d("Kotlin", "onCreate: " + sampleObject.dogName)


        var helloText:TextView= findViewById(R.id.helloText)

        helloText.text="Hello from Kotlin"

    }



    //methods are a bit like JS function
    private fun logValue() {
        Log.d("Kotlin", "logValue: ")
    }
    private fun makeLog(): String {
        return "return val"

    }

}

