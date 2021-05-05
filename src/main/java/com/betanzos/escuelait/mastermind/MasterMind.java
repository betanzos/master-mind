package com.betanzos.escuelait.mastermind;

import com.betanzos.escuelait.mastermind.views.MainView;

public final class MasterMind {

    private MainView mainView;

    private MasterMind() {
        mainView = new MainView();
    }

    public void play() {
        mainView.show();
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }
}
