package com.example.leeson15m.model.view;

public class Contract {

    public interface CounterView{
        void updateText(int count);

        void showFirstToast();

        void showToast(int green);
    }

}
