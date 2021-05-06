package com.betanzos.escuelait.mastermind.models;

public final class Game {

    private final static int MAX_ATTEMPTS = 10;

    private SecretCombination secretCombination;
    private Attempt[] attempts;
    private int lastAttempt;

    public Game() {
        secretCombination = new SecretCombination();
        attempts = new Attempt[MAX_ATTEMPTS];
        lastAttempt = -1;
    }

    public boolean hasWon() {
        assert lastAttempt >= 0;
        return attempts[lastAttempt].hasFourBlack();
    }

    public boolean isEnded() {
        return hasWon() || lastAttempt == MAX_ATTEMPTS - 1;
    }

    public int totalAttempts() {
        return lastAttempt + 1;
    }

    public String getSecretCombinationAsString() {
        return secretCombination.toString();
    }

    public String getAttemptAsString(int i) {
        assert i >= 0 && i <= lastAttempt;
        return attempts[i].toString();
    }

    public void recordAttempt(Combination proposedCombination) {
        Attempt attempt = new Attempt(proposedCombination, secretCombination);
        attempts[++lastAttempt] = attempt;
    }
}
