package com.betanzos.escuelait.mastermind;

public final class MatchResult {

    private int blacks;
    private int whites;

    public MatchResult(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
    }

    public int getBlacks() {
        return blacks;
    }

    public void print() {
        new Console().writeln(blacks + " blacks and " + whites + " whites");
    }
}
