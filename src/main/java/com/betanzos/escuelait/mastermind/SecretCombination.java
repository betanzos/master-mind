package com.betanzos.escuelait.mastermind;

import java.util.Random;

public final class SecretCombination extends Combination {

    public SecretCombination() {
        Random r = new Random();
        Color[] colors = Color.values();
        while (!isComplete()) {
            Color color = colors[r.nextInt(colors.length)];
            if (!contains(color)) {
                addColor(color);
            }
        }
    }

    @Override
    public void print() {
        Console console = new Console();
        console.write("x".repeat(Combination.NUM_COLORS));
        console.writeln();
    }

    public MatchResult match(ProposedCombination combination) {
        assert combination != null && combination.isValid();

        int blacks = 0;
        int whites = 0;

        for (int i = 0; i < Combination.NUM_COLORS; i++) {
            Color color = combination.getColor(i);
            if (color == getColor(i)) {
                blacks++;
            } else if (contains(color)) {
                whites++;
            }
        }

        return new MatchResult(blacks, whites);
    }
}