package com.betanzos.escuelait.mastermind;

public final class Game {

    private final static int MAX_ATTEMPTS = 10;

    private SecretCombination secretCombination;
    private Attempt[] attempts;
    private int lastAttempt;

    private Console console;

    public Game() {
        console = new Console();

        secretCombination = new SecretCombination();
        attempts = new Attempt[MAX_ATTEMPTS];
        lastAttempt = -1;
    }

    public void start() {
        console.writeln("----- MASTERMIND -----");
        do {
            print();
            Attempt attempt = new Attempt();
            attempts[++lastAttempt] = attempt;
            attempt.requestCombination();
            attempt.validateMatches(secretCombination);
        } while (!isEnded());

        print();

        console.writeln();
        if (hasWon()) {
            console.writeln("You've won!!! ;-)");
        } else {
            console.writeln("You've lost!!! :-(");
        }
    }

    private boolean hasWon() {
        assert lastAttempt >= 0;
        return attempts[lastAttempt].hasFourBlack();
    }

    private void print() {
        console.writeln();
        console.writeln((lastAttempt + 1) + " attempt(s):");
        secretCombination.print();
        for (int i = 0; i <= lastAttempt; i++) {
            attempts[i].print();
        }
    }

    private boolean isEnded() {
        return hasWon() || lastAttempt == MAX_ATTEMPTS - 1;
    }
}
