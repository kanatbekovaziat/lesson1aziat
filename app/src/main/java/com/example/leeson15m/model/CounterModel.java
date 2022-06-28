package com.example.leeson15m.model;

import android.widget.Toast;

public class CounterModel {

    int counter = 0;

    public void increment(){
        counter++;
    }

    public void decrement(){
        counter--;
    }

    public int getCounter() {
        return counter;
    }

}
