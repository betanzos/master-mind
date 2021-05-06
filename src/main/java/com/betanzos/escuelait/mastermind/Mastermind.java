package com.betanzos.escuelait.mastermind;

import com.betanzos.escuelait.mastermind.views.MainView;

public abstract class Mastermind {

    private MainView mainView;

    protected Mastermind(MainView mainView) {
        assert mainView != null;
        this.mainView = mainView;
    }

    public void play() {
        do {
            mainView.start();
        } while (mainView.resume());

        mainView.sayGoodBye();
    }
}
