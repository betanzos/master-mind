package com.betanzos.escuelait.mastermind.views.console;

import com.betanzos.escuelait.mastermind.models.Game;
import com.betanzos.escuelait.mastermind.views.MainView;

public final class ConsoleMainView extends MainView {

    public ConsoleMainView() {
        super(new ConsoleGameView(new Game()), new ConsoleResumeView(), new ConsoleGoodbyeView());
    }
}
