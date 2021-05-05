package com.betanzos.escuelait.mastermind;

public final class Attempt {

    private ProposedCombination combination;
    private MatchResult matchResult;

    public Attempt() {
        combination = new ProposedCombination();
    }

    public void requestCombination() {
        do {
            combination.read();
        } while (!combination.isValid());
    }

    public void validateMatches(SecretCombination secretCombination) {
        assert combination.isValid();
        matchResult = secretCombination.match(combination);
    }

    public boolean hasFourBlack() {
        assert matchResult != null;
        return matchResult.getBlacks() == 4;
    }

    public void print() {
        combination.print();
        new Console().write(" --> ");
        matchResult.print();
    }
}
