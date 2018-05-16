package com.example.madcat.androidlifecycleexample;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class ServerConnector implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void connect(){
        Log.d("Test", "server connected");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disconnect(){
        Log.d("Test", "server disconnected");
    }
}
