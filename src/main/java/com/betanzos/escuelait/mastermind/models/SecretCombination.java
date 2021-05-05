package com.betanzos.escuelait.mastermind.models;

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

    public MatchResult match(Combination combination) {
        assert combination != null && combination.isComplete();

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

    @Override
    public String toString() {
        return "x".repeat(Combination.NUM_COLORS);
    }
}