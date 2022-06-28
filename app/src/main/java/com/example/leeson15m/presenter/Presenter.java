package com.example.leeson15m.presenter;

import android.graphics.Color;

import com.example.leeson15m.model.CounterModel;
import com.example.leeson15m.model.view.Contract;

public class Presenter {

    CounterModel model = new CounterModel();
    Contract.CounterView counterView;

public void modelIncrement(){
    model.increment();
    counterView.updateText(model.getCounter());
    if (model.getCounter() == 10){
        counterView.showFirstToast();
    }if (model.getCounter() == 15){
        counterView.showToast(Color.GREEN);
    }
}

    public void modelDecrement(){
        model.decrement();
        counterView.updateText(model.getCounter());
    }


    public void attach(Contract.CounterView view){
    this.counterView = view;
    }

}
