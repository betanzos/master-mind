package com.betanzos.escuelait.mastermind.views;

import com.betanzos.escuelait.mastermind.utils.Console;

public abstract class ConsoleView {

    protected final Console console;

    public ConsoleView() {
        console = new Console();
    }
}
