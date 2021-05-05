package com.betanzos.escuelait.mastermind;

public abstract class Combination {

    protected final static int NUM_COLORS = 4;

    private Color[] colors;
    private int lastColor;

    public Combination() {
        colors = new Color[NUM_COLORS];
        lastColor = -1;
    }

    protected void addColor(Color color) {
        assert color != null;

        if (isComplete()) {
            return;
        }

        colors[++lastColor] = color;
    }

    protected boolean isComplete() {
        return lastColor == NUM_COLORS - 1;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (var color : colors) {
            sb.append(color.getSymbol());
        }
        new Console().write(sb.toString());
    }

    protected Color getColor(int i) {
        assert i >= 0 && i < NUM_COLORS;
        return colors[i];
    }

    protected boolean contains(Color color) {
        assert color != null;
        int i = 0;
        boolean found = false;
        while (!found && i < lastColor + 1) {
            found = colors[i++] == color;
        }

        return found;
    }
}