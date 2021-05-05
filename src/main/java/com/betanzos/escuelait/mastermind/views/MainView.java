package com.betanzos.escuelait.mastermind.views;

import com.betanzos.escuelait.mastermind.models.Game;

public final class MainView extends ConsoleView {

    public void show() {
        do {
            new GameView(new Game()).show();
        } while (isResumed());

        console.writeln("\nGOOD BYE!!!");
    }

    private boolean isResumed() {
        String answer;
        do {
            answer = console.readString("RESUME? (y/n): ");
        } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

        return answer.equalsIgnoreCase("y");
    }
}
