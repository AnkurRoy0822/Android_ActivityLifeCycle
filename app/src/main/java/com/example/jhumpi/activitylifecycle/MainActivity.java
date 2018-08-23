package com.example.jhumpi.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Life Cylce Demo";

    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate : Activity onCreate() called");

    }

    public void onStart(){
        super.onStart();

        Log.d(TAG,"onStart : Activity onStart() called");
    }

    public void onResume(){
        super.onResume();

        Log.d(TAG,"onResume : Activity onResume() called");
    }
    public void onPause(){
        super.onPause();

        Log.d(TAG,"onPause : Activity onPause() called");
    }
    public void onStop(){
        super.onStop();

        Log.d(TAG,"onStop : Activity onStop() called");
    }
    public void onDestroy(){
        super.onDestroy();

        Log.d(TAG,"onDestroy : Activity onDestroy() called");
    }
}
