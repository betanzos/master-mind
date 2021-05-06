package com.betanzos.escuelait.mastermind.types;

public enum Color {
    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PURPLE('p');

    private char symbol;


    Color(char symbol) {
        this.symbol = symbol;
    }

    public static Color parseSymbol(char symbol) {
        for (Color color : values()) {
            if (color.symbol == symbol) {
                return color;
            }
        }

        return null;
    }

    public static String getAllowedSymbolsString() {
        StringBuilder sb = new StringBuilder();
        for (Color color : values()) {
            sb.append(color.symbol);
        }
        return sb.toString();
    }

    public char getSymbol() {
        return symbol;
    }
}
