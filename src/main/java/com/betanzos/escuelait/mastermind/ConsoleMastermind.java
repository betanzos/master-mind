package com.betanzos.escuelait.mastermind;

import com.betanzos.escuelait.mastermind.views.console.ConsoleMainView;

public class ConsoleMastermind extends Mastermind {

    private ConsoleMastermind() {
        super(new ConsoleMainView());
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
