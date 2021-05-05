package com.betanzos.escuelait.mastermind.views;

import com.betanzos.escuelait.mastermind.models.Game;

public final class GameView extends ConsoleView {

    private final ProposedCombinationView proposedCombinationView;
    private final Game game;

    public GameView(Game game) {
        assert game != null;
        this.game = game;
        proposedCombinationView = new ProposedCombinationView();
    }

    public void show() {
        console.writeln("----- MASTERMIND -----");

        do {
            printGame();
            var proposedCombination = proposedCombinationView.getProposedCombination();
            game.recordAttempt(proposedCombination);
        } while (!game.isEnded());

        printGame();

        if (game.hasWon()) {
            console.writeln("\nYou've won!!! ;-)");
        } else {
            console.writeln("\nYou've lost!!! :-(");
        }
    }

    private void printGame() {
        console.writeln("\n" + game.totalAttempts() + " attempt(s):");
        console.writeln(game.getSecretCombinationAsString());
        for (int i = 0; i < game.totalAttempts(); i++) {
            console.writeln(game.getAttemptAsString(i));
        }
    }
}
