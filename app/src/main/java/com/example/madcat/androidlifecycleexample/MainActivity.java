package com.example.madcat.androidlifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ServerConnector connector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connector = new ServerConnector();
    }

    @Override
    protected void onStart() {
        super.onStart();

        connector.connect();
    }

    @Override
    protected void onStop() {
        super.onStop();

        connector.disconnect();
    }
}
