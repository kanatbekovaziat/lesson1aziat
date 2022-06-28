package com.example.leeson15m.model.view.Injector;

import com.example.leeson15m.presenter.Presenter;

public class Injector {

    public static Presenter getPresenter(){
        return new Presenter();
    }

}

