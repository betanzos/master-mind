package com.betanzos.escuelait.mastermind.views.console;

import com.betanzos.escuelait.mastermind.models.Game;
import com.betanzos.escuelait.mastermind.utils.Console;
import com.betanzos.escuelait.mastermind.views.GameView;

public final class ConsoleGameView implements GameView {

    private final ConsoleProposedCombinationView proposedCombinationView;
    private final Game game;

    public ConsoleGameView(Game game) {
        assert game != null;
        this.game = game;
        proposedCombinationView = new ConsoleProposedCombinationView();
    }

    @Override
    public void show() {
        Console.IO.writeln("----- MASTERMIND -----");

        game.init();
        do {
            printGame();
            var proposedCombination = proposedCombinationView.getProposedCombination();
            game.recordAttempt(proposedCombination);
        } while (!game.isEnded());

        printGame();

        if (game.hasWon()) {
            Console.IO.writeln("\nYou've won!!! ;-)");
        } else {
            Console.IO.writeln("\nYou've lost!!! :-(");
        }
    }

    private void printGame() {
        Console.IO.writeln("\n" + game.totalAttempts() + " attempt(s):");
        Console.IO.writeln(game.getSecretCombinationAsString());
        for (int i = 0; i < game.totalAttempts(); i++) {
            Console.IO.writeln(game.getAttemptAsString(i));
        }
    }
}
