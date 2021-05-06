package com.betanzos.escuelait.mastermind.models;

public final class Attempt {

    private Combination combination;
    private MatchResult matchResult;

    public Attempt(Combination combination, SecretCombination secretCombination) {
        assert combination != null && combination.isComplete();
        this.combination = combination;
        matchResult = secretCombination.match(combination);
    }

    public boolean hasFourBlack() {
        assert matchResult != null;
        return matchResult.hasFourBlack();
    }

    @Override
    public String toString() {
        return combination.toString() + " --> " + matchResult.toString();
    }
}
