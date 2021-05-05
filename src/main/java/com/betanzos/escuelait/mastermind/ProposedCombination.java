package com.betanzos.escuelait.mastermind;

public final class ProposedCombination extends Combination {

    private Console console;

    public ProposedCombination() {
        console = new Console();
    }

    public void read() {
        do {
            String combinationStr = console.readString("Propose a combination: ");
            parseCombinationString(combinationStr);
        } while (!isValid());
    }

    private void parseCombinationString(String combinationStr) {
        assert combinationStr != null && !isValid();

        if (combinationStr.length() != Combination.NUM_COLORS) {
            console.writeln("Wrong proposed combination length");
            return;
        }

        char[] combinationSymbols = combinationStr.toCharArray();
        for (char symbol : combinationSymbols) {
            Color color = Color.parseSymbol(symbol);
            if (color == null) {
                break;
            }
            addColor(color);
        }

        if (!isValid()) {
            console.writeln("Wrong colors, they must be: " + Color.getAllowedSymbolsString());
        }
    }

    public boolean isValid() {
        return isComplete();
    }
}
