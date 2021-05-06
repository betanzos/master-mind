package com.betanzos.escuelait.mastermind.views.console;

import com.betanzos.escuelait.mastermind.types.Color;
import com.betanzos.escuelait.mastermind.models.Combination;
import com.betanzos.escuelait.mastermind.utils.Console;

public final class ConsoleProposedCombinationView {

    public Combination getProposedCombination() {
        Combination combination = null;
        do {
            String combinationStr = Console.IO.readString("Propose a combination: ");

            if (validateProposedCombinationLength(combinationStr)) {
                combination = new Combination();
                char[] combinationSymbols = combinationStr.toCharArray();
                for (char symbol : combinationSymbols) {
                    Color color = Color.parseSymbol(symbol);
                    if (color == null) {
                        break;
                    }
                    combination.addColor(color);
                }

                if (!combination.isComplete()) {
                    Console.IO.writeln("Wrong colors, they must be: " + Color.getAllowedSymbolsString());
                }
            }
        } while (combination == null || !combination.isComplete());

        return combination;
    }

    private boolean validateProposedCombinationLength(final String combinationStr) {
        if (combinationStr.length() != Combination.NUM_COLORS) {
            Console.IO.writeln("Wrong proposed combination length");
            return false;
        }
        return true;
    }
}