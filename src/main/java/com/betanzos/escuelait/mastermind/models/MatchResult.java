package com.betanzos.escuelait.mastermind.models;

public final class MatchResult {

    private int blacks;
    private int whites;

    public MatchResult(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean hasFourBlack() {
        return blacks == 4;
    }

    @Override
    public String toString() {
        return blacks + " blacks and " + whites + " whites";
    }
}
