package com.betanzos.escuelait.mastermind.views.console;

import com.betanzos.escuelait.mastermind.utils.Console;
import com.betanzos.escuelait.mastermind.views.GoodbyeView;

public final class ConsoleGoodbyeView implements GoodbyeView {

    @Override
    public void show() {
        Console.IO.writeln("\nGOOD BYE!!!");
    }
}
