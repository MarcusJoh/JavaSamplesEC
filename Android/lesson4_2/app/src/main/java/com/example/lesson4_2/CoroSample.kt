package com.example.lesson4_2

import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroSample {
  
    companion object {
        fun coro() = runBlocking {
            launch { // launch a new coroutine
                //   delay(5000) // delay for 5 seconds (default time is ms)
                Log.d("kotlin", getWorld())
            }
            Log.d("kotlin", "Hello") // this is outside the of async
        }


        suspend fun getWorld(): String {
            delay(1000)
            return "world"
        }


        fun setWorld(textView: TextView) = runBlocking {


            launch {
                //  Log.d("kotlin", "getWorld: "+getVal())
                textView.text = getWorld()
            }

        }

        fun coroAsync() = runBlocking {

            suspend fun doSomething(): Int {
                delay(3000L) // something that takes time
                return 13
            }


            val time = measureTimeMillis {
                val one = async { doSomething() }

                Log.d("Kotlin", ":  ${one.await()}") // wait for the answer
            }
            Log.d("Kotlin", "took $time ms")

        }






    }









}
// dont forget to add
/*
dependencies {

    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlin_version"
}
 to ge gradle
*/