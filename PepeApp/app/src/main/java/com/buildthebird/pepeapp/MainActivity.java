package com.buildthebird.pepeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void analogChanged(View view)
    {
        //read the "Look" and "Lean" progress bar, and send position value across bluetooth
        //this would also be used to sample analog X/Y coordinates from controllers
    }

}
